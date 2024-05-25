package introducao;

import org.w3c.dom.ls.LSOutput;

public class EtruturaDeDecisao {

    public static void main(String[] args) {

        double n1, n2, n3, media;


        n1 = 8;
        n2 = 8;
        n3 = 8;

        media = (n1 + n2 + n3) /3;

        if (media > 7.0){
            System.out.printf("Sua média foi %.1f e você foi APROVADO\n", media);
        }

        else if (media > 5.0 && media < 7.0) {
            System.out.printf("Sua média foi %.1f e você esta de RECUPERACÂO\n", media);
        }

        else {
            System.out.printf("Sua média foi %.1f e você foi REPROVADO\n", media);
        }

        System.out.println("Muito obrigado por tirar sua média conosco !!");
    }

}
