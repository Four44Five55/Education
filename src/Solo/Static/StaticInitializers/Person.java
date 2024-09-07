package Solo.Static.StaticInitializers;

public class Person {
    private int id;
    static  int counter;

    static {
        counter = 105;
        System.out.println("Static initializer");
    }

    Person() {
        id = counter++;
        System.out.println("Constructor");
    }

    public void displayId() {

        System.out.printf("Id: %d \n", id);
    }
}
