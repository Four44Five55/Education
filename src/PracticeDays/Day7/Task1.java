package PracticeDays.Day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1=new Airplane("YAK2",2010,25,10000);
        Airplane airplane2=new Airplane("YAK2",2010,17,20000);
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}
