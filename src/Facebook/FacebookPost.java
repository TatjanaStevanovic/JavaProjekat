package Facebook;

import java.util.ArrayList;

public class FacebookPost {
    private String imeIPrezime;
    private String textObjave;
    private ArrayList<Reakcija> reakcije;

    public FacebookPost(String imeIPrezime, String textObjave) {
        this.imeIPrezime = imeIPrezime;
        this.textObjave = textObjave;
        this.reakcije = new ArrayList<Reakcija>();
    }

    public void dodajReakciju(Reakcija r) {
        reakcije.add(r);
    }

    private int prebrojavanje(String tipReakcije) {
        int brojac = 0;
        for (int i = 0; i < reakcije.size(); i++) {
            if (reakcije.get(i).getTipReakcije().equals(tipReakcije)) {
                brojac++;
            }
        }
        return brojac;
    }

    public void stampanje() {
        System.out.println(this.imeIPrezime);
        System.out.println(this.textObjave);
        System.out.println("Smajli: " + prebrojavanje("Smajli") + " | " + "Like: " + prebrojavanje("Like") + " | "
                + "Srce: " + prebrojavanje("Srce"));
    }



}


