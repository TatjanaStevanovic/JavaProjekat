public class NajmanjiInajveciClanNiz {
    public static void main(String[] args) {

        //Napraviti niz i prikazati njegov najveci i najmanji clan

        int[] niz = {12,56,5,-9,18,-2,1,99,-12,-4,77};
        int broj = niz[0];

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > broj) {
                broj = niz[i];
            }
        }
        System.out.println("Najveci broj je " + broj);


        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < broj) {
                broj = niz[i];
            }
        }
        System.out.println("Najmanji broj je " + broj);
    }
}


