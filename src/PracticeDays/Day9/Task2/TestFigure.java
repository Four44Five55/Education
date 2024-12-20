package PracticeDays.Day9.Task2;
/*После того, как геометрические фигуры будут полностью реализованы, вам
необходимо будет реализовать еще один класс - TestFigures. В этом классе, в
методе main() должны быть созданы и помещены в массив следующие
геометрические фигуры:
Figure[] figures = {
new Triangle(10, 10, 10, "Red"),
new Triangle(10, 20, 30, "Green"),
new Triangle(10, 20, 15, "Red"),
new Rectangle(5, 10, "Red"),
new Rectangle(40, 15, "Orange"),
new Circle(4, "Red"),
new Circle(10, "Red"),
new Circle(5, "Blue")
};
В этом же классе реализуйте два метода:
public static double calculateRedPerimeter(Figure[] figures)
public static double calculateRedArea(Figure[] figures)
Первый метод, принимая на вход массив геометрических фигур, должен вернуть
сумму периметров красных фигур. Второй метод, принимая на вход массив
геометрических фигур, должен вернуть сумму площадей красных фигур.
Вызовите эти два метода на массиве figures и выведите результат в консоль*/
public class TestFigure {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4.0, "Red"),
                new Circle(10.0, "Red"),
                new Circle(5.0, "Blue")
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }
    public static double calculateRedPerimeter(Figure[] figures){
        double sum = 0;
        for(Figure figure:figures){
            if(figure.getColor().equals("Red")) {
                sum+= figure.perimeter();
            }
        }
        return sum;
   }
    public static double calculateRedArea(Figure[] figures){
        double sum = 0;
        for(Figure figure:figures){
            if(figure.getColor().equals("Red")) {
                sum+= figure.area();
            }
        }
        return sum;
    }
}
