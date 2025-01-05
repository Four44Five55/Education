package JavaBegin.TaskRobot;

public class Terminator extends ARobot{

/*    @Override
    public void move() {
        System.out.println("Terminator move");
    }*/

    @Override
    public void stop() {
        System.out.println("Terminator stop");
    }

    @Override
    public void fight() {
        System.out.println(" Terminator fight");
    }


    @Override
    public void talk() {
        System.out.println("Terminate talk");
    }
    public Terminator() {
    }

    public Terminator(String name, IWing wing) {
        super(name, wing);
    }

}
