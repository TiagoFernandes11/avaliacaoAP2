package functions;

public class FibonacciSequence {
    private int number;
    private String resultado = "1, ";

    public FibonacciSequence(int number) {
        this.number = number;
        
    }

    private String fibonacciGenerator(int number){
        int anteriorValue = 0;
        int currentValue = 1;
        int result = 0;
        int size = number;
        return fibonacciGenerator(size, currentValue, anteriorValue, result, resultado);
    }
    private String fibonacciGenerator(int size, int number, int anteriorValue, int result, String resultado){
        if(size>0){
            result = number + anteriorValue;
            anteriorValue = number;
            number = result;
            size--;
            resultado += result + ", ";
            return fibonacciGenerator(size, number, anteriorValue, result, resultado);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return fibonacciGenerator(number);
    }

    
}
