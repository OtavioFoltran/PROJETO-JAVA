package exercicios.java;

public class exercicio1 {
    public static void main (String[]args){

        String gameRPG = "Hogwarts Legacy";
        String gameIndie = "Hollow Knight";

        int age = 35;
        int code = 2367;
        char gender = 'M';

        double princeRPG = 107.80;
        double princeIndie = 46.99;
        double mediaPrince = (princeRPG + princeIndie) / 2;

                System.out.printf("O comprador tinha %d anos, code %d e genero: %s%n", age, code, gender);
                System.out.println(gameRPG + "esta custando: " + princeRPG);
                System.out.println(gameRPG + "esta custando: " + princeIndie);
                System.out.printf("A média dos dois jogos é de: %.2f ", mediaPrince);


    }
}
