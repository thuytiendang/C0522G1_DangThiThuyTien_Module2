package thuc_hanh_2_phone_management.utils;

import thuc_hanh_2_phone_management.model.BrandPhone;
import thuc_hanh_2_phone_management.model.HandPhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteHandPhone {
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

    public static List<HandPhone> readHandPhoneFile(String path) {
        List<String> stringList = readFile(path);
        List<HandPhone> handPhoneList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            handPhoneList.add(new HandPhone(
                    Integer.parseInt(info[0]),
                    info[1],
                    Double.parseDouble(info[2]),
                    Integer.parseInt(info[3]),
                    info[4],
                    info[5],
                    info[6]));
        }
        return handPhoneList;
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

    public static void writeHandPhoneFile(String path, List<HandPhone> handPhoneList) {
        StringBuilder data = new StringBuilder();
        for (HandPhone handPhone : handPhoneList) {
            data.append(handPhone.getInfo()).append("\n");
        }
        writeFile(path, data.toString());
    }
}
