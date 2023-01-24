package exercise3;

/*
Napisz program, który z podanej daty urodzenia w formacie RRRR-MM-DD
●      wyliczy ile osoba ma lat
●      w jakim dniu tygodnia się urodziła
●      który tydzień roku to był
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(DateUtils.getDateInfo("1997-01-13"));
    }
}
