package Solo.LinkedList;
/*Нельяз указать начальную емкость листа
* ArrayList используется когда необходим быстрый доступ к данным
* LinkedList когда необходимо сделать много изменений*/
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Blue");
        linkedList.add("Green");
        linkedList.add("Orange");
        linkedList.add("Black");
        System.out.println(linkedList);
    }
}
