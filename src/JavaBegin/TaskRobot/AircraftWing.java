package JavaBegin.TaskRobot;

public class AircraftWing implements IWing {
    private int size;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void open() {
        System.out.println("wing open ");
    }
}
