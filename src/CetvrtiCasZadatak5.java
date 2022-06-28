import java.util.Scanner;

public class CetvrtiCasZadatak5 {
    public static void main(String[] args) {
        //Zadatak 5 - Korisnik unosi brojeve preko skenera i potrebno je racunati sumu
        // dok korisnik ne unese negativan broj - Koristiti DO WHILE

        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int i = 0;
        do {
            System.out.println("Unesi pozitivan broj");
            int x = sc.nextInt();
            i = x;
            suma = suma + x;
        } while (i>0);

        suma = suma - i;
        System.out.println("Suma je " + suma);
    }
}

