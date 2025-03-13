import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int wiek = sc.nextInt();
        System.out.println("Gdzie mieszkasz?");
        String miasto = sc.next();
        System.out.println("Kiedy kupiłeś bilet?");
        String dzień = sc.next();

        int cena = 40;
        if (wiek > 10) {
             cena = 0;
        } else if (wiek < 10 && wiek > 18) {
            cena = cena/2;
        }
        if (miasto == "Warszawa" && miasto == "warszawa") {
            cena = cena - (1 / 10);
        }
        if(dzień == "Czwartek" && miasto == "czwartek") {
            cena = 0;
        }
    }
}