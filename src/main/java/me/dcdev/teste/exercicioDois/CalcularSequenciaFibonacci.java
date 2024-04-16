package me.dcdev.teste.exercicioDois;

import java.util.Scanner;

public class CalcularSequenciaFibonacci {
    private static boolean containsInFibonacci(int number) {
        int before = 2, after = 3, backup = 0;

        if (number < 0) return false;
        while (before <= number) {
            if(before == number) return true;

            backup = after;
            after += before;
            before = backup;
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);
    
            System.out.print("Digite um numero e descubro se ele esta ou nao na sequencia de Fibonacci: ");
            int number = leitor.nextInt();
    
            if (containsInFibonacci(number)) {
                System.out.println(number + " esta na sequencia de Fibonacci.");
            } else {
                System.out.println(number + " nao esta na sequencia de Fibonacci.");
            }
        } catch (Exception exception) {
            System.out.println("Valor especificado não corresponde a um número inteiro!");
        }
    }
}
