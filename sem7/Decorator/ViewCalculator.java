package sem7.Decorator;
import java.util.Scanner;

public class ViewCalculator {
    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            ComplexNumber primArg = promptInt("Введите первый аргумент: ");
            ComplexNumber secArg = promptInt("Введите второй аргумент: ");
            // calculator.sum(primaryArg);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =, /) : ");
                if (cmd.equals("*")) {
                    // ComplexNumber arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(primArg, secArg);
                    continue;
                }
                if (cmd.equals("+")) {
                    // ComplexNumber arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(primArg, secArg);
                    continue;
                }
                if (cmd.equals("/")) {
                    // ComplexNumber arg = promptInt("Введите второй аргумент: ");
                    calculator.divide(primArg, secArg);
                    continue;
                }
                if (cmd.equals("=")) {
                    // ComplexNumber result = calculator.getResult();
                    // System.out.printf("Результат %d\n", result);
                    System.out.println("End.");
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
