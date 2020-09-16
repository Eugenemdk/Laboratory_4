package division;
import multiplication.Multiplicator;

public class Divisor extends Multiplicator {
    public Divisor(int dividend, int divisor) {
        super(dividend, divisor);
    }

    @Override
    public double calc() {
        return dividend/divisor;
    }

    @Override
    public void showInfo(){
        System.out.println("Result of division is :"+calc());
    }

}
