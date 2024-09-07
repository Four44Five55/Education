package Solo.Threads;

import java.sql.SQLOutput;

public class Task2 {
    public static void main(String[] args) {
        A object=new A();
        object.start();
    }
}
class B implements Runnable{
    @Override
    public void run() {
        System.out.println("B");
    }
}
class A extends Thread{
    @Override
    public void run() {
        System.out.println("A");
        Thread t=new Thread(new B());
        t.start();
    }
}