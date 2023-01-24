package exercise8;

/**
 * Zaimplementuj klasę, której zadaniem będzie walidacja, czy liczba jest podzielna przez 3.
 * Jeżeli nie jest podzielna przez 3 należy rzucić wyjątek IllegalArgumentException.
 * Ważne, aby wszystkie elementy zostały przeprocesowane (jeżeli wyjątek zostanie rzucony powinien on zostać obsłużony a proces powinien iść dalej).
 * Przykładowa definicja metody:
 * public void validate(int[] values)
 */
public class Main {
    public static void main(String[] args) {
        DividerValidator validator = new DividerValidator();
        validator.validate(new int[] {1,2,3, 66, 79, 102, 145});
    }
}
