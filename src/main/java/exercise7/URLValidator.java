package exercise7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLValidator {
    public static final Pattern pattern = Pattern.compile("^(http|https)://(www\\.)?([A-Za-z0-9]+\\.)+(pl|com)");

    public static void validate(String url) {
        Matcher matcher = pattern.matcher(url);
        boolean result = matcher.matches();
        if (!result) {
            throw new IllegalArgumentException("Niepoprawny format url.");
        }
    }
}
