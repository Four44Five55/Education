package JavaBegin.TaskRobot;

public abstract class ARobot implements IRobot, ITechnic {
    //можем вносить в абстрактый клас часть реализации интерфейса
    private String name;//эту переменную создали согласно интерфейсу
    IWing wing;
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ARobot() {
    }

    public ARobot(String name, IWing wing) {
        this.name = name;
        this.wing = wing;
    }

    @Override
    public IWing getWing() {
        return wing;
    }

    public void setWing(IWing wing) {
        this.wing = wing;
    }

    @Override
    public void on() {
        System.out.println("on");
    }

    @Override
    public void off() {
        System.out.println("off");
    }
}
