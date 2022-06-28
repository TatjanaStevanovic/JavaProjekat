public class NizDesetBrojeva {
    public static void main(String[] args) {

        //Napisati niz od 10 brojeva koji ce se sabirati do 100, kada predje 100 treba ispisati za koliko je presao
        //        //Na primer ako imamo niz 80, 10, 9, 3, 5, 7, 22, 90, 8
        //        //Treba da nam ispise 80, 10, 9, 3 i onda poruka "Presli ste granicu za 2"

        int niz[] = {80,10,9,3,5,7,22,90,8};
        int zbir = 0;

        for (int i = 0; i < niz.length; i++) {
            System.out.println("Dodat je broj " + niz[i]);
            zbir = zbir + niz[i];
            System.out.println("Trenutni zbir je " + zbir);
            if (zbir > 100) {
                System.out.println("Presli ste maksimum za "+(zbir - 100) );
                break;
            }
        }
    }
}


