package Lista2;

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        String nome = entrada.nextLine();
        System.out.println("Informe a nota 1: ");
        double nota1 = entrada.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("NOTA INVALIDA! Informe a nota 1 novamente: ");
            nota1 = entrada.nextDouble();
        }
        System.out.println("Informe a nota 2: ");
        double nota2 = entrada.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("NOTA INVALIDA! Informe a nota 2 novamente: ");
            nota2 = entrada.nextDouble();
        }
        System.out.println("Informe a nota 3: ");
        double nota3 = entrada.nextDouble();
        while (nota3 < 0 || nota3 > 10) {
            System.out.println("NOTA INVALIDA! Informe a nota 3 novamente: ");
            nota3 = entrada.nextDouble();
        }
        System.out.println("Informe a media dos exercicios: ");
        double mediaExercicios = entrada.nextDouble();
        while (mediaExercicios < 0 || mediaExercicios > 10) {
            System.out.println("NOTA INVALIDA! Informe a media dos exercicios novamente: ");
            mediaExercicios = entrada.nextDouble();
        }
        double media = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios)/7;

        String conceito = "";
        if (media >= 9.0 && media <= 10.0){
            conceito = "A";
        } else if (media >= 7.5 && media < 9){
            conceito = "B";
        }
        else if (media >= 6.0 && media < 7.5){
            conceito = "C";
        }
        else if (media >= 4.0 && media < 6.0){
            conceito = "D";
        } else if (media< 4.0){
            conceito = "E";
        }

        System.out.println("Aluno: " + nome);
        System.out.printf("Media de aproveitamento: %.2f\n", media);
        System.out.println("Conceito: " + conceito);
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")){
            System.out.println("APROVADO!");
        } else{
            System.out.println("REPROVADO!");
        }


        entrada.close();
    }
}
