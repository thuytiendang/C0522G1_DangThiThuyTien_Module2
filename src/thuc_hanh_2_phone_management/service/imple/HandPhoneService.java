package thuc_hanh_2_phone_management.service.imple;

import thuc_hanh_2_phone_management.exception.NotFoundProductException;
import thuc_hanh_2_phone_management.exception.NumberException;
import thuc_hanh_2_phone_management.exception.VietNamException;
import thuc_hanh_2_phone_management.model.HandPhone;
import thuc_hanh_2_phone_management.service.IHandPhoneService;
import thuc_hanh_2_phone_management.utils.FurtherFunction;
import thuc_hanh_2_phone_management.utils.ReadWriteHandPhone;

import java.util.List;
import java.util.Scanner;

public class HandPhoneService implements IHandPhoneService {
    private Scanner scanner = new Scanner(System.in);
    private static final String PATH_HAND_PHONE = "src/thuc_hanh_2_phone_management/data/hand_phone.csv";

    @Override
    public void add() {
        List<HandPhone> handPhones = ReadWriteHandPhone.readHandPhoneFile(PATH_HAND_PHONE);

        int id;
        if (handPhones.size() == 0) {
            id = 1;
        } else {
            id = handPhones.get(handPhones.size() - 1).getId() + 1;
        }

        String name = FurtherFunction.getName();

        double price;
        while (true) {
            try {
                System.out.println("Input price: ");
                price = Double.parseDouble(scanner.nextLine());
                if (price <= 0 ){
                    throw new NumberException("Price must be > 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please input a number!");
            } catch (NumberException e){
                System.err.println(e.getMessage());
            }
        }

        int quantity;
        while (true) {
            try {
                System.out.println("Input quantity:  ");
                quantity = Integer.parseInt(scanner.nextLine());
                if (quantity <= 0 ){
                    throw new NumberException("quantity must be > 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please input a Number!");
            } catch (NumberException e){
                System.err.println(e.getMessage());
            }
        }


        System.out.println("Input producer:  ");
        String producer = scanner.nextLine();

        String handCountry;
        while (true){
            try {
                System.out.println("Input handCountry: ");
                handCountry = scanner.nextLine();
                if (handCountry.equals("Viet Nam")){
                    throw new VietNamException("hand Country is invalid");
                }
                break;
            } catch (VietNamException e){
                System.err.println(e.getMessage());
            }
        }

        String status;
        loop:
        do {
            int choice;
            while (true) {
                try {
                    System.out.println("Input status:\n" +
                            "1. Da sua chua\n" +
                            "2. Chua sua chua");
                    System.out.println("input your choice:");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("please input a number!");
                }
            }

            switch (choice) {
                case 1:
                    status = "Da sua chua";
                    break loop;
                case 2:
                    status = "Chua sua chua";
                    break loop;
                default:
                    System.err.println("your choice is not exit!please re-enter your choice");
            }
        } while (true);

        handPhones.add(new HandPhone(id, name, price, quantity, producer, handCountry, status));
        ReadWriteHandPhone.writeHandPhoneFile(PATH_HAND_PHONE, handPhones);
        System.out.println("Add successfully!");

    }

    @Override
    public void remove() {
        List<HandPhone> handPhones = ReadWriteHandPhone.readHandPhoneFile(PATH_HAND_PHONE);
        int id;
        boolean isExist = false;
        do {
            while (true) {
                try {
                    System.out.println("Please input id:");
                    id = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("please input a number:");
                }
            }
            for (HandPhone handPhone : handPhones) {
                if (id == handPhone.getId()) {
                    System.out.println("Phone that you want to delete:");
                    System.out.println(handPhone);
                    System.out.println("Are you sure to delete? \n " +
                            "1. enter '1' if say YES\n" +
                            "2. enter other character if say NO");

                    System.out.println("Please enter your choice:");
                    String chooseYesNo = scanner.nextLine();

                    if (chooseYesNo.equals("1")) {
                        handPhones.remove(handPhone);
                        ReadWriteHandPhone.writeHandPhoneFile(PATH_HAND_PHONE, handPhones);
                        System.out.println("Delete successfully!");
                    }
                    isExist = true;
                    break;
                }
            }
            try {
                if (!isExist) {
                    throw new NotFoundProductException(" ID not exist!");
                }
            } catch (NotFoundProductException e) {
                System.err.println(e.getMessage());
            }
        } while (!isExist);
    }

    @Override
    public void show() {
        List<HandPhone> handPhones = ReadWriteHandPhone.readHandPhoneFile(PATH_HAND_PHONE);
        for (HandPhone handPhone : handPhones) {
            System.out.println(handPhone);
        }
    }

    @Override
    public void find() {
        List<HandPhone> handPhones = ReadWriteHandPhone.readHandPhoneFile(PATH_HAND_PHONE);

        int choice;
        while (true) {
            try {
                System.out.println("1. find by id\n" +
                        "2. Find bu name\n" +
                        "3. exit find");
                System.out.println("Input your choice");
                choice = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("please input a number!");
            }
        }
        switch (choice) {
            case 1:
                boolean isExist = false;
                int id;
                while (true) {
                    try {
                        System.out.println("Input id:");
                        id = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println("please input a number!");
                    }
                }
                for (HandPhone handPhone : handPhones) {
                    if (handPhone.getId() == id) {
                        System.out.println(handPhone);
                        isExist = true;
                    }

                }
                if (!isExist) {
                    System.err.println("Not find information!");
                }
                break;
            case 2:
                System.out.println("Input name of phone:");
                String accountFind = scanner.nextLine();
                boolean isFlat = false;
                for (HandPhone handPhone : handPhones) {
                    if (handPhone.getName().toLowerCase().contains(accountFind.toLowerCase())) {
                        System.out.println(handPhone);
                        isFlat = true;
                    }
                }
                if (!isFlat) {
                    System.err.println("Not find information!");
                }
                break;
            case 3:
                return;
            default:
                System.err.println("Your choice is not exist, please re-enter your choice");
        }
    }
}

