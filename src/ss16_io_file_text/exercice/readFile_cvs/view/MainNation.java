package ss16_io_file_text.exercice.readFile_cvs.view;

import ss16_io_file_text.exercice.readFile_cvs.model.Nations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainNation {
    public static List<String> readFile(String path){
        List<String> list = new ArrayList<>();
         String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null){
                list.add(line);
            }
            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }

    public static List<Nations> readNationFile (String path){
        List<String> strings = readFile(path);
        List<Nations> nations = new ArrayList<>();
        String[] info;
        for (String line : strings){
            info = line.split(",");
            nations.add(new Nations(Integer.parseInt(info[0]),info[1],info[2]));
        }
        return nations;
    }

    public static void main(String[] args) {
        String path = "src/ss16_io_file_text/exercice/readFile_cvs/data/listNations.csv";
        for (Nations nation : readNationFile(path)){
            System.out.println(nation);
        }
    }
}
