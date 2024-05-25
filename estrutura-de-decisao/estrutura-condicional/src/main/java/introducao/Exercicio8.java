package introducao;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double conta = 79.30;
        int tempo;

        System.out.print("Digite quantos minutos você utilizou: ");
        tempo = sc.nextInt();


        if (tempo > 100){
            conta += (tempo - 100) * 2.30;
        }

        System.out.printf("Valor da conta = %.2f", conta);



            sc.close();
        }







    }

