package Solo.AnonymousClasses;
/*АНОНИМНЫЕ Классы
* это способ расширения существующих классов на лету*/
public class Main {
    public static void main(String[] args) {
        //При создании объекта можем изменять метод старт на лету
        Machine machine=new Machine(){
            @Override //Аннотация @Override используется для того,
            // чтобы сделать ваш код понятным, для очевидности переопределения
            public void start() {
                System.out.println("Wooo...");
            }
            //После вызова контсруктора, мы открыли фигурные скобки и переопределили реализацию метода старт на лету
        };
        machine.start();
    }
}
