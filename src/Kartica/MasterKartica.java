package Kartica;

public class MasterKartica extends PlatnaKartica{
    public MasterKartica(double suma, int mesec, int godina, String brojKartice) {
        super(suma, mesec, godina, brojKartice);
    }
    public void izvrsiTransakciju(double trosak){
        double provizija = trosak * 0.015;
        super.izvrsiTransakciju(trosak+provizija);
    }
    public void odrzavanjeRacuna(){
        super.izvrsiTransakciju(2);
    }
    public void stampanje(){
        System.out.println();
    }
}


