import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //input to take two numbers to calculate
        System.out.println("Input two numbers");
        long a = sc.nextLong(); long b = sc.nextLong();
        System.out.println("Press 1. to Add\n"+"Press 2. to Subtract\n"
        +"Press 3. to Multiply\n"+"Press 4. to Divide");
        int x = sc.nextInt();

        CalculatorFactory genericObject = new CalculatorFactory();

        Calculator calculator =   genericObject.getInstance(x);
        calculator.calculate(a,b);
    }
}
