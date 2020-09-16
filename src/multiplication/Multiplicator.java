package multiplication;

public class Multiplicator {
    protected int dividend;
    protected int divisor;
    public Multiplicator(int dividend,int divisor){
        this.dividend=dividend;
        this.divisor=divisor;
    }
    public double calc(){
        return dividend*divisor;
    }

    public void showInfo(){
        System.out.println("Result of multiplication is :"+calc());
    }
}
