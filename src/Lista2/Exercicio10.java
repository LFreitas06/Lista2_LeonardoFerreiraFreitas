package Lista2;

import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = entrada.nextInt();

        if (n < 0) {
            System.out.println("Valor inválido! Não existe fatorial de número negativo.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println(n + "! = " + fatorial);
        }

        entrada.close();
    }
}
