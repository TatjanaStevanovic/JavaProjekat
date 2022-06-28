package Facebook;

public class GlavnaKlasa {
     /*
    Kreirati klasu Reakcija koja ima tip reakcije (smajli, like, srce),
    ime i prezime korisnika koji je reagovao, getere, setere i konstruktore.

    Kreirati klasu FacebookPost koja ima:
    ime i prezime korisnika koji je stavio objavu
    tekst objave
    listu reakcija
    metodu reaguj, koja dodaje reakciju u listu
    privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
    metodu stampaj koja stampa info o postu u formatu:

    Dragoljub Boranijasevic
    Test ce biti u cetvrtak
    smajli 10 | like 15 | srce 2

    Iz glavne klase instancirati par reakcija i postova i ispisati info o postovima*/
     public static void main(String[] args) {

         Reakcija r1 = new Reakcija("Smajli", "Dragoljub Boranijasevic");
         Reakcija r2 = new Reakcija("Like", "Ruben Kovacevic");
         Reakcija r3 = new Reakcija("Srce", "Dositej Obradovic");
         Reakcija r4 = new Reakcija("Smajli", "Nikola Tesla");
         Reakcija r5 = new Reakcija("Like", "Novak Djokovic");
         Reakcija r6 = new Reakcija("Like", "Jovana Prekovic");

         FacebookPost f1 = new FacebookPost("Nikola Jokic", "Oce neko na basket..");
         f1.dodajReakciju(r1);
         f1.dodajReakciju(r2);
         f1.dodajReakciju(r3);
         f1.dodajReakciju(r4);
         f1.dodajReakciju(r5);
         f1.dodajReakciju(r6);

         f1.stampanje();






     }
}


