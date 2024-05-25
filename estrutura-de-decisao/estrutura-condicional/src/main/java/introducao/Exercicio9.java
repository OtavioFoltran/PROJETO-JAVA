package introducao;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia;

        System.out.println("Digite o dia da semana de Hoje: ");
        dia = sc.nextInt();

        if(dia == 1)

            System.out.println("Hoje é Domingo e estamos no começo da semana ainda!!");

        else if (dia == 2){

            System.out.println("Hoje é Segunda-Feira e estamos no começo da semana ainda!!");

            }
        if(dia == 3){

            System.out.println("Hoje é Terça-Feira e estamos no começo da semana ainda !!");
            }
        else if(dia == 4){

            System.out.println("Hoje é Quarta-Feira e estamos no meio da semana !!");
        }

        if (dia == 5){

            System.out.println("Hoje é Quinta-Feira e estamos Quase no fim da semana !!");
        }
        else if (dia == 6){

            System.out.println("Hoje é Sexta e estamos no fim da semana !!");
        }

        if( dia == 7){

            System.out.println("Hoje é Sabado e estamos no fim da semana !!");
        }
        else if(dia >= 8){
            System.out.println("ESTE DIA DA SEMANA NÃO EXISTE!!");
        }

            sc.close();
    }

}
