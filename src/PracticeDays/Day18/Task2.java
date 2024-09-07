package PracticeDays.Day18;
/*2. Создайте рекурсивный метод, который принимает на вход единственный аргумент -
число, и возвращает количество цифр 7 в этом числе. Циклы использовать
запрещено, можно использовать только рекурсивные вызовы.
Пример:
System.out.println(count7(717771237)); // 5
*В числе 717771237 ровно 5 раз используется цифра семь.
*/
public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(71727127));
        //71727127/10=7172712
        //7172712/10=717271
        //717271/10=71727
        //71727/10=7172
        //7172/10=717
        //717/10=71
        //71/10=7
        //7/10=0
    }


    public static int count7(int number){
        if (number==0)
            return 0;

        if(number%10==7)
            return 1+count7(number/10);
        else
            return count7(number/10);
    }
}
