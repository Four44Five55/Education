package PracticeDays.Day6;

public class Motorbike {
    private int year;
    private String color;
    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;


    }


    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
    private  String model;
    public void info() {System.out.println("Это мото");}
    public int yearDifference(int inputYear){
        return  inputYear-year;
    }
}
