package functions;

import java.util.Arrays;
import java.util.Random;

public class RandomIntegerArrayGen {

    private Random rdn = new Random();

    private int number;

    public int[] result;

    public RandomIntegerArrayGen(int number) {
        this.number = number;
        result = new int[number];
        for(int i = 0; i < number; i++){
            result[i] = rdn.nextInt(99);
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(result) + "";
    }

    

    
}
