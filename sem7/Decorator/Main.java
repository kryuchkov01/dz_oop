package sem7.Decorator;

public class Main {
    
    public static void main(String[] args) {
        //iCalculable calculator = new Calculator(0);
        iCalculable calculator = new CalcDecorator(new Calculator(null, null),new Logger());
        ViewCalculator view = new ViewCalculator(calculator);
        view.run();
    }
    
}
