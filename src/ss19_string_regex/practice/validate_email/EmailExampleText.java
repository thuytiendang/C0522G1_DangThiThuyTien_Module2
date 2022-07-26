package ss19_string_regex.practice.validate_email;

public class EmailExampleText {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail){
            boolean isValid = emailExample.validate(email);
            System.out.println("email: "+ email + " is valid: " + isValid);
        }
        for (String email : invalidEmail){
            boolean isValid = emailExample.validate(email);
            System.out.println("email: "+ email + " is valid: " + isValid);
        }
    }
}


