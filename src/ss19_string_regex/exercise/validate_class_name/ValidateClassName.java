package ss19_string_regex.exercise.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASS_REGEX = "[CAP][0-9]{4}[GHIKLM]";

    public ValidateClassName() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
