package Lista2;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Informe um segundo número inteiro:");
        double numero2 = entrada.nextDouble();

        double resto = numero1 % numero2;
        if (resto == 0){
            System.out.println("O numero " + numero1 + " é divisível por " + numero2);
        }
        else {
            System.out.println("O numero " + numero1 + " não é divisível por " + numero2);
        }

        entrada.close();
    }
}
