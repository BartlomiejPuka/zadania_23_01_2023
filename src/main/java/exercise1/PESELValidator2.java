package exercise1;

public class PESELValidator2 {
    public void validate(String pesel) {
        if (pesel.length() != 11) {
            throw new IllegalArgumentException("Pesel powinnien miec 11 znakow.");
        }

    }
}
