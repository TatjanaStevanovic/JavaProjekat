import java.util.Scanner;

public class Swich {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi broj dana u nedelji");
        int broj = sc.nextInt();

        switch (broj) {
            case 1:
                System.out.println("Ponedeljak");
                break;
            case 2:
                System.out.println("Utorak");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            case 4:
                System.out.println("Cetvrtak");
                break;
            case 5:
                System.out.println("Petak");
                break;
            case 6:
                System.out.println("Subota");
                break;
            case 7:
                System.out.println("Nedelja");
                break;
            default:
                System.out.println("Niste uneli ispravan broj");
                break;

        }

        System.out.println("Unesite string dan u nedelji");
        String dan = sc.next();

        switch (dan) {
            case "Ponedeljak":
                System.out.println("1");
                break;
            case "Utorak":
                System.out.println("2");
                break;
            case "Sreda":
                System.out.println("3");
                break;
            case "Cetvrtak":
                System.out.println("4");
                break;
            case "Petak":
                System.out.println("5");
                break;
            case "Subota":
                System.out.println("6");
                break;
            case "Nedelja":
                System.out.println("7");
                break;
            default:
                System.out.println("Niste uneli dan u nedelji");
                break;

        }
    }
}
