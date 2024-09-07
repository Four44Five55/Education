package Solo.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*Необходимо принимать значения на вводе,
добавляет их в ArrayList и выводит среднее значение*/
public class Task {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        ArrayList<Integer> evennums= new ArrayList<>();
        int sum=0;
        while (evennums.size()<3){
            int num=read.nextInt();
            evennums.add(num);

            sum+=num;
        }
        System.out.println((sum/3));
        System.out.println(evennums.get(2));

    }
}
