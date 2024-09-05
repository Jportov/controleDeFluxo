package br.com.porto;

import java.util.Scanner;

/**
 * @author joão.porto
 */
public class CalculaMediaNotas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Você quer calcular a sua média? ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Digite a primeira nota: ");
            int num1 = s.nextInt();
            System.out.println("Digite a segunda nota: ");
            int num2 = s.nextInt();
            System.out.println("Digite a terceira nota: ");
            int num3 = s.nextInt();
            System.out.println("Digite a quarta nota: ");
            int num4 = s.nextInt();

            int media = (num1 + num2 + num3 + num4) / 4;

            if (media >= 7) {
                System.out.println("Você foi Aprovado! :D");
            } else if (media >= 5) {
                System.out.println("Você ficou de recuperação! :|");
            } else {
                System.out.println("Você foi reprovado, precisa se esforçar mais!:(" );
            }

            // Pergunta novamente para continuar ou parar
            System.out.println("Você quer calcular a sua média novamente? (Sim/Não) ");
            resposta = s.next();

        }
        System.out.println("Obrigado! Até a proxima!!");

        // Fechar o scanner
        s.close();
    }
}
