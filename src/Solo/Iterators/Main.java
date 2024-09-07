package Solo.Iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*ИТЕРАТОР - это объект, который позволяет пройти по коллекции, получить или удалить элементы.
 * Прежде чем вы сможете получить доступ к коллекции через итератор, вы должны получить его.
 * Каждый из классов коллекции предоставляет метод iterator(), который возвращает итератор
 * к началу коллекции. Используя этот объект итератора, вы можете получить доступ к каждому
 * элементу в коллекции, по одному элементу за раз.
 * Класс iterator предлагает следующие методы:
 * hasNext(): возвращает true, если есть хотя бы один следующийэлемент, в противном случае
 * влзвращает false.
 * next(): возвращает следующий объект и продвигает итератор.
 * remove(): удаляет последний объект, который был возвращен next из коллекции.
 * Класс iterator должен быть импортирован из пакеты java.util
 * */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Orange");
        linkedList.add("Black");
        System.out.println(linkedList);

        LinkedList<Integer> nums = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (nums.size() < 5) {
            nums.add(sc.nextInt());
        }
        int sum = 0;
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            sum += it.next();
        }
        System.out.println(sum);

    }
}
