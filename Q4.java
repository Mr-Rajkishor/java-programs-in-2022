/*                                Program :4
  Write a java program to perform arithmetic operation ( +, -, *, / ) on two integer
  number.
 */
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("Sum of two number: "+(a+b));
        System.out.println("Subtraction of two number: "+(a-b));
        System.out.println("Multiply of two number: "+(a*b));
        System.out.println("Divide of two number: "+(a/b));
    }
}
