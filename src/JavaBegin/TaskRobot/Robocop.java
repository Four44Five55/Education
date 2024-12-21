package JavaBegin.TaskRobot;

public class Robocop implements IRobot {
    private String name;

    @Override
    public void move() {
        System.out.println("Robocop move");
    }

    @Override
    public void stop() {
        System.out.println("Robocop stop");
    }

    @Override
    public void fight() {
        System.out.println(" Robocop fight");
    }

    @Override
    public String getName() {
        return name;
    }
}
