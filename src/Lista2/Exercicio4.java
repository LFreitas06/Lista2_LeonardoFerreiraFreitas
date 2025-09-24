package Lista2;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        double SalarioMinimo = 788.00;
        double ValorHoraExtra = 10.00;

        System.out.println("Informe a matrícula do funcionário: ");
        int matricula = entrada.nextInt();
        System.out.println("Informe a quantidade de horas extras trabalhadas: ");
        double HorasExtras = entrada.nextDouble();

        double SalarioHoraExtra = HorasExtras * ValorHoraExtra;
        double salarioBruto = (3 * SalarioMinimo) + SalarioHoraExtra;
        double descontoINSS = salarioBruto * 0.12;
        double descontoImpostoDeRenda = salarioBruto * 0.20;

        double salarioLiquido = (salarioBruto - descontoINSS ) - descontoImpostoDeRenda;

        System.out.printf("Salário bruto do funcionário: %.2f \n", salarioBruto);
        System.out.printf("Salário líquido do funcionário: %.2f\n", salarioLiquido);

        entrada.close();


    }
}
