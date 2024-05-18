package exercícios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, ra;
        int nota1, nota2, nota3, media;


        System.out.print("Digite seu nome: ");
        nome = sc.next();

        System.out.print("Digite seu ra: ");
        ra = sc.nextLine();

        System.out.print("Digite sua Primeira nota: ");
        nota1 = sc.nextInt();

        System.out.print("Digite sua Segunda nota: ");
        nota2 = sc.nextInt();

        System.out.print("Digite sua terceira nota: ");
        nota3 = sc.nextInt();

        media = nota1 + nota2 + nota3;

        System.out.printf("Querido aluno  do RA %s Sua média foi %f.\n Obrigado pela sua Atenção !!");



    }

}
