package ss17_file_serialization.exercise.product_management.service;

import ss17_file_serialization.exercise.product_management.model.Product;
import ss17_file_serialization.exercise.product_management.utils.DuplicateException;
import ss17_file_serialization.exercise.product_management.utils.ReadFile;
import ss17_file_serialization.exercise.product_management.utils.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/ss17_file_serialization/exercise/product_management/data/product.dat";

    @Override
    public void add() {
        List<Product> productList = ReadFile.readProductFile(PATH);
        String productCode;
        while (true) {
            try {
                System.out.println("Input productCode:");
                productCode = scanner.nextLine();
                for (Product product : productList) {
                    if (productCode.equals(product.getProductCode())) {
                        throw new DuplicateException("Duplicate product code. Please re-enter your choice.");
                    }
                }
                break;
            } catch (DuplicateException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("input productName:");
        String productName = scanner.nextLine();

        System.out.println("input manufacture:");
        String manufacture = scanner.nextLine();

        double price;
        while (true) {
            try {
                System.out.println("input price:");
                price = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("please enter a number");
            }
        }
        productList.add(new Product(productCode, productName, manufacture, price));
        WriteFile.writeProductFile(PATH, productList);
    }

    @Override
    public void show() {
        List<Product> productList = ReadFile.readProductFile(PATH);
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void find() {
        List<Product> productList = ReadFile.readProductFile(PATH);
        System.out.println("enter product code of product that you want to find: ");
        String productCode = scanner.nextLine();
        boolean isExit = false;
        for (Product product : productList) {
            if (productCode.equals(product.getProductCode())) {
                System.out.println(product);
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.err.println("Not find product!");
        }
    }
}
