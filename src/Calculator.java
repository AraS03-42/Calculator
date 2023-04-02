import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double first, second, result;
        int operation;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        first = inp.nextDouble();
        System.out.print("Enter the 2nd number : ");
        second = inp.nextDouble();
        System.out.print("1-) addition (+)\n2-) subtraction (-)\n3-) multiplication (*)\n4-) division (/)\n Choose an operation: ");
        operation = inp.nextInt();
        switch (operation) {
            case 1:
                result = first + second;
                System.out.printf("Result : %.0f", result);
                break;
            case 2:
                result = first - second;
                System.out.printf("Result : %.0f", result);
                break;
            case 3:
                result = first * second;
                System.out.printf("Result : %.0f", result);
                break;
            case 4:
                result = first / second;
                System.out.printf("Result : %.0f", result);
                break;

            default:
                System.out.println("You didn't use a valid operation");
                break;
        }
    }
}
