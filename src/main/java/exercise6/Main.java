package exercise6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Załóżmy, że dostępna jest lista zawierająca poniższe elementy typu String:
 *
 * {
 *
 * “Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra”,
 *
 * “Przychodnia:Pediatra”,
 *
 * “Przychodnia:Internista:Laryngolog:Pediatra”
 *
 * }
 *
 *
 *
 * Każdy element na liście specjalizacji jest poprzedzony prefiksem Szpital: lub Przychodnia: w zależności od tego, czy lekarz o danej specjalizacji lekarskiej pracuje w szpitalu, czy w przychodni. Wykorzystując Java Stream API stwórz listę zawierającą unikalną listę specjalizacji, bez prefiksu Szpital lub Przychodnia. Wynik wyświetl na ekran. Dla powyższej listy na ekran powinno zostać wyświetlone:
 *
 * Chirurg, Radiolog, Chirurg Szczękowy, Pediatra, Internista, Laryngolog
 *
 */
public class Main {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        result.add("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra");
        result.add("Przychodnia:Pediatra");
        result.add("Przychodnia:Internista:Laryngolog:Pediatra");

        List<String> collect = result.stream()
                .flatMap(i -> Stream.of(i.split(":")))
                .filter(i -> !Objects.equals(i, "Szpital") && !Objects.equals(i, "Przychodnia"))
                .distinct()
                .collect(Collectors.toList());

        System.out.print(String.join(", ", collect));

    }
}
