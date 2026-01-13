import java.util.Scanner;

public class A421_Rabattsystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihren Bestellwert ein: ");
        double bestellwert = sc.nextDouble();

        double rabatt;

        // Rabattberechnung
        if (bestellwert >= 0 && bestellwert <= 100) {
            rabatt = 0.10;
        } else if (bestellwert > 100 && bestellwert <= 500) {
            rabatt = 0.15;
        } else {
            rabatt = 0.20;
        }

        // Ermäßigter Bestellwert
        double endpreis = bestellwert - (bestellwert * rabatt);

        // Formatierte Ausgabe
        System.out.println("Der Bestellwert abzüglich Rabatt beträgt" + endpreis + " EUR");

        sc.close();
    }
}
