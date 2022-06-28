package Kartica;

public  class VisaKartica extends PlatnaKartica{

    private String imeIPrezime;

    public VisaKartica(double suma, int mesec, int godina, String brojKartice, String imeIPrezime) {

        super(suma, mesec, godina, brojKartice);
        this.imeIPrezime = imeIPrezime;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public void izvrsiTransakciju(double trosak) {
        double provizija = trosak * 0.018;
        if (provizija < 4) {
            super.izvrsiTransakciju(trosak + 4);
        } else {
            super.izvrsiTransakciju(trosak + provizija);
        }
    }

    public void stampanje() {
        System.out.print("Visa card: ");
        super.stampanje();
        System.out.println(" " + getImeIPrezime());
    }
}
