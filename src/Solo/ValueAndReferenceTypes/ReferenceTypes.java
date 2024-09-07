package Solo.ValueAndReferenceTypes;
/*Ссылочный тип хранит ссылку(или адрес) на место памяти, где хранится соответсвующие данные.
* Когда вы создаете объект с помощью конструктора, вы создаете ссылочную переменную.
* Например, рассмотрим орпеделенный класс RTPerson*/
public class ReferenceTypes {
    public static void main(String[] args) {
        RTPerson j= new RTPerson("John");
        j.setAge(20);
        celebrateBirthday(j);
        System.out.println(j.getAge());
    }
    /*Метод celebrateBirthday принмиает объект RTPerson в качестве своего параметра и увеличивает его атрибут.
    * Поскольку j явялется ссылочным типом, метод влияет на сам объект и может изменить фактическое значение его атрибута.
    * Массивы и Строки также являются ссылочными типами данных.*/
    static void celebrateBirthday(RTPerson p){
        p.setAge(p.getAge()+1);
    }
}
