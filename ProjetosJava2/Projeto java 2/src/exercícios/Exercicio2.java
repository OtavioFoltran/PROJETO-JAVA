package exercícios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {

    public static void main (String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        final double PI = 3.1415;
        double raio, area;

        System.out.print("Entre com o raio do círculo: " );
        raio = sc.nextDouble();

        area = PI * (raio * raio);

        System.out.printf("A área do circulo com o raio: %.2f é igual a: %.2f ", raio, area);






        sc.close();


    }
}