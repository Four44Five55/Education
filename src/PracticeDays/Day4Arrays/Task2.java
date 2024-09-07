package PracticeDays.Day4Arrays;

import java.util.Random;

/*Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0
- сумму элементов массива, оканчивающихся на 0
Использовать сортировку запрещено.*/
public class Task2 {
    public static void main(String[] args) {
    int[] array=new int[100];
        Random random=new Random();
        int numberRange=10000;

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(numberRange);
        int max=0;
        for (int element: array){
            if(element>max)
                max=element;
        }
        System.out.println("наибольший элемент массива: "+max);

        int min=numberRange;
        for (int element: array){
            if(element<min)
                min=element;
        }
        System.out.println("наименьший элемент массива: "+min);

        int counter=0;
        for (int element: array){
            if(element%10==0)
                counter++;
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: "+counter);

        int amount=0;
        for (int element: array){
            if(element%10==0)
                amount+=element;
        }
        System.out.println("сумма элементов массива, оканчивающихся на 0: "+amount);
    }
}
