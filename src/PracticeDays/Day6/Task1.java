package PracticeDays.Day6;
import java.time.Year;
/*В классах Автомобиль и Мотоцикл реализовать два метода:
info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
yearDifference() - принимает на вход число (год), и возвращает разницу между
переданным годом и годом выпуска транспортного средства */
public class Task1 {
    public static void main(String[] args) {
        Car car=new Car();
        car.setColor("black");
        car.setModel("audi");
        car.setYear(2015);

        Motorbike motorbike=new Motorbike(2018,"blue","kawasaki");

        car.info();
        motorbike.info();

        int currentYear = Year.now().getValue();

        System.out.println( car.yearDifference(currentYear));
        System.out.println(motorbike.yearDifference(currentYear));

    }
}
