package AutoPrivate;

public class Auto {
    public String marka;
    private String gorivo;
    public int brojVrata;
    private int godiste;
    private double prosecnaPotrosnja;

    public Auto(String marka, int brojVrata) {
        this.marka = marka;
        this.brojVrata = brojVrata;
    }

    public double potrosnja() {
        if (gorivo.equals("dizel")) {
            prosecnaPotrosnja = 10.5;
        } else if (gorivo.equals("benzin")) {
            prosecnaPotrosnja = 8.8;
        }
        return prosecnaPotrosnja;
    }

    public String getGorivo() {
        return gorivo;
    }

    public void setGorivo(String gorivo) {
        this.gorivo = gorivo;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

}

