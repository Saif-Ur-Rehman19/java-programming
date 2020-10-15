import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public int quotient(int num1,int num2){
        return num1/num2;
    }
    public static void main(String [] args){
        ExceptionHandling ex1 = new ExceptionHandling();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("enter first number");
            int num1 = scanner.nextInt();
            System.out.println("enter second number");
            int num2 = scanner.nextInt();
            System.out.println(ex1.quotient(num1,num2));
        }
        catch (InputMismatchException ex){
            System.err.println("input did not match");
        }
        catch (ArithmeticException ex){
            System.err.println("denominator can not be zero ");
        }
    }
}
