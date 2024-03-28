import Arithmetic.Arithmetic;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number num1;
        Number num2;


        System.out.println("Enter first number: ");
        num1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter operation (+, -, *, /): ");
        String operation = sc.nextLine();

        System.out.println("Enter second number: ");
        num2 = sc.nextDouble();
        sc.nextLine();

        Arithmetic arithmetic = new Arithmetic(num1, num2);

        switch (operation) {
            case "+":
                System.out.println("Result: " + arithmetic.add());
                break;
            case "-":
                System.out.println("Result: " + arithmetic.subtract());
                break;
            case "*":
                System.out.println("Result: " + arithmetic.multiply());
                break;
            case "/":
                System.out.println("Result: " + arithmetic.divide());
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}
