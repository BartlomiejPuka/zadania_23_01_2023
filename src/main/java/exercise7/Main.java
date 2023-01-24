package exercise7;

/**
 * Napisz walidator (wyrażenie regularne), którego celem będzie walidacja poprawności linka URL. Należy poprawnie rozpoznać poniższe przykłady:
 *
 * ●      http://www.onet.pl
 *
 * ●      https://mail.google.com
 *
 * ●      http://wiadmosci.onet.pl
 *
 * ●      http://onet.pl
 */
public class Main {

    public static void main(String[] args) {
//        URLValidator.validate("http://www.onet.pl");
        URLValidator.validate("https://mail.google.com");
//        URLValidator.validate("http://wiadmosci.onet.pl");
//        URLValidator.validate("http://onet.pl");
    }
}
