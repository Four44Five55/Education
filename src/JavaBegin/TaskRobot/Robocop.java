package JavaBegin.TaskRobot;

public class Robocop extends ARobot {

   /* @Override
    public void move() {
        System.out.println("Robocop move");
    }*/

    @Override
    public void stop() {
        System.out.println("Robocop stop");
    }

    @Override
    public void fight() {
        System.out.println(" Robocop fight");
    }


    @Override
    public void talk() {
        System.out.println("Robocop talk");
    }

    public Robocop() {
    }

    public Robocop(String name, IWing wing) {
        super(name, wing);
    }

    @Override
    public void on() {
        System.out.println("on with beep");
    }
}
