package PracticeDays.Day9.Task2;
/*Создайте 3 геометрические фигуры: Круг (англ. Circle), Прямоугольник (англ.
Rectangle) и Треугольник (англ. Triangle). Каждая из фигур должна наследоваться
от абстрактного класса Фигура (англ. Figure).
У класса Круг будет одно поле - радиус окружности.
У класса Прямоугольник будет два поля - ширина и высота.
У класса Треугольник будет три поля - длина каждой из сторон.
Для каждого из этих трех классов необходимо реализовать конструктор, который
принимает на вход размерности фигуры и цвет фигуры.
В этих же классах, вам необходимо реализовать два метода (area() и
perimeter()). Реализация этих методов будет разной для каждой из геометрических
фигур.*/
public class Rectangle extends Figure {
    private double width, height;

    //Construction
    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }

}
