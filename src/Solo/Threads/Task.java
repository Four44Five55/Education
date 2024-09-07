package Solo.Threads;
/*Необходимо изначально приветствовать а затем спрашивать имя*/
public class Task {
    public static void main(String[] args) {
        Name name=new Name();
        name.setPriority(1);

        Welcome welcome=new Welcome();
        welcome.setPriority(10);

        name.start();
        welcome.start();
    }
}

class Welcome extends Thread{
    @Override
    public void run() {
        System.out.println("Welcome!");
    }
}
class Name extends Thread{
    @Override
    public void run() {
        System.out.println("Please enter your name");
    }
}