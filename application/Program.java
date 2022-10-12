package application;

import entities.IntersectionArrayInt;
import functions.FibonacciSequence;
import functions.RandomIntegerArrayGen;
import functions.RegressiveCount;
import input.IntInput;

public class Program {
    public static void main(String[] args) {




        
        System.out.println("Gerador do vetor intersecção");
        RandomIntegerArrayGen randomArray = new RandomIntegerArrayGen(10);
        IntInput inputArray = new IntInput(5);

        System.out.println("Vetor de entradas: \n" + inputArray + "\n");
        System.out.println("Vetor gerado: \n" + randomArray + "\n");
        
        System.out.println(new IntersectionArrayInt(randomArray.getResult(), inputArray.getResult()));
    }
}
