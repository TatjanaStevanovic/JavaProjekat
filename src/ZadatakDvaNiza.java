public class ZadatakDvaNiza {
    public static void main(String[] args) {

        //Zadatak 5 - Napraviti dva niza i prikazati koji niz ima vise clanova, a koji niz ima vecu sumu

        int[] niz1 = {1,2,3,4};
        int[] niz2 = {7,9,2};

        if (niz1.length > niz2.length) {
            System.out.println("Prvi niz ima vise clanova");
        } else if (niz1.length == niz2.length) {
            System.out.println("Nizovi imaju isti broj clanova");
        } else {
            System.out.println("Drugi niz ima vise clanova");
        }

        int sumaPrvogNiza = 0;
        int sumaDrugogNiza = 0;

        for (int i = 0; i < niz1.length; i++) {
            sumaPrvogNiza = sumaPrvogNiza + niz1[i];
        }
        for (int i = 0; i < niz2.length; i++) {
            sumaDrugogNiza = sumaDrugogNiza + niz2[i];
        }

        if (sumaPrvogNiza > sumaDrugogNiza) {
            System.out.println("Suma prvog niza je veca od sume drugog niza");
        } else if (sumaPrvogNiza == sumaDrugogNiza) {
            System.out.println("Nizovi imaju jednake sume");
        } else {
            System.out.println("Suma drugog niza je veca od sume prvog niza");
        }
    }
}





