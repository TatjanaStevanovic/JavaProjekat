import java.util.Scanner;

public class CetvrtiCas2 {
    public static void main(String[] args) {

        //Preimenovanje promenljivih se radi preko Refactora
        //Desni klik na promenljivu -> Refactor -> Rename

        //Sabrati sve brojeve od 1 do 5
        int suma = 0;
        for (int i = 1; i < 5; i++) {
            suma = suma + i;

            System.out.println("Trenutna suma je: " + suma);
            System.out.println("A trenutni i je " + i);
            System.out.println("--------");
        }

        System.out.println("Konacna suma je " + suma);

        //---------------

        //Pomnoziti sve parne brojeve od 1 do 10

        int proizvod = 1;

        for (int i = 1; i < 10; i++) {
            System.out.println("Trenutni i je " + i);
            if (i%2 == 0) {
                System.out.println("Trenutni i je paran");
                proizvod = proizvod * i;
            }
            System.out.println("Trenutni proizvod je " + proizvod);
            System.out.println("------------");

        }

        System.out.println("Konacni proizvod je " + proizvod);

        //Napraviti petlju koja ce racunati sumu do N broja (N broj se unosi preko skenera)
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite N broj");
        int n = sc.nextInt();
        suma = 0;

        for (int i = 1; i < n; i++) {
            suma += i;
            System.out.println("Trenutna suma je " + suma);
        }

        System.out.println("Ukupna suma do broja N je " + suma);

        //Uneti 5 brojeva unutar petlje i prikazati najveci

        // 1 2 9 4 3
        int max = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Unesi " + i + ". broj");
            int x = sc.nextInt();
            if (x > max) {
                max = x;
            }
            System.out.println("Trenutni maksimalni broj je " + max);
        }
        System.out.println("Maksimalni broj je " + max);


    }
}


