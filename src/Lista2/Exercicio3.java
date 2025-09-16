package Lista2;

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println();

        System.out.println("Informe o valor da compra: ");
        double valorVenda;
        double ValorCompra = entrada.nextDouble();
        while(ValorCompra < 0){
            System.out.println("VALOR INVALIDO! informe novamente o valor da compra: ");
            ValorCompra = entrada.nextDouble();
        }

        if (ValorCompra < 10.00){
            valorVenda = ValorCompra + (ValorCompra * 0.70);
            System.out.println("O valor de venda é: " + valorVenda);
        } else if (ValorCompra > 10.00 && ValorCompra < 30.00) {
            valorVenda = ValorCompra + (ValorCompra * 0.50);
            System.out.println("O valor de venda é: " + valorVenda);
        } else if (ValorCompra > 30.00 && ValorCompra < 50.00) {
            valorVenda = ValorCompra + (ValorCompra * 0.40);
            System.out.println("O valor de venda é: " + valorVenda);
        } else if (ValorCompra >= 50.00) {
            valorVenda = ValorCompra + (ValorCompra * 0.30);
            System.out.println("O valor de venda é: " + valorVenda);
        }

        entrada.close();
    }

}

