package JavaBegin.TaskComputer;

import JavaBegin.TaskComputer.entity.Computer;
import JavaBegin.TaskComputer.entity.Monitor;
import JavaBegin.TaskComputer.entity.Printer;
import JavaBegin.TaskComputer.impl.IPrinter;

public class Main {
    public static void main(String[] args) {
        Monitor monitor=new Monitor("Samsung");
        Computer computer = new Computer("MacBook",monitor);
        IPrinter printer=new Printer(10);
        computer.on();

        printer.print("Hello world");
        printer.charge(5);
        printer.print("Hello world");
        computer.off();
    }
}
