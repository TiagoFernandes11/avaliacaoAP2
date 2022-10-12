package entities;

import java.util.Arrays;

public class IntersectionArrayInt {
    private int[] result;

    public IntersectionArrayInt(int[] arrayOne, int[] arrayTwo) {
        int intersectionCount = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            for (int n = 0; n < arrayTwo.length; n++) {
                if (arrayOne[i] == arrayTwo[n]) {
                    intersectionCount++;
                }
            }
        }

        this.result = new int[intersectionCount];
        for (int j = 0; j < intersectionCount; j++) {
            for (int i = 0; i < arrayOne.length; i++) {
                for (int n = 0; n < arrayTwo.length; n++) {
                    if (arrayOne[i] == arrayTwo[n]) {
                        result[j] = arrayOne[i];
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Vetor Intersecção: \n" + Arrays.toString(result);
    }

    

    

}
