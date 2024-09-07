package TG.Record;

public class Record {

    public record PersonTest(String firstName,String lastName){
        //Записи автоматически создают контсруктор и геттеры для компьютера
    }

    public static void main(String[] args) {
        PersonTest personTest=new PersonTest("Jo","Doe");
        System.out.println("FirstName "+personTest.firstName());
        System.out.println("FirstName "+personTest.lastName());
    }
}
