package JavaBegin.TaskComputer.entity;

import JavaBegin.TaskComputer.impl.IMonitor;

public class Monitor implements IMonitor {
    private String name;

    public Monitor(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
