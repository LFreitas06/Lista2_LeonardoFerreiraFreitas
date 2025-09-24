package Lista2;

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = entrada.nextInt();

        System.out.print("Digite o valor de y (expoente): ");
        int y = entrada.nextInt();

        long resultado = 1;

        if (y >= 0) {
            for (int i = 0; i < y; i++) {
                resultado *= x;
            }
        } else {
            System.out.println("Este programa não suporta expoentes negativos sem biblioteca Math.");
            entrada.close();
            return;
        }

        System.out.println(x + "^" + y + " = " + resultado);

        entrada.close();
    }
}
