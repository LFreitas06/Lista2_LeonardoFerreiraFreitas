package Lista2;

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Informe o divisor: ");
        int divisor = entrada.nextInt();

        System.out.print("Informe o início do intervalo: ");
        int inicio = entrada.nextInt();

        System.out.print("Informe o fim do intervalo: ");
        int fim = entrada.nextInt();


        if (divisor == 0) {
            System.out.println("Erro: não existe divisão por zero!");
            entrada.close();
            return;
        }

        if (inicio > fim) {
            System.out.println("Erro: o início do intervalo não pode ser maior que o fim!");
            entrada.close();
            return;
        }

        System.out.print("Números divisíveis por " + divisor +
                " no intervalo de " + inicio + " a " + fim + ": ");

        boolean achou = false;
        for (int i = inicio; i <= fim; i++) {
            if (i % divisor == 0) {
                System.out.print(i + " ");
                achou = true;
            }
        }

        if (!achou) {
            System.out.print("Nenhum número encontrado.");
        }

        System.out.println();

        entrada.close();
    }
}
