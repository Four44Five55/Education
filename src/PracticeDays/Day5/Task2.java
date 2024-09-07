package PracticeDays.Day5;
/*Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
“Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
использовать). Придерживаться принципов инкапсуляции и использовать ключевое
слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
консоль.
*/
public class Task2 {
    public static void main(String[] args) {
        Motorbike moto1 =new Motorbike(2100,"suzuki","red");
        System.out.println(moto1.getColor()+"\n"+moto1.getModel()+"\n"+ moto1.getYear());
    }
}
