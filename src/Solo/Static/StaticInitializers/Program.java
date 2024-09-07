package Solo.Static.StaticInitializers;

/*Статические инициализаторы
Статические инициализаторы предназначены для инициализации статических переменных,
либо для выполнения таких действий, которые выполняются при создании самого первого объекта.
Например, определим статический инициализатор:*/
public class Program {
    public static void main(String[] args) {
        Person tom = new Person();
        Person bob = new Person();
        Person nick = new Person();

        tom.displayId();    // Id = 105
        bob.displayId();    // Id = 106
        nick.displayId();    // Id = 106
    }
}
