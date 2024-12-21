package JavaBegin.TaskRobot;

public interface IRobot {
    //методы-действия (методы бизнес-процессов)
    void move();
    void stop();
    void fight();
    //методы-свойства
    String getName();
}
