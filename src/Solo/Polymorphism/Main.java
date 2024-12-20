package Solo.Polymorphism;
/*Полиморфизм, который относится к идее "иметь много форма ", происходит, когда уществует иерархия классов
* связанных друг с другом через наследование.
* Вызов метода участника приведет к выполнению другой реализации, в зависимости от типа объекта, вызывающего метод.
* Пример:
* Dog Vat являются классами, наследуемыми от Animal.Каждый класс имеет свлю собственную реализацию метода makeSound()*/
public class Main {
    public static void main(String[] args) {
        //Поскольку все объекты Dog Cat являются объектами Animal, мы можем сделать слудующие в main
        Animal a=new Dog();
        Animal b= new Cat();
        a.makeSound();
        b.makeSound();

        Dog c=new Dog();
        c.makeSound();
        //Поскольку ссылочная переменная а содержит объект Dog, будет вызван метод makeSound()  класса Dog
        //Это демонстрирует, что вы можете использваоть переменную Animal не зная, что она содержит объект
        //подкласса
        //Это полезно когда есть несколько подклассов суперкласса
    }
}
