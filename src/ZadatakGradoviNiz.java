public class ZadatakGradoviNiz {

    public static void main(String[] args) {

        //Zadatak 1) Napraviti niz koji ce sadrzati nazive gradove i treba odstampati sve gradove osim grada "Prag"


        String grad[] = {"London", "Madrid", "Prag", "Beograd", "Pariz"};

        for (int i = 0; i < grad.length; i++) {
            if (!grad[i].equals("Prag")){
                System.out.println(grad[i]);
            }
        }

    }
}
