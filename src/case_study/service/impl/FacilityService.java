package case_study.service.impl;

import case_study.exception.AreaException;
import case_study.exception.PriceException;
import case_study.exception.QuantityException;
import case_study.exception.TextFormatException;
import case_study.model.facilities.Facility;
import case_study.model.facilities.House;
import case_study.model.facilities.Room;
import case_study.model.facilities.Villa;
import case_study.service.IFacilityService;
import case_study.util.ReadWriteFacility;

import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private Scanner scanner = new Scanner(System.in);
    private static final String PATH_VILLA = "src/case_study/data/villa.csv";
    private static final String PATH_HOUSE = "src/case_study/data/house.csv";
    private static final String PATH_ROOM = "src/case_study/data/room.csv";

    public void inputFacility(Facility facility) {
        String serviceCode;
        while (true) {
            try {
                System.out.println("Input service code: ");
                serviceCode = scanner.nextLine();
                if (facility instanceof Villa) {
                    if (!serviceCode.matches("^SVVL-\\d{4}$")) {
                        throw new TextFormatException("The service code is invalid, " +
                                "please enter it in the format SVVL-YYYY (where Y is a number from 0-9)!");
                    }
                } else if (facility instanceof House) {
                    if (!serviceCode.matches("^SVHO-\\d{4}$")) {
                        throw new TextFormatException("The service code is invalid, " +
                                "please enter it in the format SVHO-YYYY (where Y is a number from 0-9)!");
                    }
                } else if (facility instanceof Room) {
                    if (!serviceCode.matches("^SVRO-\\d{4}$")) {
                        throw new TextFormatException("The service code is invalid, " +
                                "please enter it in the format SVRO-YYYY (where Y is a number from 0-9)!");
                    }
                }
                facility.setServiceCode(serviceCode);
                break;
            } catch (TextFormatException e) {
                System.err.println(e.getMessage());
            }
        }

        String nameOfService;
        while (true) {
            try {
                System.out.println("Input name of service: ");
                nameOfService = scanner.nextLine();
                if (!nameOfService.matches("^[A-Z]\\w*( \\w)*$")) {
                    throw new TextFormatException("The name of service is invalid, please enter it with uppercase first character!");
                }
                facility.setNameOfService(nameOfService);
                break;
            } catch (TextFormatException e) {
                System.err.println(e.getMessage());
            }
        }

        float area;
        while (true) {
            try {
                System.out.println("Input area:");
                area = Float.parseFloat(scanner.nextLine());
                if (area < 30) {
                    throw new AreaException("Usable area must be greater than 30m2, please re-enter area! ");
                }
                facility.setArea(area);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number!");
            } catch (AreaException e) {
                System.err.println(e.getMessage());
            }
        }

        float price;
        while (true) {
            try {
                System.out.println("Input price:");
                price = Float.parseFloat(scanner.nextLine());
                if (price < 0) {
                    throw new PriceException("The rental cost must be greater than 0, please re-enter price!");
                }
                facility.setPrice(price);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number!");
            } catch (PriceException e) {
                System.err.println(e.getMessage());
            }
        }

        int maxPeople;
        while (true) {
            try {
                System.out.println("input max people:");
                maxPeople = Integer.parseInt(scanner.nextLine());
                if (maxPeople < 0 || maxPeople > 20) {
                    throw new QuantityException("Number of people must be greater than 0 and less than 20");
                }
                facility.setMaxPeople(maxPeople);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number!");
            } catch (QuantityException e) {
                System.err.println(e.getMessage());
            }
        }

        String typeOfRent;
        while (true) {
            try {
                System.out.println("Input type of rent: ");
                typeOfRent = scanner.nextLine();
                if (!typeOfRent.matches("^[A-Z]\\w*( \\w)*$")) {
                    throw new TextFormatException("The type of rent is invalid, please enter it with uppercase first character!");
                }
                facility.setTypeOfRent(typeOfRent);
                break;
            } catch (TextFormatException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    @Override
    public void display() {
        int choice;
        do {
            while (true){
                try {
                    System.out.println("Facility List:\n" +
                            "1. Villa\n" +
                            "2. House\n" +
                            "3. Room\n" +
                            "4. Return facility menu");
                    System.out.println("What Facility you want to show?");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e){
                    System.err.println("Please input number!");
                }
            }

            switch (choice){
                case 1:
                    Map<Facility, Integer> villaMap = ReadWriteFacility.readFacilityFile(PATH_VILLA);
                    if (villaMap.isEmpty()){
                        System.err.println("Villa list is empty!");
                    } else {
                        for (Facility villa : villaMap.keySet()){
                            System.out.println(villa + ", used: " + villaMap.get(villa));
                        }
                    }
                    break;
                case 2:
                    Map<Facility, Integer> houseMap = ReadWriteFacility.readFacilityFile(PATH_HOUSE);
                    if (houseMap.isEmpty()){
                        System.err.println("House list is empty!");
                    } else {
                        for (Facility house : houseMap.keySet()){
                            System.out.println(house + ", used: " + houseMap.get(house));
                        }
                    }
                    break;
                case 3:
                    Map<Facility, Integer> roomMap = ReadWriteFacility.readFacilityFile(PATH_ROOM);
                    if (roomMap.isEmpty()){
                        System.err.println("Room list is empty!");
                    } else {
                        for (Facility room : roomMap.keySet()){
                            System.out.println(room + ", used: " + roomMap.get(room));
                        }
                    }
                    break;
                case 4:
                    return;
                default:
                    System.err.println("Your choice is not exist, please re-enter your choice!");
            }
        } while (true);
    }

    @Override
    public void add(String type) {
        switch (type) {
            case "villa":
                Map<Facility, Integer> villaList = ReadWriteFacility.readFacilityFile(PATH_VILLA);
                Villa villa = new Villa();
                inputFacility(villa);

                String roomStandard;
                while (true) {
                    try {
                        System.out.println("Input room standard: ");
                        roomStandard = scanner.nextLine();
                        if (!roomStandard.matches("^[A-Z]\\w*( \\w)*$")) {
                            throw new TextFormatException("The room standard is invalid, please enter it with uppercase first character!");
                        }
                        villa.setRoomStandard(roomStandard);
                        break;
                    } catch (TextFormatException e) {
                        System.err.println(e.getMessage());
                    }
                }

                float poolArea;
                while (true) {
                    try {
                        System.out.println("Input area of pool:");
                        poolArea = Float.parseFloat(scanner.nextLine());
                        if (poolArea < 30) {
                            throw new AreaException("Pool area must be greater than 30m2, please re-enter area! ");
                        }
                        villa.setPoolArea(poolArea);
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println("Please enter a number!");
                    } catch (AreaException e) {
                        System.err.println(e.getMessage());
                    }
                }

                int floor;
                while (true) {
                    try {
                        System.out.println("Input floor:");
                        floor = Integer.parseInt(scanner.nextLine());
                        if (floor < 0) {
                            throw new PriceException("The floor must be greater than 0, please re-enter price!");
                        }
                        villa.setFloor(floor);
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println("Please enter a number!");
                    } catch (PriceException e) {
                        System.err.println(e.getMessage());
                    }
                }
                System.out.println(villa);
                villaList.put(villa, 0);
                ReadWriteFacility.writeFacilityFile(PATH_VILLA, villaList);
                System.out.println("add successfully!");
                break;
            case "house":
                Map<Facility, Integer> houseList = ReadWriteFacility.readFacilityFile(PATH_HOUSE);
                House house = new House();
                inputFacility(house);

                String room;
                while (true) {
                    try {
                        System.out.println("Input room standard: ");
                        room = scanner.nextLine();
                        if (!room.matches("^[A-Z]\\w*( \\w)*$")) {
                            throw new TextFormatException("The room standard is invalid, please enter it with uppercase first character!");
                        }
                        house.setRoomStandard(room);
                        break;
                    } catch (TextFormatException e) {
                        System.err.println(e.getMessage());
                    }
                }

                int floorHouse;
                while (true) {
                    try {
                        System.out.println("Input floor:");
                        floorHouse = Integer.parseInt(scanner.nextLine());
                        if (floorHouse < 0) {
                            throw new PriceException("The floor must be greater than 0, please re-enter price!");
                        }
                        house.setFloor(floorHouse);
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println("Please enter a number!");
                    } catch (PriceException e) {
                        System.err.println(e.getMessage());
                    }
                }
                houseList.put(house,0);
                ReadWriteFacility.writeFacilityFile(PATH_HOUSE, houseList);
                System.out.println("add successfully!");
                break;
            case "room":
                Map<Facility, Integer> roomList = ReadWriteFacility.readFacilityFile(PATH_ROOM);
                Room room1 = new Room();
                inputFacility(room1);

                System.out.println("input free service");
                String freeService = scanner.nextLine();
                room1.setFreeService(freeService);

                roomList.put(room1, 0);
                ReadWriteFacility.writeFacilityFile(PATH_ROOM, roomList);
                System.out.println("add successfully!");
                break;
        }
    }

    @Override
    public void displayMaintenanceFacility() {
        int choice;
        do {
            while (true){
                try {
                    System.out.println(" Maintenance Facility List:\n" +
                            "1. Villa\n" +
                            "2. House\n" +
                            "3. Room\n" +
                            "4. Return facility menu");
                    System.out.println("What maintenance Facility you want to show?");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e){
                    System.err.println("Please input number!");
                }
            }

            switch (choice){
                case 1:
                    Map<Facility, Integer> villaMap = ReadWriteFacility.readFacilityFile(PATH_VILLA);
                    if (villaMap.isEmpty()){
                        System.err.println("Villa list is empty!");
                    } else {
                        for (Facility villa : villaMap.keySet()){
                            if (villaMap.get(villa) > 4){
                                System.out.println(villa + ", used: " + villaMap.get(villa));
                            } else {
                                System.out.println("There is no villa in need of maintenance");
                            }
                        }
                    }
                    break;
                case 2:
                    Map<Facility, Integer> houseMap = ReadWriteFacility.readFacilityFile(PATH_HOUSE);
                    if (houseMap.isEmpty()){
                        System.err.println("House list is empty!");
                    } else {
                        for (Facility house : houseMap.keySet()){
                            if (houseMap.get(house) > 4){
                                System.out.println(house + ", used: " + houseMap.get(house));
                            } else {
                                System.out.println("There is no house in need of maintenance");
                            }
                        }
                    }
                    break;
                case 3:
                    Map<Facility, Integer> roomMap = ReadWriteFacility.readFacilityFile(PATH_ROOM);
                    if (roomMap.isEmpty()){
                        System.err.println("Room list is empty!");
                    } else {
                        for (Facility room : roomMap.keySet()) {

                            if (roomMap.get(room) > 4) {
                                System.out.println(room + ", used: " + roomMap.get(room));
                            } else {
                                System.out.println("There is no house in need of maintenance");
                            }
                        }
                    }
                    break;
                case 4:
                    return;
                default:
                    System.err.println("Your choice is not exist, please re-enter your choice!");
            }
        } while (true);
    }
}
