package zthi.utils;

import zthi.model.Oto;
import zthi.model.PhuongTien;
import zthi.model.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TepDocViet {
    private static List<String> tepDoc(String path) {
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

    public static List<PhuongTien> tepDocPhuongTien(String path) {
        List<String> stringList = tepDoc(path);
        List<PhuongTien> phuongTienList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 11) {
                phuongTienList.add(new Oto(
                        info[0],
                        info[1],
                        info[2],
                        info[3],
                        info[4],
                        info[5],
                        info[6],
                        info[7],
                        Double.parseDouble(info[8]),
                        Integer.parseInt(info[9]),
                        info[10]));
            } else if (info.length == 10) {
                phuongTienList.add(new XeTai(
                        info[0],
                        info[1],
                        info[2],
                        info[3],
                        info[4],
                        info[5],
                        info[6],
                        info[7],
                        Double.parseDouble(info[8]),
                        Integer.parseInt(info[9])));
            }
        }
        return phuongTienList;
    }

    private static void tepViet(String path, String data) {
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

    public static void tepVietPhuongTien(String path, List<PhuongTien> phuongTienList) {
        StringBuilder data = new StringBuilder();
        for (PhuongTien phuongTien : phuongTienList) {
            data.append(phuongTien.getInfo()).append("\n");
        }
        tepViet(path, data.toString());
    }
}
