package Solo.SortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Объявить массив целых чисел
* Принять на вход 5 значение в массив
* Вывести максимальное и минимальное занчение
* */
public class Task {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while (numbers.size()<5){
            numbers.add(scanner.nextInt());
        }
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
    }
}
