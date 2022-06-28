import java.util.Scanner;

public class CetvrtiCasZadatak4 {
    public static void main(String[] args) {

        //Zadatak 4 - Prikazati aritmeticku sredinu od 1 do N - Koristiti WHILE

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite N broj");
        double n = sc.nextDouble();

        int i = 0;
        double suma = 0 ;
        while (i<=n) {
            suma = suma + i;
            i++;
        }
        System.out.println("Suma je " + suma);
        System.out.println("Aritmeticka sredina je " + (suma/n));

    }
}


