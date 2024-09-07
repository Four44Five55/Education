package Solo.TypeCasting;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*ПРИВЕДЕНИЕ ТИПОВ
* Присвоение значения одного типа переменной другого типа называется Приветением типов.
* Чтобы привести значение к определенному типу, поместите тип в скобки и расположите его перед значением*/
public class Main {
    public static void main(String[] args) {
        int a =(int) 3.14;
        System.out.println(a);

        double b=42.67;
        int c= (int) b;
        System.out.println(c);

        Scanner read=new Scanner(System.in);
        char d=read.next().charAt(0);
        int e= (int) d;
        System.out.println(e);
    }


}
