import java.util.Scanner;

public class CetvrtiCasZadatak1 {
    public static void main(String[] args) {
        //Zadatak 1 - Preko skenera uneti tri broja. Prvi broj ce odredjivati funkciju druga dva broja.
        // Ako se unese broj 1 onda druga dva moraju da se saberu, ako se unese 2 onda se od drugog oduzima treci,
        // ako se unese 3 onda se mnoze, ako se unese 4 onda se dele

        //Zadatak 1 - Preko skenera uneti tri broja.
// Prvi broj ce odredjivati funkciju druga dva broja.
// Ako se unese broj 1 onda druga dva moraju da se saberu,
// ako se unese 2 onda se od drugog oduzima treci,
// ako se unese 3 onda se mnoze, ako se unese 4 onda se dele

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj od 1 do 4");
        int a = sc.nextInt();

        System.out.println("Unesite bilo koji broj");
        double b = sc.nextDouble();
        System.out.println("Unesite bilo koji broj ponovo");
        double c = sc.nextDouble();

        switch (a) {
            case 1:
                double sabiranje = b + c;
                System.out.println("Sabiranje brojeva je " + sabiranje);
                break;

            case 2:
                double oduzimanje = b - c;
                System.out.println("Oduzimanje brojeva je " + oduzimanje);
                break;

            case 3:
                double mnozenje = b * c;
                System.out.println("Mnozenje brojeva je " + mnozenje);
                break;

            case 4:
                double kolicnik = b / c;
                System.out.println("Kolicnik brojeva je " + kolicnik);
                break;

            default:
                System.out.println("Niste uneli broj od 1 do 4");
                break;

        }

    }
}


