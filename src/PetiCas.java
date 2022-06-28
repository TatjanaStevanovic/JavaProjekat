public class PetiCas {

    public static void main(String[] args) {
        System.out.println("Ovo je ispis iz main metode");
        prviIspis();
        //drugiIspis();
        treciIspis();
        System.out.println(treciIspis());
        System.out.println(cetvrtiIspis()*cetvrtiIspis());
        prosledjivanje("Dragoljub");

    }

    public static void prviIspis() {//zaglavlje funkcije
        System.out.println("Ovo je prvi ispis van main metode");
        //telo funkcije
        //telo funkcije je sve izmedju viticastih zagrada metode
        //static - metoda je vidljiva u drugim metodama
        //void - ne dobijamo povratnu informaciju od metode
    }

    public void drugiIspis() {
        System.out.println("Ova metoda nije vidljiva u drugim metodama jer nema 'static'");
    }

    public static String treciIspis() {
        String naziv;
        naziv = "Ispis iz trece metode";
        return naziv;
    }

    public static int cetvrtiIspis() {
        int broj;
        broj = 4;
        return broj;
    }

    public static void prosledjivanje(String ime) {
        System.out.println("Moje ime je ");
        System.out.println(ime);
    }

}



