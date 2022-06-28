package Kartica;

public class GlavnaKlasa {
    /*
    Napravi klasu Platna kartica koja ce imati atribute
suma, broj kartice, mesec i godina
Metodu dodajSredstva koja ce dodavati sredstva za unetu vrednost
Metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna
Metodu koja stampa podatke o kartici u formatu:
7105-1579-5191-6184, 11/2024, $212
Za klasu Platna kartica napraviti samo getere

Napraviti klasu Visa kartica koja nasledjuje klasu Platna kartica
Napraviti atribut ime i prezime za klasu
Geter i seter za atribut
Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.8%
Najmanja provizija je 4$
Implementirati metodu koja stampa karticu u formatu:
Visa card: 7105-1579-5191-6184, 11/2024, $212 Ime i Prezime

Napraviti klasu Master kartica koja nasledjuje klasu Platna kartica
Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.5%
Napraviti metodu odrzavanja racuna koja je 2$
Implementirati metodu koja stampa karticu u formatu:
Master card: 7105-1579-5191-6184, 11/2024, $212

     */

    public static void main(String[] args) {
        VisaKartica v1 = new VisaKartica(1000, 11, 2024, "6423-4245-6583-8791", "Dragoljub Boranijasevic");
        v1.stampanje();
        v1.izvrsiTransakciju(500);
        v1.stampanje();
        v1.dodajSredstva(500);
        v1.stampanje();

        MasterKartica m1 = new MasterKartica(500, 04,2025, "5124-4157-7532-6878");
        m1.stampanje();
        m1.odrzavanjeRacuna();
        m1.stampanje();
        m1.izvrsiTransakciju(100);
        m1.stampanje();
        m1.dodajSredstva(1000);
        m1.stampanje();


    }
}

