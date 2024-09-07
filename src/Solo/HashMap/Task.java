package Solo.HashMap;

import java.util.HashMap;
import java.util.Scanner;

/*HashMap где сотрудники сохраняются в виде ключей, а их восзарст в видде значения.
* Она также принимает число N от пользователя в качестве предела возраста.
* Написать код для удаления всех сотрудников, возраст которых меньше числа N.*/
public class Task {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        HashMap<String,Integer> ages=new HashMap<>();
        ages.put("David",23);
        ages.put("Mark",28);
        ages.put("John",33);
        ages.put("Robert",43);
        ages.put("Alice",18);
        ages.put("Maria",32);

        String[] nameArr=new String[ages.size()];
        nameArr=ages.keySet().toArray(nameArr);
        int ageLimit= sc.nextInt();
        for(String emp:nameArr){
            if(ages.get(emp)<ageLimit){
                ages.remove(emp);
            }
        }
        System.out.println(ages);

    }
}
