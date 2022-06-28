package Pasta;

import java.util.ArrayList;

public class Pasta {
    private String naziv;
    private String cena;
    private ArrayList<Sastojak> listaSastojaka;


    public Pasta() {
        listaSastojaka = new ArrayList<Sastojak>();
    }

    public void dodavanjeSastojaka(Sastojak s) {
        listaSastojaka.add(s);

    }
}

