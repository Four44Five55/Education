package Solo.Super;
/*С помощью ключевого слова super можно обратиться к члену супер класса из класса наследника.
Чаще всего это можно сделать не используя super, но в этом примере рассмотрим случаи, когда без него не обойтись.

В классе A объявлена переменная i типа int. В его наследнике классе B, тоже объявлена переменная i, но типа String.
(Сразу же предупредим - на практике не стоит так делать! Пример приводится с целью иллюстрирования применение ключевого
слова super с переменными.) Из класса B мы можем напрямую обратиться только к переменной String i, которая перекрывает
область видимости переменной int i. Для обращения же к int i, необходимо использовать слово super.

Похожая ситуация и с методами. В обоих классах определен метод print().
Если мы хотим из класса D вызвать метод print() класса С, используем слово super - super.print().*/
public class Main {
    public static void main(String[] args) {
        B b=new B("someText",4);
        b.print();
        System.out.println(b.i);
    }
}
