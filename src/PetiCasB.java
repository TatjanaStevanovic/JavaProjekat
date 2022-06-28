public class PetiCasB {

    public static void main(String[] args) {
        profili(2);
    }

    public static void profili(int x) {

        String[] ime = {"Andrej ", "Mira ", "Sara "};
        String[] prezime = {"Kolic ", "Milovanovic ", "Petkovic "};
        int[] godine = {23, 64, 29};

        String[] profil = {ime[0] + prezime[0] + godine[0],
                ime[1] + prezime[1] + godine[1],
                ime[2] + prezime[2] + godine[2]};

        System.out.println(profil[x]);

    }
}
