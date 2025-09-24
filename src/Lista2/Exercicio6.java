package Lista2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o código do produto: ");
        int codigo = entrada.nextInt();

        String classificacao;

        switch (codigo) {
            case 1:
                classificacao = "Alimento não-perecível";
                break;
            case 2: case 3: case 4:
                classificacao = "Alimento perecível";
                break;
            case 5: case 6:
                classificacao = "Vestuário";
                break;
            case 7:
                classificacao = "Higiene pessoal";
                break;
            default:
                if (codigo >= 8 && codigo <= 15) {
                    classificacao = "Limpeza e utensílios domésticos";
                } else {
                    classificacao = "Inválido";
                }
                break;
        }

        System.out.println("Classificação: " + classificacao);

        entrada.close();
    }
}
