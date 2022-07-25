package ss17_file_serialization.exercise.product_management.utils;

import ss17_file_serialization.exercise.product_management.model.Product;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteFile {
    public static void writeProductFile(String path, List<Product> list){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream =  new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
