package PracticeDays.Day4Arrays;

import java.util.Random;

/*Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):
3 2 1 5 7 // сумма - 18
1 2 5 6 2 // сумма - 16
3 4 9 6 4 // сумма - 26
Ответ: 2 (индекс строки, сумма чисел в которой максимальна)*/
public class Task3 {
    public static void main(String[] args) {
    int [][] matrix=new int[12][8];
    Random random =new Random();

    for (int row=0;row<matrix.length;row++){
        for (int column=0;column<matrix[row].length;column++){
            matrix[row][column]= random.nextInt(50);
        }
    }
    int maxAmount=0;
    int indRowMaxAmount=0;

    for (int row=0;row<matrix.length;row++){
        int amount=0;
        for (int column=0;column<matrix[row].length;column++){
            amount=matrix[row][column];
        }
        if(amount>maxAmount){
            maxAmount=amount;
            indRowMaxAmount =row;
        }
    }
    System.out.println("максимальная сумма чисел в строке: "+ maxAmount);
    System.out.println("индекс строки, сумма чисел в которой максимальна: "+ indRowMaxAmount);



    }
}
