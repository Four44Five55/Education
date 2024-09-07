package Vehicle;

/*
Конструктор также может принимать параметры для инициалиации атрибутов.
Конструктор вызыватся, когда создается новый обект с использованием ключевого слова NEW.
 */
public class Vehicle2 {
    private String color;
    public Vehicle2(String c){
        color=c;
    }


    public static void main(String [ ] args){
        Vehicle2 v=new Vehicle2("Blue");
        System.out.println(v.color);
    }
}