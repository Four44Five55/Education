package Solo.Inheritance;
/*Наследование-это процесс, который позволяет одному классу приобретатьь свойства(методы и переменные) другого.
* С наследованием информация размещается в более удобном, иерархичном порядке.
* Класс, наследующий свойтсва другого, называется подклассом (также называется производным классом или дочерним классом)
* Класс, свойства которого наследуются, называется суперклассом(базовым классом или родительским классом)
* Чтобы наследовать от класса, используйет ключевое слово extends.
* Этот пример показывает, как запустить класс Dog наследовать от класса Animal
* Модификатор доступа protected делает элементы видимыми только для подклассов
* Конструкторы не являются методами членов, и поэтому не наследуются подклассами.
* Однако конструктор суперкласса вызывается при создании экземпляра подкласса.*/
public class Main {
    public static void main(String[] args) {
        Dog dog =new Dog();
        System.out.println(dog.legs);
        dog.eat();
        dog.makeSound();

        }
    }

