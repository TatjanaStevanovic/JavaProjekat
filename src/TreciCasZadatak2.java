import java.util.Scanner;

public class TreciCasZadatak2 {
    public static void main(String[] args) {

        //Zadatak 2 - Potrebno je napraviti program koji ce ispitati godine korisnika i da li ce korisnik moci da
        // polaze za vozacku dozvolu. Ako korisnik ima vise od 17 godina treba ispisati
        // "Mozete polagati za vozacku dozvolu", ako ima tacno 17 godina treba ispisati
        // "Mozete polagati za vozacku dozvolu vec ove godine", a ako ima manje od 17 treba ispisati
        // "Mozete polagati za vozacku dozvolu za x godina" gde je x promenljiva u zavisnosti
        // koliko korisniku treba do 17 godina

        ////&& - and
        ////|| - or

//Zadatak 2 - Potrebno je napraviti program koji ce ispitati godine korisnika i da li ce korisnik
        // moci da polaze za vozacku dozvolu. Ako korisnik ima vise od 17 godina treba ispisati
        // "Mozete polagati za vozacku dozvolu", ako ima tacno 17 godina treba ispisati
        // "Mozete polagati za vozacku dozvolu vec ove godine", a ako ima manje od 17 treba ispisati
        // "Mozete polagati za vozacku dozvolu za x godina" gde je x promenljiva u zavisnosti koliko korisniku treba do 17 godina

        System.out.println("Koliko imate godina?");
        Scanner sc = new Scanner(System.in);

        int godine = sc.nextInt();

        //&& - AND
        //|| - OR

        //uslovi se pisu unutar obicnih zagrada (), a body se pise unutar viticastih zagrada{}
        //condition1 && condition2 -> oba uslova moraju biti tacna
        //condition1 || condition2 -> jedan od ova dva uslova mora biti tacan
        //(condition1 || condition2) && condition3 -> prvi ili drugi uslov moze biti tacan, treci uslov mora biti tacan
        if (godine > 17 && godine < 65) {
            //ovaj deo koji se nalazi unutar nekog IF-a ili ELSE-a se naziva "Body"
            System.out.println("Mozete polagati za vozacku dozvolu");
        } else if (godine == 17) {
            System.out.println("Mozete polagati za vozacku dozvolu vec ove godine");
        } else if (godine < 17 && godine > 0) {
            System.out.println("Mozete polagati za vozacku dozvolu za " + (17 - godine) + " godina");
        } else if (godine >= 65) {
            System.out.println("Ne mozete polagati za vozacku dozvolu ako imate vise od 65 godina");
        } else { //koristimo samo else jer smo pokrili sve ostale slucajeve u prethodnim uslovima
            System.out.println("Unesite pozitivan broj");
        }


    }
}

