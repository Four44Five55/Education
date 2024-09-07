package PracticeDays.Day5;
/*1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
Созданный вами класс должен отвечать принципам инкапсуляции. */
public class Task1 {
    public static void main(String[] args) {
        Car car=new Car();
        car.setColor("Black");
        car.setYear(2000);
        car.setModel("audi");

        System.out.println("Машина: "+car.getColor()+" цвета "+car.getModel()+" "+ car.getYear()+" года выпуска");
    }
}
