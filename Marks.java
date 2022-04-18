/*
      Write a program to calculate percentage of given student in CBSE board exam.
      His marks from five subjects must be taken as input from the keyboard
      ( marks are out of 100 ).
                                                 */

import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        System.out.print("Enter the five subject Marks: ");
        Scanner sc = new Scanner(System.in);
        int sub_1 = sc.nextInt();
        int sub_2 = sc.nextInt();
        int sub_3 = sc.nextInt();
        int sub_4 = sc.nextInt();
        int sub_5 = sc.nextInt();
        int percent = (sub_1 + sub_2 + sub_3 + sub_4 + sub_5) / 5;
        System.out.print("CBSE board exam percentage = ");
        System.out.println(percent);
    }
}