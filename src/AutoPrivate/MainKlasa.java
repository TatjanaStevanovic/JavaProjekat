package AutoPrivate;

public class MainKlasa {
    public static void main(String[] args) {

        Auto a1 = new Auto("Citroen", 4);
        a1.setGorivo("dizel");
        a1.setGodiste(2005);

        System.out.println("Automobil marke " + a1.marka + " ima " + a1.brojVrata + " vrata");
        System.out.println("Ide na " + a1.getGorivo() + " gorivo");
        System.out.println("Godiste je " + a1.getGodiste());
        System.out.println("Prosecna potrosnja je " + a1.potrosnja());


    }
}


