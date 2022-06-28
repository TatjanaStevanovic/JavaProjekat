package KlaseRadnik;

public class Radnik {

//Zadatak 2 - Napraviti paket "KlaseRadnik" i dve klase - "Radnik" i "MainKlasa". U klasi Radnik deklarisati public atribute jmbg (tipa long), ime i prezime (jedan string), broj dece, stepen strucne spreme i radni staz.
//Kreirati pun konstruktor za sve atribute
//Potrebno je izracunati da li je korisnik sposoban za kredit. Ako ima platu vecu od 50000 onda je true, ako ima ispod onda je false
//Platu racunamo tako sto ce se zbir koeficijenta i minulog rada pomnoziti sa 10 000 i na to dodati jos 2500
//Koeficijent se racuna zavisno od stepena strucne spreme preko switch-a
//Stepen strucne spreme moze biti 1,2,3,4 i koeficijent po tom redosledu je 1.03, 2.00, 2.88, 3.40
//Minuli rad se racuna zavisno od radnog staza. Ako je radni staz kraci od 10 godina onda je minuli rad 0.05. Ako je izmedju 10 i 20 onda je 0.75 i ako je duzi od 20 onda je 1.0
//Potrebno je izracunati i dane godisnjeg odmora tako sto ce se broj dece pomnoziti sa 2 i na to dodati 22 dana
//Podatke odstampati van MainKlase
//Svaka metoda, sem stampanja, treba biti return type

    //Prvo cu napraviti paket i klase
    //Zatim cu definisati atribute
    //Posle toga pravim konstruktor
    //Precica za konstruktor je alt + insert
    //Radim koeficijent jer je potreban za racunanje plate
    //Potom radim metodu za minuli rad
    //Sada imam sve potrebne informacije za platu
    //Kada dobijem platu mogu da proverim i za kredit
    //Na kraju racunam slobodne dane ali sam njih mogao i na pocetku da radim jer mi ne trebaju novi podaci
    public long jmbg;
    public String imeIPrezime;
    public int brojDece;
    public int stepenStrucneSpreme;
    public int radniStaz;

    public Radnik(long jmbg, String imeIPrezime, int brojDece, int stepenStrucneSpreme, int radniStaz) {
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepenStrucneSpreme = stepenStrucneSpreme;
        this.radniStaz = radniStaz;
    }

    public double koeficijent() {
        double koeficijent = 0;
        switch (this.stepenStrucneSpreme) {
            case 1:
                koeficijent = 1.03;
                break;
            case 2:
                koeficijent = 2.00;
                break;
            case 3:
                koeficijent = 2.88;
                break;
            case 4:
                koeficijent = 3.40;
                break;
            default:
                koeficijent = 1;
        }
        return koeficijent;
    }

    public double minuliRad() {
        if (this.radniStaz < 10) {
            return 0.05;
        } else if (this.radniStaz < 20) {
            return 0.75;
        } else {
            return 1;
        }
    }

    public double plata() {
        double plata = 0;
        plata = 2500 + (this.koeficijent() + this.minuliRad()) * 10000;
        return plata;
        //drugi nacin
        //return 2500 + (this.koeficijent() + this.minuliRad()) * 10000;
    }

    public boolean kredit() {
        if (this.plata() > 40000) {
            return true;
        } else {
            return false;
        }
        //drugi nacin
        //return (this.plata() > 50000);
    }

    public int brojDana() {
        return 22 + (this.brojDece * 2);
    }

    public void stampanje() {
        System.out.println("Radnik " + this.imeIPrezime + " sa jmbg-om: " + this.jmbg);
        System.out.println("Ima " + this.brojDece + " dece");
        System.out.println("Radni staz je dug " + this.radniStaz + " godina");
        System.out.println("Sa stepenom strucne spreme " + this.stepenStrucneSpreme);
        System.out.println("Godisnje ima " + this.brojDana() + " slobodnih dana");
        System.out.println("Ima platu " + this.plata());
        System.out.print("Kredit odobren? " + this.kredit());
        if (this.kredit()) {
            System.out.println("Odobren");
        }

    }

}




