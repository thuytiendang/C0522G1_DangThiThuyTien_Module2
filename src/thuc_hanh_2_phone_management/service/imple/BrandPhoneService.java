package thuc_hanh_2_phone_management.service.imple;

import thuc_hanh_2_phone_management.exception.NotFoundProductException;
import thuc_hanh_2_phone_management.exception.NumberException;
import thuc_hanh_2_phone_management.model.BrandPhone;
import thuc_hanh_2_phone_management.service.IBrandPhoneService;
import thuc_hanh_2_phone_management.utils.FurtherFunction;
import thuc_hanh_2_phone_management.utils.ReadWriteBrandPhone;

import java.util.List;
import java.util.Scanner;

public class BrandPhoneService implements IBrandPhoneService {
    private Scanner scanner = new Scanner(System.in);
    private static final String PATH_BRAND_PHONE = "src/thuc_hanh_2_phone_management/data/brand_phone.csv";

    @Override
    public void add() {
        List<BrandPhone> brandPhones = ReadWriteBrandPhone.readBrandPhoneFile(PATH_BRAND_PHONE);

        int id;
        if (brandPhones.size() == 0) {
            id = 1;
        } else {
            id = brandPhones.get(brandPhones.size() - 1).getId() + 1;
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

        int warrantyTime;
        while (true) {
            try {
                System.out.println("Input warranty Time :");
                warrantyTime = Integer.parseInt(scanner.nextLine());
                if (warrantyTime <= 0 || warrantyTime > 730){
                    throw new NumberException("warrantyTime must be > 0 and < 730 ");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please input a Number!");
            } catch (NumberException e){
                System.err.println(e.getMessage());
            }
        }

        String warrantyScope;
        loop:
        do {
            int choice;
            while (true) {
                try {
                    System.out.println("Input warranty Scope:\n" +
                            "1. Toan Quoc\n" +
                            "2. Quoc Te ");
                    System.out.println("input your choice:");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("please input a number!");
                }
            }

            switch (choice) {
                case 1:
                    warrantyScope = "Toan Quoc";
                    break loop;
                case 2:
                    warrantyScope = "Quoc Te";
                    break loop;
                default:
                    System.err.println("your choice is not exit!please re-enter your choice");
            }
        } while (true);

        brandPhones.add(new BrandPhone(id, name, price, quantity, producer, warrantyTime, warrantyScope));
        ReadWriteBrandPhone.writeBrandPhoneFile(PATH_BRAND_PHONE, brandPhones);
        System.out.println("Add successfully!");
    }

    @Override
    public void remove() {
        List<BrandPhone> brandPhones = ReadWriteBrandPhone.readBrandPhoneFile(PATH_BRAND_PHONE);
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
            for (BrandPhone brandPhone : brandPhones) {
                if (id == brandPhone.getId()) {
                    System.out.println("Phone that you want to delete:");
                    System.out.println(brandPhone);
                    System.out.println("Are you sure to delete? \n " +
                            "1. enter '1' if say YES\n" +
                            "2. enter other character if say NO");

                    System.out.println("Please enter your choice:");
                    String chooseYesNo = scanner.nextLine();

                    if (chooseYesNo.equals("1")) {
                        brandPhones.remove(brandPhone);
                        ReadWriteBrandPhone.writeBrandPhoneFile(PATH_BRAND_PHONE, brandPhones);
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
        List<BrandPhone> brandPhones = ReadWriteBrandPhone.readBrandPhoneFile(PATH_BRAND_PHONE);
        for (BrandPhone brandPhone : brandPhones) {
            System.out.println(brandPhone);
        }
    }

    @Override
    public void find() {
        List<BrandPhone> brandPhones = ReadWriteBrandPhone.readBrandPhoneFile(PATH_BRAND_PHONE);

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
                for (BrandPhone brandPhone : brandPhones) {
                    if (brandPhone.getId() == id) {
                        System.out.println(brandPhone);
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
                for (BrandPhone brandPhone : brandPhones) {
                    if (brandPhone.getName().toLowerCase().contains(accountFind.toLowerCase())) {
                        System.out.println(brandPhone);
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

