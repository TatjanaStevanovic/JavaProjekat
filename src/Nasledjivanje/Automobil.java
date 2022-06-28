package Nasledjivanje;

public class Automobil {

    public String tablica;
    public boolean kabriolet;
    public int brojOsovina;
    private String boja;
    private String brojTockova;
    private String brojVrata;

    public String getTablica() {
        return tablica;
    }

    public void setTablica(String tablica) {
        this.tablica = tablica;
    }

    public boolean isKabriolet() {
        return kabriolet;
    }

    public void setKabriolet(boolean kabriolet) {
        this.kabriolet = kabriolet;
    }

    public int getBrojOsovina() {
        return brojOsovina;
    }

    public void setBrojOsovina(int brojOsovina) {
        this.brojOsovina = brojOsovina;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public String getBrojTockova() {
        return brojTockova;
    }

    public void setBrojTockova(String brojTockova) {
        this.brojTockova = brojTockova;
    }

    public String getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(String brojVrata) {
        this.brojVrata = brojVrata;
    }

    public void stampanje() {
        System.out.println("Automobil " + this.boja + " boje ima tablicu " + this.tablica);
        System.out.println("Broj osovina: " + this.brojOsovina);
        System.out.println("Broj tockova: " + this.brojTockova);
        System.out.println("Broj vrata: " + this.brojVrata);
        if (this.kabriolet) {
            System.out.println("Automobil je kabriolet");
        } else {
            System.out.println("Automobil nije kabriolet");
        }
    }
}

