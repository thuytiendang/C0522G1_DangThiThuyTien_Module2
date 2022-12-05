package case_study.util;

import case_study.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteEmployee {
    private static List<String> readFile(String path){
        List<String> list = new ArrayList<>();
        String line;

        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null){
                if (line.length() != 0){
                    list.add(line);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Employee> readEmployeeFile(String path){
        List<String> stringList = readFile(path);
        List<Employee> employeeList = new ArrayList<>();
        String[] info;
        for (String line : stringList){
            info = line.split(",");
            employeeList.add(new Employee(
                    info[0],
                    info[1],
                    info[2],
                    Integer.parseInt(info[3]),
                    info[4],
                    info[5],
                    info[6],
                    info[7],
                    info[8],
                    Float.parseFloat(info[9])));
        }
        return employeeList;
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

    public static void writeEmployeeFile(String path, List<Employee> employees){
        StringBuilder data = new StringBuilder();
        for (Employee employee : employees){
            data.append(employee.getInfo()).append("\n");
        }
        writeFile(path, data.toString());
    }

}
