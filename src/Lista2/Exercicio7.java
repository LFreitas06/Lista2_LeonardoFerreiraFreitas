package Lista2;

import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o salário do funcionário: ");
        double salario = entrada.nextDouble();

        System.out.print("Informe o código do cargo (1 a 5): ");
        int codigo = entrada.nextInt();

        String cargo;
        double percentual;

        switch (codigo) {
            case 1:
                cargo = "Escriturário";
                percentual = 50;
                break;
            case 2:
                cargo = "Secretário";
                percentual = 35;
                break;
            case 3:
                cargo = "Caixa";
                percentual = 20;
                break;
            case 4:
                cargo = "Gerente";
                percentual = 10;
                break;
            case 5:
                cargo = "Diretor";
                percentual = 0;
                break;
            default:
                cargo = "Inválido";
                percentual = -1; // marcador pra inválido
                break;
        }

        if (percentual == -1) {
            System.out.println("Código inválido! Nenhum aumento aplicado.");
        } else {
            double aumento = salario * (percentual / 100);
            double novoSalario = salario + aumento;

            System.out.println("Cargo: " + cargo);
            System.out.println("Salário atual: R$ " + salario);
            System.out.println("Percentual de aumento: " + percentual + "%");
            System.out.println("Valor do aumento: R$ " + aumento);
            System.out.println("Novo salário: R$ " + novoSalario);
        }

        entrada.close();
    }
}
