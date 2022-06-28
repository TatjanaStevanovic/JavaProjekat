import java.util.Scanner;

public class PetiCasC {

    public static void main(String[] args) {

        //Preko skenera uneti godinu rodjenja i program treba da vrati da li je korisnik punoletan
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu rodjenja");
        int proslednjoGodisteSaSkenera = sc.nextInt();

        System.out.println
                (racunanjePunoletstva
                        (racunanjeGodina
                                (proslednjoGodisteSaSkenera)));

        System.out.println(racunanjePunoletstva(racunanjeGodina(proslednjoGodisteSaSkenera)));

        //Metodi punoletstvo prosledjujemo godine
        //koje smo dobili iz metode godine
        //kojoj smo prosledili god
        //koji smo uneli preko skenera
    }

    public static int racunanjeGodina(int godiste) {
        int godine;
        godine = 2022 - godiste;
        return godine;
    }

    public static boolean racunanjePunoletstva(int nekeGodine) {
        boolean punoletni;

        if (nekeGodine >= 18) {
            punoletni = true;
        } else {
            punoletni = false;
        }

        return punoletni;
    }


}