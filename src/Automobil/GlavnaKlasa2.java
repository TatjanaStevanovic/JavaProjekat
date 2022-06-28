package Automobil;

public class GlavnaKlasa2 {
    public static void main(String[] args) {
       // Automobil a1 = new Automobil("Fiat ","Punto","benzin",4,2002);
        //a1.stampanje();

        Automobil a1 = new Automobil();
        a1.marka = "Citroen";
        a1.model = "C3";
        a1.gorivo = "dizel";
        a1.brojVrata = 4;
        a1.godiste = 2005;
        a1.stampanje();


    }

}


