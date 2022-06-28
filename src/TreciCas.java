public class TreciCas {
    public static void main(String[] args) {

        boolean punoletstvo = true;

        if (punoletstvo) {
            System.out.println("Korisnik je punoletan");
        } else {
            System.out.println("Korisnik nije punoletan");
        }

        //-------------------------------
        //Drugi nacin

        if (punoletstvo == true) {
            System.out.println("Korisnik je punoletan");
        } else {
            System.out.println("Korisnik nije punoletan");
        }

        //Znak '=' se koristi za dodeljivanje vrednosti sa desne na levu stranu
        //Znak '==' se koristi za uporedjivanje vrednosti sa desne na levu stranu

    }
}
