package PracticeDays.Day2;

import java.util.Scanner;

//Реализовать программу №2, используя цикл while.
public class Task3 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int num1=read.nextInt();
        int num2 =read.nextInt();
        while (num1<=num2)
        {
            if (num1%5==0 && num1 % 10 != 0){
                System.out.print(num1+ " ");
            }
            num1++;
        }

    }
}
