package exercícios;
import java.util.Random;
import java.util.Scanner;


public class Exercicio6 {

    public static void main(String[] args) {

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        String nome, curso, RA;
        byte idade;
        char genero;

        System.out.print("Digite seu nome para cadastro: ");
        nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        idade = sc.nextByte();
        sc.nextLine();

        System.out.print("Digite seu Genero: :");
        String texto = sc.nextLine();
        genero = texto.toUpperCase().charAt(0);

        System.out.print("Digite o seu curso: ");
        curso = sc.nextLine();

        //RA = nome.charAt(0) + String.valueOf(rd.nextInt(100);

        RA = nome.substring(0,1) + rd.nextInt(100);

        System.out.printf("Seu nome é %s e ele possui %s letras, sua idade é %d e seu genero é %s e " + "Você se inscreveu no curso de %s Com o RA %s", nome.toUpperCase(), nome.length(), idade,  genero, curso.toLowerCase(), RA);

        sc.close();



    }

}
