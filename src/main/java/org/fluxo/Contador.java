package org.fluxo;

import java.util.Scanner;

//import static org.fluxo.Contador.contar;


public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parameterOne, parameterTwo, subtraction;

        System.out.print("Digite o valor do primeiro parâmetro: ");
        parameterOne = scanner.nextInt();

        System.out.print("Digite o valor do segundo parâmetro: ");
        parameterTwo = scanner.nextInt();

        try {

            subtraction = contar(parameterOne, parameterTwo);

            for (int i = 1; i < subtraction; i++) {
                System.out.println("Imprimindo número " + i);
            }

        }
        catch (ParametrosInvalidosException exception) {
            System.out.println(" " + exception.getMessage());

        }
    }
        static int contar (int parameterOne, int parameterTwo) throws ParametrosInvalidosException {

            if (parameterOne > parameterTwo) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            int score = parameterTwo - parameterOne;

            return score;
        }
}
