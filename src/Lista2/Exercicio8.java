package Lista2;

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o código (1 a 4): ");
        int codigo = entrada.nextInt();

        System.out.print("Informe o valor de x: ");
        double x = entrada.nextDouble();

        System.out.print("Informe o valor de y: ");
        double y = entrada.nextDouble();

        double resultado = 0;
        boolean valido = true;

        switch (codigo) {
            case 1:
                if (y == 0) {
                    System.out.println("Erro: divisão por zero em y²!");
                    valido = false;
                } else {
                    resultado = (Math.pow(x, 3) + (x * (2 * y - x))) / Math.pow(y, 2);
                }
                break;

            case 2:
                if (x * y == 0) {
                    System.out.println("Erro: divisão por zero em x*y!");
                    valido = false;
                } else {
                    double numerador = Math.sqrt(Math.pow(x, 3) + Math.pow(y, 3)) + (Math.pow(x, 3) - Math.pow(y, 3));
                    resultado = numerador / (x * y);
                }
                break;

            case 3:
                if (x < 0) {
                    System.out.println("Erro: raiz quadrada de número negativo!");
                    valido = false;
                } else {
                    resultado = 2 * x + Math.sqrt(x * y);
                }
                break;

            case 4:
                resultado = Math.sin(x) + Math.cos(y);
                break;

            default:
                System.out.println("Código inválido!");
                valido = false;
                break;
        }

        if (valido) {
            System.out.println("Resultado de f(x,y): " + resultado);
        }

        entrada.close();
    }
}
