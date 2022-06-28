import java.util.Scanner;

public class TreciCasZadatak1 {

    public static void main(String[] args) {

        //Zadatak 1 - Preko skenera uneti ime, pol i broj godina. Ako je korisnik maloletan treba se ispisati odgovarajuca poruka. Ako je korisnik muskog pola potrebno je ispisati poruku "Gospodine " + ime, a ako je zenskog pola treba ispisati poruku "Gospodjo " + ime

        //Zadatak 1 - Preko skenera uneti ime, pol i broj godina.
        // Ako je korisnik maloletan treba se ispisati odgovarajuca poruka.
        // Ako je korisnik muskog pola potrebno je ispisati poruku "Gospodine " + ime,
        // a ako je zenskog pola treba ispisati poruku "Gospodjo " + ime

        Scanner sc = new Scanner(System.in);
        System.out.println("Ispisi ime");
        String ime = sc.next();
        System.out.println("Ispisi godine");
        int godine = sc.nextInt();
        System.out.println("Ispisi pol (m,z)");
        String pol = sc.next();

        if (godine < 18) {
            System.out.println("Korisnik je maloletan");
        }

        //IF uslov iznad ostavljamo bez ELSE jer u zadatku nije naglaseno sta treba raditi ako je korisnik punoletan

        //Prvo proveravamo ako je korisnik muskog pola, ako jeste odradice se stampa sa Gospodine, ako nije pol m onda program nastavlja dalje
        if (pol.equals("m")) {
            System.out.println("Gospodine " + ime);
        } else if (pol.equals("z")) { //Provera da li je pol z
            System.out.println("Gospodjo " + ime);
        } else { //Ako za pol nije uneto m ili z onda ide naredni blok
            System.out.println("Niste uneli odgovarajuci pol");
        }


    }
}





