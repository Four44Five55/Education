package PracticeDays.Day4Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*С клавиатуры вводится число n - размер массива. Необходимо создать массив
указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива */
public class Task1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int arrayLength = read.nextInt();

        Random random = new Random();
        //random.nextInt(10);
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(50);

        /*String separator=",";
        for(int i=0;i<array.length;i++) {

            if(i+1==array.length){
                separator="";
            }
            System.out.print(array[i]+separator);
        }*/

        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива: " + array.length);

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                counter++;
        }
        System.out.println("Количестве чисел больше 8: " + counter);

        counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                counter++;
        }
        System.out.println("Количестве чисел равных 1: " + counter);

        counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                counter++;
        }
        System.out.println("Количестве четных чисел: " + counter);

        counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                counter++;
        }
        System.out.println("Количестве нечетных чисел: " + counter);

        counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter += array[i];
        }
        System.out.println("Сумме всех элементов массива: " + counter);

    }
}
