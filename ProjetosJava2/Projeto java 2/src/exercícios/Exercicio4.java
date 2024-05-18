package exercícios;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double pagar, pagar2;
        double dias, km, total;

        System.out.print("Quantos dias você ficou com o carro? : ");
        dias = sc.nextDouble();

        System.out.print("Quantos KM você andou com o carro? : ");
        km = sc.nextDouble();

        pagar = (dias * 86.75);
        pagar2 = (km * 1.23);
        total = pagar + pagar2;



        System.out.printf("Você irá pagar para a empresa R$ %.2f pelo aluguel do carro !", total);








    }

}
