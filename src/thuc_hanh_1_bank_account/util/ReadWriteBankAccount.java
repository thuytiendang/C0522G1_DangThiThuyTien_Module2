package thuc_hanh_1_bank_account.util;

import thuc_hanh_1_bank_account.model.Account;
import thuc_hanh_1_bank_account.model.PaymentAccount;
import thuc_hanh_1_bank_account.model.SavingAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteBankAccount {
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

    public static List<Account> readBankAccountFile(String path) {
        List<String> stringList = readFile(path);
        List<Account> accountList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 8) {
                accountList.add(new SavingAccount(
                        Integer.parseInt(info[0]),
                        info[1],
                        info[2],
                        info[3],
                        Double.parseDouble(info[4]),
                        info[5],
                        Double.parseDouble(info[6]),
                        info[7]));
            } else if (info.length == 6) {
                accountList.add(new PaymentAccount(Integer.parseInt(info[0]),
                        info[1],
                        info[2],
                        info[3],
                        Integer.parseInt(info[4]),
                        Double.parseDouble(info[5])));
            }
        }
        return accountList;
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

    public static void writeBankAccountFile(String path, List<Account> accountList) {
        StringBuilder data = new StringBuilder();
        for (Account account : accountList) {
            data.append(account.getInfo()).append("\n");
        }
        writeFile(path, data.toString());
    }
}
