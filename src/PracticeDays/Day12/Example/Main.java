package PracticeDays.Day12.Example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*List<Doll>dollList=new ArrayList<>();
        dollList.add(new Doll("Barbi","Mattel"));
        dollList.add(new Doll("Princess","Hasbro"));
        Girl girl=new Girl("Mary",12,dollList);*/

        //Код можно немного упростить с помощью метода Arrays.asList():
        Girl girl=new Girl ("Mary",12,
                Arrays.asList(new Doll("Barbi","Mattel"),new Doll("Princess","Hasbro")));

        /*Вывод имен кукол девочки на экран с помощью цикла for each (в классе Doll
        был добавлен геттер на поле name):*/
        for (Doll doll : girl.getDolls())
            System.out.println(doll.getName());
    }
}
