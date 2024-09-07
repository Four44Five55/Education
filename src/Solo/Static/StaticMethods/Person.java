package Solo.Static.StaticMethods;

public class Person {
    private int id;
    private static int counter = 1;

    Person(){
        id = counter++;
    }
    // статический метод
    public static void displayCounter(){

        System.out.printf("Counter: %d \n", counter);
    }
    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}
