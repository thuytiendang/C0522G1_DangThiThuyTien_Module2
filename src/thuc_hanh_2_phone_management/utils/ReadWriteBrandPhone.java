package thuc_hanh_2_phone_management.utils;

import thuc_hanh_2_phone_management.model.BrandPhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteBrandPhone {
    private static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        String line;

        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() != 0) {
                    list.add(line);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<BrandPhone> readBrandPhoneFile(String path) {
        List<String> stringList = readFile(path);
        List<BrandPhone> brandPhoneList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            brandPhoneList.add(new BrandPhone(
                    Integer.parseInt(info[0]),
                    info[1],
                    Double.parseDouble(info[2]),
                    Integer.parseInt(info[3]),
                    info[4],
                    Integer.parseInt(info[5]),
                    info[6]));
        }
        return brandPhoneList;
    }

    private static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeBrandPhoneFile(String path, List<BrandPhone> brandPhoneList) {
        StringBuilder data = new StringBuilder();
        for (BrandPhone brandPhone : brandPhoneList) {
            data.append(brandPhone.getInfo()).append("\n");
        }
        writeFile(path, data.toString());
    }
}
