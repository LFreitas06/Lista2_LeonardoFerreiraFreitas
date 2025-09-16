package Lista2;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade para saber sua situação eleitoral: ");
        int idade = entrada.nextInt();
        
        if (idade < 16){
            System.out.println("Não pode votar!");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Voto optativo!");
        } else if (idade >= 18 && idade < 66) {
            System.out.println("Voto obrigatorio!");
        } else if (idade > 65) {
            System.out.println("Dispensado!");
        }

        entrada.close();
    }
}
