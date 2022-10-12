package application;

import java.util.Scanner;

import entities.IntersectionArrayInt;
import functions.FibonacciSequence;
import functions.RandomIntegerArrayGen;
import functions.RegressiveCount;
import input.IntInput;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Contagem regressiva: \n\n");
        System.out.println("Digite o valor a ser contado regressivamente: ");
        System.out.println(new RegressiveCount(sc.nextInt()) + "\n\n");

        System.out.println("Sequencia de Fibonacci: \n\n");
        System.out.println("Digite o valor do tamanho do vetor de Fibonacci: ");
        System.out.println(new FibonacciSequence(sc.nextInt()) + "\n\n");

        System.out.println("Input desconsiderando repetições: \n\n");
        System.out.println("Digite o valor do tamanho do vetor de Entradas: ");
        System.out.println(new IntInput(sc.nextInt()) + "\n\n");

        System.out.println("Gerador do vetor intersecção: \n\n");
        RandomIntegerArrayGen randomArray = new RandomIntegerArrayGen(10);
        IntInput inputArray = new IntInput(5);

        System.out.println("Vetor de entradas: \n" + inputArray + "\n");
        System.out.println("Vetor gerado: \n" + randomArray + "\n");
        
        System.out.println(new IntersectionArrayInt(randomArray.getResult(), inputArray.getResult()));
    }
}
