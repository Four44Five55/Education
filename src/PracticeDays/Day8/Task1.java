package PracticeDays.Day8;

import java.time.Duration;
import java.time.Instant;

/*1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна
строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
(0 + “ “ + 1 + “ “ + 2 + … + 20000).
После создания такой строки, вызов System.out.println() на этой строке должен
вывести в консоль сразу все числа из диапазона:
0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
Для того, чтобы почувствовать разницу в производительности между конкатенацией
обычных строк (класс String) и использовании StringBuilder, реализуйте
описанную задачу этими двумя способами, замеряя время работы программы. */
class Task1 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        String notBuild= new String();
        for(int i=0;i<=20000;i++){
            notBuild+=i+" ";
        }
        System.out.println(notBuild);
        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        System.out.println("Прошло времени, мс: " + elapsed);


        start = Instant.now();
        StringBuilder withBuild=new StringBuilder();
        for(int i=0;i<=20000;i++){
            withBuild.append(i).append(" ");
        }
        System.out.println(withBuild);
        finish = Instant.now();
        long elapsed2 = Duration.between(start, finish).toMillis();
        System.out.println("Прошло времени, мс: " + elapsed2);


    }



}
