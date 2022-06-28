import java.util.Scanner;

public class Skener {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Molimo vas unesite neki broj");
        int x = sc.nextInt();

        System.out.println("Uneli ste broj " + x);

        //---------------------------------------

        System.out.println("Molimo vas unesite neku double vrednost");

        double y = sc.nextDouble();

        System.out.println("Uneli ste double vrednost " + y);

        //-----------------------------------------

        System.out.println("Molimo vas unesite neki string");

        String z = sc.next();

        System.out.println("Uneli ste string " + z);

    }
}
