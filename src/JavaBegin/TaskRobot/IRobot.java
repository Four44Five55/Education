package JavaBegin.TaskRobot;

public interface IRobot {
    //методы-действия (методы бизнес-процессов)
    default void move() {
        System.out.println("move "+ getName());
    }

    void stop();

    void fight();

    void talk();

    //методы-свойства
    String getName();

    IWing getWing();//обязываем по контракту всех роботов иметь крыло


}
