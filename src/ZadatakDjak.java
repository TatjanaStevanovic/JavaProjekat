import java.util.Scanner;

public class ZadatakDjak {
    public static void main(String[] args) {

        //Napisati program gde korisnik (djak) unosi poslednjih 5 ocena,
        //// ako ima sve petice program vrati poruku "Odlican djak",
        //// ako nema sve petice vraca poruku "Nije odlican djak"

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi ocene:");
        int suma = 0;
        System.out.println("Unesite poslednjih pet ocena (od 1 do 5)");

        for (int i = 0; i < 5; i++) {
            System.out.println("Unesi " + (i+1) + ". ocenu");
            int ocena = sc.nextInt();
            if (ocena > 5 || ocena < 1) {
                System.out.println("Uneli ste neodgovarajuc unos");
                return;
            }
            suma = suma + ocena;
        }

        if (suma == 25) {
            System.out.println("Odlican djak");
        } else {
            System.out.println("Nije odlican djak");
        }


    }
}