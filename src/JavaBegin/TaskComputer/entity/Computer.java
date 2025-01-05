package JavaBegin.TaskComputer.entity;

import JavaBegin.TaskComputer.impl.IComputer;
import JavaBegin.TaskComputer.impl.IMonitor;
import JavaBegin.TaskComputer.impl.IPrinter;

public class Computer implements IComputer {

    private String name;
    private IMonitor monitor;
    private IPrinter printer;

    public Computer(String name, IMonitor monitor, IPrinter printer) {
        this.name = name;
        this.monitor = monitor;
        this.printer = printer;
    }

    public Computer(String name, IMonitor monitor) {
        this.name = name;
        this.monitor = monitor;
    }

    public void setMonitor(IMonitor monitor) {
        this.monitor = monitor;
    }

    public String getName() {
        return name;
    }

    @Override
    public IMonitor getMonitor() {
        return monitor;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println("Компьютер включился " + getName() + ", используется монитор " + monitor.getName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер выключился " + getName() + ", использовался монитор " + monitor.getName());
    }
}
