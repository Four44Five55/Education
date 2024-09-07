package PracticeDays.Day12.Example;

import java.util.ArrayList;
import java.util.List;

public class Girl {
    private String name;
    private int age;
    //Мы видим, что список может использоваться как обычное поле класса. В поле dolls
    //будет храниться список имен кукол, которые есть у девочки.
    //Для того, чтобы указать, какие объекты будут храниться внутри списка, используется
    //параметризация (<String>).
    /*=====================================================================================*/
    //private List<String>dolls;
    /*=====================================================================================*/
    /*Мы можем пойти дальше и сказать, что у кукол теперь есть не только имя, но и
    название производителя. Тогда, сущность Кукла выделится в отдельный класс -
    Doll:*/
    private List<Doll>dolls=new ArrayList<>(); // Изначально пустой список
    // Конструктор без аргументов
    public Girl() {
        this.name = ""; // инициализируем пустой строкой
        this.dolls = new ArrayList<>(); // инициализируем пустым списком
        // поле age будет по умолчанию инициализировано 0
    }


    // Конструктор со всеми аргументами
    public Girl(String name, int age, List<Doll> dolls) {
        this.name = name;
        this.age = age;
        this.dolls = dolls;
    }
// Геттеры / Сеттеры

    public List<Doll> getDolls() {
        return dolls;
    }

    public void setDolls(List<Doll> dolls) {
        this.dolls = dolls;
    }
}
