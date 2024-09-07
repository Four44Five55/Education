package PracticeDays.Day12;

import java.util.ArrayList;
import java.util.List;

/*2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
Вывести список.*/
public class Task2 {
    public static void main(String[] args) {
        List<Integer> num1to30 = new ArrayList<>();
        for (int i=0;i<31;i++) {
            if(i%2==0)
                num1to30.add(i);
        }
        System.out.println(num1to30);

        List<Integer> num300to350= new ArrayList<>();
        for (int i=300;i<351;i++) {
            if(i%2==0)
                num300to350.add(i);
        }
        System.out.println(num300to350);
    }
}
