package Solo.Threads;
/*Можно подразделить определенные операции внутри одного приложения на отдельные потоки,
которые все запускаются параллельно.
1.Способ создание потока
Расширение класса Thread. Унаследовать от клаасса Thread, переопределить его метод run(),
и написать функциональность потока в методе run().
Затем создать новый объект класса и вызывается его метод start() для запуска потока.
*/
public class Main {
    public static void main(String[] args) {
        /*Когда создаем объкт класса и вызываем метод старт, инструкции метода run(),
        * выполняются в отдельном потоке*/
        Loader obj=new Loader();
        obj.start();
    }
}

class Loader extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}
/*Каждый поток имеет приоритет.Который определяет порядок запуска потоков.
* Приоритет варьируется от 1 до 10.По умолчанию для всех 5.
* Устанавливать приоритет можно с помощью метода setPriority()*/
/*=====================================================================*/
/*2.Способ определения потока
* Реализация интерфейса Runnable.Реализуй метод run().Затем создай новый объект Thread,
* передай класс Runnable в его конструктор, и запустите поток вызывая метод start().
* Приемущество реализации интерфейса в том, что можно унаследоваться от класса*/
class Loader2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hi, im second method.");
    }
}
class MyClass{
    public static void main(String[] args) {
        Thread t=new Thread(new Loader2());
        t.start();
    }
}
/*Метод Thread.sleep() приостанавливает работу потока на указанный промежуток времени.
* Например, вызов Thread.sleep(1000); присотанавливает пото на одну секунду.
* Метод Thread.sleep() вызывает InterruptedException,
* поэтому обязательно оборачивать блок в try/catch*/