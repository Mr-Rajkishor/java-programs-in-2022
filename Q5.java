/*                                  Program: 5
The distance between two cities (in km.) is input through the keyboard. Write a java
program to convert and print this distance in meters, feet, inches and centimetres.

 */
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the distance between two cities(in km.): ");
        float distance=sc.nextFloat();
        double meter,feet,inches,centimeter;
        meter =distance*1000;
        feet = distance*3280.84;
        inches=distance*39370.08;
        centimeter=distance*1000*100;
        System.out.println("meter: "+meter);
        System.out.println("feet: "+feet);
        System.out.println("inches: "+inches);
        System.out.println("centimeter: "+centimeter);

    }
}
