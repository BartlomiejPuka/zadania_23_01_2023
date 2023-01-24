package exercise1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Napisz walidator (wyrażenie regularne), którego celem będzie walidacja numeru PESEL. Walidacja powinna uwzględniać :

        ●      ilość znaków

        ●      sprawdzenie, czy PESEL składa się tylko z cyfr*/
public class PESELValidator {
    private static final Pattern peselPattern = Pattern.compile("^\\d{11}$");

    public static void validate(String pesel) {
        Matcher matcher = peselPattern.matcher(pesel);
        boolean result = matcher.matches();
        if (!result) {
            throw new IllegalArgumentException("Niepoprawny format peselu.");
        }
    }
}
