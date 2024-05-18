package exercícios;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

double gc, fa, ke, re, ra;

        System.out.print("Digite a temperatura em Graus Celsius: ");
        gc = sc.nextDouble();

fa = (gc * 1.8) + 32;
ke = (gc + 273.15);
re = (gc / 1.25);
ra = (gc * 1.8) + 491.67;




        System.out.printf("A temperatura %.1f em Fahrenheit é igual a %.1f %n", gc, fa);
        System.out.printf("A temperatura %.1f em Kelvin é igual a %.1f %n", gc, ke);
        System.out.printf("A temperatura %.1f em Réaumur é igual a %.1f %n", gc, re);
        System.out.printf("A temperatura %.1f em Rankine é igual a %.1f %n", gc, ra);

    }
}
