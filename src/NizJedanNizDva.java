public class NizJedanNizDva {
    public static void main(String[] args) {

        ////Zadatak 6 - Napraviti jednocifreni niz (od 1 do 9), zatim potrebno je napraviti drugi niz
        ////koji ce sadrzati prva tri parna broja prvog niza
        int[] prviNiz = {1,2,3,4,5,6,7,8,9};
        int[] drugiNiz = new int[3];
        int j = 0;
        for (int i = 0; i < prviNiz.length; i++) {
            if (prviNiz[i]%2==0) {
                drugiNiz[j] = prviNiz[i];
                j++;
                if (j > 2) {
                    break;
                }
            }
        }

        for (int i = 0; i < drugiNiz.length; i++) {
            System.out.println(drugiNiz[i]);
        }

    }


        }



