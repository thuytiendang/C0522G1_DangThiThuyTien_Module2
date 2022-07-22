package ss16_io_file_text.practice.sum_in_readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line +"\t");
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();

            System.out.println("\nTổng= " + sum);
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dụng có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("NHập đường dẫn file:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }

}

