package Solo.Interfaces.Learn;
/*ИНТЕРФЕЙС
*Интерфейс-это полостью абстрактный класс, который содержит только абстрактные методыю
* Некоторые характеристики интерфейсов:
* -Определенются с помощью лючевого слова interface.
* -Могут содержать только статические итоговые переменныею
* -Не могут содержать конструктор, потому что интерфейсы не могуть быть инстацированныю
* -Интерфейсы могут расширять другие интерфейсы
* -Класс может реализовать любое количество интерфейсов
* ==============================================================
* Интерфейсы имеют следующие свойства:
* -Интерфейс неявно абстрактен. Не нужно использовать ключевое слово abstract при объявлении интерфейсаю
* -Каждый метод в интерфейсе также неявно абстрактен, поэтому ключевое слово abstract не требуется
* -Методы в интерфейсе неявно публичны.
* ==================================================================
* Класс может наследовать только от одного суперкласса, но может реализовать несколько интерфейсов
* ==================================================================
* Для использования интерфейса необходимо ключевое слово implements
* Когда реулизуется интерфейс, необходимо переорпеделить все его методы*/
class Main {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.makeSound();
        cat1.eat();
    }
}
