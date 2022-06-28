package Kartica;

public class PlatnaKartica {

    private double suma;
    private int mesec;
    private int godina;
    private String brojKartice;

    public PlatnaKartica(double suma, int mesec, int godina, String brojKartice) {
        this.suma = suma;
        this.mesec = mesec;
        this.godina = godina;
        this.brojKartice = brojKartice;
    }

    public double getSuma() {
        return suma;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void dodajSredstva(double uplata){
        this.suma=suma + uplata;

    }
    public void izvrsiTransakciju(double trosak){
        this.suma=suma-trosak;
    }

    public void stampanje(){
        System.out.println(this.brojKartice +", " + this.mesec + "/" + this.godina + ", $" + this.suma);
    }
}









