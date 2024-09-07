package Vehicle;

/*КОНСТРУКТОРЫ
это специальные методы, вызываемый при создании объекта и используемые для их инициализации.
Конструктор может быть использован для предоставления начальных значений для атрибутов объекта.
Имя К должно совпадать с именем его класса.
У К не должно быть явно указанного типа возвращаемого значения.

К надо рассматривать как метод, который настроит класс по умолчанию,
так что не нужно повторть один и тот же код каждый раз.
*/
public class VehicleTest {
    private String color;
    /* Vehicle(){
         color="Red";
     }*/
    VehicleTest(){
        this.setColor("Red");
    }
    /*
 Конструктор также может принимать параметры для инициалиации атрибутов.
 Конструктор вызыватся, когда создается новый обект с использованием ключевого слова NEW.
  */
    VehicleTest(String c){
        this.setColor(c);
    }

    //Setter
    public void setColor(String c){
        this.color=c;
    }
    //Getter
    public String getColor(){
        return color;
    }

    public static void main(String[] args) {
        VehicleTest v= new VehicleTest();
        VehicleTest v2= new VehicleTest("Green");
        System.out.println(v.color);
        System.out.println(v2.color);
    }
}


