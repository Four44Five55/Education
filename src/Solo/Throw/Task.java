package Solo.Throw;

import java.util.InputMismatchException;
import java.util.Scanner;

/*написать программу делителя. Должна принимать два целых значения на ввод и выполнить делени
* 1.Делитель не дожен быть равен нулю
* 2.Оба ввода должны быть целыми числами
* Добавить обработку исключении */
public class Task {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();
            /*if(num2==0){
                throw new ArithmeticException();
            }*/
            System.out.println(num1/num2);


        }catch(ArithmeticException e){
            System.out.println("Error: division by zero");
        }catch (InputMismatchException e){
            System.out.println("Error: wrong value type");
        }
    }
}
