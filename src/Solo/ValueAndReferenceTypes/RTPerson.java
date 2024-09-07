package Solo.ValueAndReferenceTypes;

public class RTPerson {
    private String name;
    private int age;
    RTPerson(String n){
        this.name=n;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        this.age = a;
    }
}
