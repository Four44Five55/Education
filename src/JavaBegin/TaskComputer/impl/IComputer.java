package JavaBegin.TaskComputer.impl;

public interface IComputer {
    String getName();
    //указать общий тип интерфейса, чтобы в переменную можно было записать любую реализацию IMonitor
    IMonitor getMonitor();
    default void on(){
        System.out.println("Компьютер включился "+getName());
    }
    default void off(){
        System.out.println("Компьютер выключен "+getName());
    }
}
