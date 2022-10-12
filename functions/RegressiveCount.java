package functions;

public class RegressiveCount {
    private int number;
    private String resultado = "";
    

    public RegressiveCount(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private String regressiveCountString(int number){
        return regressiveCountString(this.number, this.resultado);
    }

    private String regressiveCountString(int number, String resultado){
        if(number >= 0){
            resultado += number + "\n";
            number--;
            return regressiveCountString(number, resultado);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return regressiveCountString(number);
    }

    
}
