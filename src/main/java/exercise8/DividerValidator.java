package exercise8;

import java.util.ArrayList;
import java.util.List;

public class DividerValidator {

    public void validate(int[] values) {
        List<String> errors = new ArrayList<>();
        for (int value : values) {
            try {
                System.out.println(value);
                process(value);
            } catch (IllegalArgumentException e) {
                errors.add(e.getMessage());
            }
        }
        System.out.println(errors);
    }

    private void process(int value) {
        if (value % 3 != 0) {
            throw new IllegalArgumentException(String.format("Liczba %s nie jest podzielna przez 3", value));
        }
    }
}
