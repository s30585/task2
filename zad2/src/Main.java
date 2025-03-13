import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int wiek = sc.nextInt();
        System.out.println("Gdzie mieszkasz?");
        String miasto = sc.next();
        System.out.println("Kiedy kupiłeś bilet (Podaj dzień tygodnia)?");
        String dzień = sc.next();

        double cena = 40;
        double znizka = 0;
        if (wiek < 10) {
            znizka = 1.0;
        } else if (wiek > 10 && wiek < 18) {
            znizka += 0.5;
        }
        if (miasto.equals("Warszawa") || miasto.equals("warszawa")) {
            znizka += 0.1;
        }
        if(dzień.equals("Czwartek") || dzień.equals("czwartek")) {
            znizka = 1.0;
        }
        cena *= (1 - znizka);
        System.out.print("Data: ");
        System.out.print(miasto);
        System.out.print(", Wiek: " + wiek);
        System.out.printf(", Cena: " + cena);
        System.out.printf(", Znizka: " + znizka *100);
    }
}
