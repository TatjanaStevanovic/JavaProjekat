package VideoPlayer;

public class AudioControl {
     /*
    Kreirati klasu AudioControl koja nasledjuje klasu Control i koja ima samo jesam boolean atribut "pojaca". Kreirati konstruktor, geter i seter za atribut
Unutar klase kreirati metodu izvrsiAkciju koja pomera jacinu zvuka za 1 napred ili nazad zavisno da li je prosledjeni boolean true ili false. Ne moze se pojacati na vise od 100 ili manje od 0 volume.
Potrebna je i GlavnaKlasa za kreiranje objekata i izvrsavanje komandi
     */

    private boolean pojaca;

    public AudioControl(boolean pojaca) {
        this.pojaca = pojaca;
    }

    public boolean isPojaca() {
        return pojaca;
    }

    public void setPojaca(boolean pojaca) {
        this.pojaca = pojaca;
    }

    public void izvrsiAkciju(VideoPlayer vp) {
        if (pojaca) {
            if (vp.getJacinaZvuka() < 100) {
                vp.setJacinaZvuka(vp.getJacinaZvuka()+1);
            } else {
                vp.setJacinaZvuka(100);
            }
        } else {
            if (vp.getJacinaZvuka() > 0) {
                vp.setJacinaZvuka(vp.getJacinaZvuka()-1);
            } else {
                vp.setJacinaZvuka(0);
            }
        }
    }
}

