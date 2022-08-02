package thuc_hanh_1_bank_account.service.impl;

import thuc_hanh_1_bank_account.exception.DuplicateException;
import thuc_hanh_1_bank_account.exception.NotFoundBankAccountException;
import thuc_hanh_1_bank_account.exception.NumberException;
import thuc_hanh_1_bank_account.model.Account;
import thuc_hanh_1_bank_account.model.PaymentAccount;
import thuc_hanh_1_bank_account.service.IPaymentAccountService;
import thuc_hanh_1_bank_account.util.ReadWriteBankAccount;
import thuc_hanh_1_bank_account.util.RegexUtil;

import java.util.List;
import java.util.Scanner;

public class PaymentAccountService implements IPaymentAccountService {
    private Scanner scanner = new Scanner(System.in);
    private static final String PATH_PAYMENT = "src/thuc_hanh_1/data/payment_account.csv";

    @Override
    public void add() {
        List<Account> accounts = ReadWriteBankAccount.readBankAccountFile(PATH_PAYMENT);

        int id = accounts.get(accounts.size() - 1).getIdAccount() + 1;

        String accountCode;
        while (true) {
            try {
                System.out.println("Input account code:");
                accountCode = scanner.nextLine();
                for (Account account : accounts) {
                    if (accountCode.equals(account.getAccountCode())) {
                        throw new DuplicateException("Account code is duplicated, please re-input account code!");
                    }
                }
                break;
            } catch (DuplicateException e) {
                System.err.println(e.getMessage());
            }
        }


        System.out.println("Input name account: ");
        String nameAccount = scanner.nextLine();

        System.out.print("Input createdDay. ");
        String createdDay = RegexUtil.getDate();

        int cardNumber;
        while (true) {
            try {
                System.out.println("Input card number :");
                cardNumber = Integer.parseInt(scanner.nextLine());
                if (cardNumber <= 0) {
                    throw new NumberException("Card number must > 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please input a Number!");
            } catch (NumberException e) {
                System.err.println(e.getMessage());
            }
        }

        double account;
        while (true) {
            try {
                System.out.println("Input money in account:");
                account = Double.parseDouble(scanner.nextLine());
                if (account <= 0) {
                    throw new NumberException("Money must > 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please input a number!");
            } catch (NumberException e) {
                System.err.println(e.getMessage());
            }


        }

        accounts.add(new PaymentAccount(id, accountCode, nameAccount, createdDay, cardNumber, account));
        ReadWriteBankAccount.writeBankAccountFile(PATH_PAYMENT, accounts);
        System.out.println("Add successfully!");
    }

    @Override
    public void remove() {
        List<Account> accounts = ReadWriteBankAccount.readBankAccountFile(PATH_PAYMENT);
        String accountCode;
        boolean isExist = false;
        do {
            System.out.println("Please input account code:");
            accountCode = scanner.nextLine();
            for (Account account : accounts) {
                if (accountCode.equals(account.getAccountCode())) {
                    System.out.println("Account that you want to delete:");
                    System.out.println(account);
                    System.out.println("Are you sure to delete? \n " +
                            "1. enter '1' if say YES\n" +
                            "2. enter other character if say NO");

                    System.out.println("Please enter your choice:");
                    String chooseYesNo = scanner.nextLine();

                    if (chooseYesNo.equals("1")) {
                        accounts.remove(account);
                        ReadWriteBankAccount.writeBankAccountFile(PATH_PAYMENT, accounts);
                        System.out.println("Delete successfully!");
                    }
                    isExist = true;
                    break;
                }
            }
            try {
                if (!isExist) {
                    throw new NotFoundBankAccountException("not exist!");
                }
            } catch (NotFoundBankAccountException e) {
                System.err.println(e.getMessage());
            }
        } while (!isExist);
    }

    @Override
    public void show() {
        List<Account> accounts = ReadWriteBankAccount.readBankAccountFile(PATH_PAYMENT);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Override
    public void find() {
        List<Account> accounts = ReadWriteBankAccount.readBankAccountFile(PATH_PAYMENT);

        System.out.println("Input account code or name of account owner:");
        String accountFind = scanner.nextLine();
        boolean isExist = false;
        for (Account account : accounts) {
            if (account.getAccountCode().contains(accountFind)
                    || account.getNameAccount().toLowerCase().contains(accountFind.toLowerCase())) {
                System.out.println(account);
                isExist = true;
            }
        }
        if (!isExist) {
            System.err.println("Not find information!");
        }
    }
}

