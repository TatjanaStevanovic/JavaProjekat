import java.util.Scanner;

public class CetvrtiCasZadatak6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko redova zelite?");
        int n = sc.nextInt();

        String zvezda = "";
        for (int i = 0; i <= n; i++) {
            String zvezdica = "*";
            zvezda = zvezda + zvezdica;
            System.out.println(zvezda);
        }


    }
}

