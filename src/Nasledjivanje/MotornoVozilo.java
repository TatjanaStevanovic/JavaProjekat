package Nasledjivanje;

public class MotornoVozilo {

    public String boja;
    public int brojTockova;
    public int brojVrata;

    public MotornoVozilo(String boja, int brojTockova, int brojVrata) {
        this.boja = boja;
        this.brojTockova = brojTockova;
        this.brojVrata = brojVrata;
    }

    public void stampanje() {
        System.out.println("Vozilo " + this.boja + " boje ima " + this.brojTockova + " tockova i " + this.brojVrata + " vrata.");
    }
}


