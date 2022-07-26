package ss19_string_regex.practice.validate_account;

public class AccountExampleText {
    private static AccountExample accountExample;

    public static final String[] validateAccount = new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh"};
    public static final String[] invalidateAccount = new String[]{ ".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validateAccount){
            boolean isValid = accountExample.validate(account);
            System.out.println("account: " + account + " is valid: " + isValid);
        }
        for (String account : invalidateAccount){
            boolean isValid = accountExample.validate(account);
            System.out.println("account: " + account + " is valid: " + isValid);
        }
    }
}
