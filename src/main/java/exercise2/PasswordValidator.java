package exercise2;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Napisz walidator, którego celem będzie walidacja wprowadzonego hasła. Hasło:
        ●      musi posiadać jedną wielką literę
        ●      musi posiadać jedną cyfrę
        ●      musi posiadać co najmniej 7 znaków
        ●      nie może zawierać bieżącego roku w postaci 2021 bądź 21 (zakładając, że bieżący rok to 20*/
public class PasswordValidator {

    private static final String year = String.valueOf(LocalDate.now().getYear());
    private static final String stringPattern = String.format("^(?=.*[A-Z].*)(?=.*\\d.*)(?!.*%s.*)(?!.*%s.*)\\w{7,}$", year, year.substring(year.length()-2));
    private static final Pattern passwordPattern = Pattern.compile(stringPattern);

    public static void validate(String password) {
        Matcher matcher = passwordPattern.matcher(password);
        boolean result = matcher.matches();

        if (!result) {
            throw new IllegalArgumentException("Niepoprawny format hasła");

        }
    }
}
