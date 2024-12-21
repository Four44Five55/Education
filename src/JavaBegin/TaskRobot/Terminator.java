package JavaBegin.TaskRobot;

public class Terminator implements IRobot{
    private String name;
    @Override
    public void move() {
        System.out.println("Terminator move");
    }

    @Override
    public void stop() {
        System.out.println("Terminator stop");
    }

    @Override
    public void fight() {
        System.out.println(" Terminator fight");
    }

    @Override
    public String getName() {
        return name;
    }
}
