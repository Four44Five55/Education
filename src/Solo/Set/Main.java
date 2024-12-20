package Solo.Set;

import java.sql.SQLOutput;
import java.util.HashSet;

/*Set- это коллекция , которая не омежт содержать дубликаты элементов.
* Она моделирует абстракциию математического множжества.
* Одной из реализаций Set является класс HashSet
* HashSet не сохраняет автоматически порядок элементов по мере их добавления.
* Чтобы упорядочить элементы, используйте LinkedHashSet, который поддерживает
* связный список элементов множетсва в порядке их вставки.
* ЧТО ТАКОЕ ХЭШИРОВАНИЕ?
* Хеш-таблица хранит информацию с помощью механизма, называемого хешированием, при
* котором информационное содержимое ключа используется для определения уникального
* значения, называемого хешкодом. Таким образом, каждый элемент в HAshSet связан
* с его уникальным хеш-кодом*/
public class Main {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<>();
        set.add("F");
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
        System.out.println(set.size());
    }
}
