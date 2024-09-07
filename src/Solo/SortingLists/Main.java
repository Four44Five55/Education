package Solo.SortingLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*Для работы с данными различныз типов коллекций, Java API предоставляет класс Collections,
* который включен в пакет java.util.
* Одним из наиболее популярных методов класса Collections является метод sort(),
* который сортирует элементы вашего типа коллекции. Методы в классе Collections
* являются static, поэтому вам не нужен объект Collections для вызова.
* max(Collection c) выводит максимальнный элемент
* min(Collection c) выводин минимальный
* reverse(List list) переворачивает последовательность
* shuffle(List list) случайным образом перемшивает
* */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Cat");
        animals.add("Squirrel");
        System.out.println(animals);
        Collections.sort(animals);
        System.out.println(animals);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(15);
        numbers.add(2);
        numbers.add(8);
        numbers.add(6);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);
    }


}
