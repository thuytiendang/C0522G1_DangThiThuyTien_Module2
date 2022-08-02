package case_study.util;

import case_study.model.facilities.Facility;
import case_study.model.facilities.House;
import case_study.model.facilities.Room;
import case_study.model.facilities.Villa;

import java.io.*;
import java.util.*;

public class ReadWriteFacility {
    private static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() != 0) {
                    stringList.add(line);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static Map<Facility, Integer> readFacilityFile(String path) {
        List<String> stringList = readFile(path);
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 10){
                facilityMap.put(new Villa(
                                info[0],
                                info[1],
                                Float.parseFloat(info[2]),
                                Float.parseFloat(info[3]),
                                Integer.parseInt(info[4]),
                                info[5], info[6],
                                Float.parseFloat(info[7]),
                                Integer.parseInt(info[8])),
                        Integer.parseInt(info[9]));
            } else if (info.length == 9){
                facilityMap.put(new House(info[0],
                        info[1],
                        Float.parseFloat(info[2]),
                        Float.parseFloat(info[3]),
                        Integer.parseInt(info[4]),
                        info[5],
                        info[6],
                        Integer.parseInt(info[7])), Integer.parseInt(info[8]));
            } else if (info.length == 8){
                facilityMap.put(new Room(info[0],
                        info[1],
                        Float.parseFloat(info[2]),
                        Float.parseFloat(info[3]),
                        Integer.parseInt(info[4]),
                        info[5],
                        info[6]), Integer.parseInt(info[7]));
            }
        }
        return facilityMap;
    }

    private static void writeFile(String path, String data){
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

    public static void writeFacilityFile(String path, Map<Facility, Integer> facilityMap){
        StringBuilder stringBuilder = new StringBuilder();
        Set<Facility> keys = facilityMap.keySet();
        for (Facility key : keys){
            stringBuilder.append(key.getInfo()).append(",").append(facilityMap.get(key)).append("\n");
        }
        writeFile(path, stringBuilder.toString());
    }
}
