package input;

import java.util.Arrays;
import java.util.Scanner;

public class IntInput {
    private Scanner scanner = new Scanner(System.in);
    private int[] result;
    private int[] rawInput;
    private int[] filtredArray;

    
    

    public IntInput(int number) {
        result = new int[number];
        rawInput = new int[number];
        System.out.println("Entre com " + number + " valores inteiro: ");
        for(int i =0; i < number; i++){
            int input = scanner.nextInt();
            rawInput[i] = input;
            if(!checkForRepetition(result, input)){
                result[i] = input;
            }
            
        }
        filtredArray = removeNullValues(result);
        
    }

    private int[] removeNullValues(int[] result){
        int nullCounter = 0;
        for(int i = 0; i < result.length; i++){
            if(result[i] == 0){
                nullCounter++;
            }
        }
        int[] finalResult = new int[result.length - nullCounter];
        int n = 0;
        for(int i = 0; i < result.length; i++){
            if(result[i] != 0){
                finalResult[n] = result[i];
                n++;
            }
        }
        return finalResult;
    }

    private boolean checkForRepetition(int[] vetor, int number){
        for(int i = 0; i < vetor.length; i++){
            if(number == vetor[i]){
                return true;
            }
        }
        return false;
        
    }
    


    @Override
    public String toString() {
        
        return  Arrays.toString(getFiltredArray());
        }

    public Scanner getScanner() {
        return scanner;
    }

    public int[] getResult() {
        return result;
    }

    public int[] getRawInput() {
        return rawInput;
    }

    public int[] getFiltredArray() {
        return filtredArray;
    }

    
    
}
