package ss17_file_serialization.exercise.copy_binary_file;

import java.io.*;

public class CopyFile {
    private static void copyFileUsingStream(File source,File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        int count = 0;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
                count += length;
            }
            System.out.println("số lần xuất hiện trong file là: " + count);
            } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        String sourcePath ="src/ss17_file_serialization/exercise/copy_binary_file/FileSource.csv";
        String destPath = "src/ss17_file_serialization/exercise/copy_binary_file/FileDest.csv";

        try {
            File sourceFile = new File(sourcePath);
            File destFile = new File(destPath);
            if (destFile.exists()){
                throw new CopyFileException("File đã tồn tại!");
            }
            copyFileUsingStream(sourceFile,destFile);
        }catch (IOException e){
            e.printStackTrace();
        } catch (CopyFileException e){
            System.out.println(e.getMessage());
        }
    }
}
