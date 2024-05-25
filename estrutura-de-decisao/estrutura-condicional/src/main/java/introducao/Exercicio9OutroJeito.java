package introducao;

import java.util.Scanner;

public class Exercicio9OutroJeito {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String data;
        String resultado;

        System.out.println("Digite o dia da semana: ");
        data = sc.nextLine();

        try {

            int numero = Integer.parseInt(data);

        }

        switch (numero) {

            case 1:
                resultado = "Domingo";
                break;

            default:
                resultado = "Valor Inválido";
                break;
        }

    } catch (NumberFormatException e) {

        switch (data) {

            case "Domingo":
                resultado = "1";
                break;

        }

    }


}
