package ss17_file_serialization.exercise.product_management.utils;

import ss17_file_serialization.exercise.product_management.model.Product;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Product> readProductFile(String path){
        List<Product> products = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return products;
    }
}
