package exercícios;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LocalDate data = LocalDate.now();

        int anoNascimento, anoAtual, idade;

        System.out.print("Digite sua data de nascimento: ");
        anoNascimento = sc.nextInt();

        anoAtual = LocalDate.now().getYear();

        idade = anoAtual - anoNascimento;

        System.out.printf("Com a Data de hoje %s você tem atualmente %d anos ! ",data, idade);




    }

}
