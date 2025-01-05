package JavaBegin.TaskComputer.impl;

public interface IPrinter {
    Integer getPaintVolume();
    //void print();

    void print(String text);

    void charge(Integer volume);
}
