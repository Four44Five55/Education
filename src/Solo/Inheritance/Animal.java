package Solo.Inheritance;
//модификатор доступа protected делает элементы видимыми только для подклассов
public class Animal {

    protected int legs;

    public void eat(){
        System.out.println("Animal eats");
    }

    public void makeSound(){
        System.out.println("Hi");
    }
    //конструктор
    public Animal(){
        System.out.println("Контсрутор Animal");
    }
}
