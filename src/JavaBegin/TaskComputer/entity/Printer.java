package JavaBegin.TaskComputer.entity;

import JavaBegin.TaskComputer.impl.IPrinter;

public class Printer implements IPrinter {
    int paintVolume;

    public Printer(int paintVolume) {
        this.paintVolume = paintVolume;
    }

    public Printer() {
    }

    @Override
    public Integer getPaintVolume() {
        return paintVolume;
    }


    @Override
    public void print(String text) {
        System.out.println("На печать отправлен текст: " + text + ", длина: " + text.length());
        if (paintVolume >= text.length()) {
            paintVolume -= text.length();
            System.out.println("Текст распечатан: " + text + ",  у принтера осталось краски: " + paintVolume);
        } else {
            System.out.println("Не хватило краски: " + (text.length() - paintVolume) + "(всего краски в принтере: " + paintVolume + " )");
        }
    }

    @Override
    public void charge(Integer volume) {
        paintVolume += volume;
        System.out.println("Принтер пополнен на длину текста " + volume + " (всего краски в принтере: " + paintVolume + " )");
    }
}
