package VideoPlayer;

    public class VideoPlayer {
        /*
    Kreirati klasu VideoPlayer koja ima
private atribute duzina videa, jacina zvuka, trenutno vreme videa i kvalitet videa
kreirati pun konstruktor, getere, setere i metodu koja ce da stampa u formatu
Trenutno vreme videa:
Trenutna jacina zvuka:
Trenutni kvalitet videa:
--------------------------
     */

        private double duzinaVidea;
        private double trenutnoVremeVidea;
        private int jacinaZvuka;
        private int kvalitetVidea;

        public VideoPlayer(double duzinaVidea, double trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
            this.duzinaVidea = duzinaVidea;
            this.trenutnoVremeVidea = trenutnoVremeVidea;
            this.jacinaZvuka = jacinaZvuka;
            this.kvalitetVidea = kvalitetVidea;
        }

        public double getDuzinaVidea() {
            return duzinaVidea;
        }

        public void setDuzinaVidea(double duzinaVidea) {
            this.duzinaVidea = duzinaVidea;
        }

        public double getTrenutnoVremeVidea() {
            return trenutnoVremeVidea;
        }

        public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {
            this.trenutnoVremeVidea = trenutnoVremeVidea;
        }

        public int getJacinaZvuka() {
            return jacinaZvuka;
        }

        public void setJacinaZvuka(int jacinaZvuka) {
            this.jacinaZvuka = jacinaZvuka;
        }

        public int getKvalitetVidea() {
            return kvalitetVidea;
        }

        public void setKvalitetVidea(int kvalitetVidea) {
            this.kvalitetVidea = kvalitetVidea;
        }

        public void stampanje() {
            System.out.println("Trenutno vreme videa: " + this.trenutnoVremeVidea);
            System.out.println("Trenutna jacina zvuka: " + this.jacinaZvuka);
            System.out.println("Trenutni kvalitet videa: " + this.kvalitetVidea);
            System.out.println("---------------------");
        }

    }



