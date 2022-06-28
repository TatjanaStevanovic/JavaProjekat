import java.util.Scanner;

public class ZadatakDvocifrenBroj {
    public static void main(String[] args) {

        // //Zadatak 3 - Uneti dvocifren broj i prikazati prvu i drugu cifru

        Scanner sc=new Scanner(System.in);
        System.out.println("Unesi dvocifren broj: ");
        int n= sc.nextInt();



        int x=n%10;
        int y=n/10;
        System.out.println("Cifra jedinica je " +x);
        System.out.println("Cifra desetica je " +y);
    }
}
