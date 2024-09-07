package PracticeDays.Day9.Task1;

/*Затем, создайте класс Студент (англ. Student), который наследуется от класса
Человек. У студента есть дополнительное строковое поле - название его учебной
группы. Для этого поля тоже необходимо создать геттер и сеттер. Конструктор в
классе Студент должен принимать на вход два аргумента - имя и название учебной
группы. Метод printInfo() в классе Студент должен быть переопределен таким
образом, чтобы формат выводимого в консоль сообщения был таким:
“Этот человек с именем ИМЯ”
“Этот студент с именем ИМЯ”
(должно выводиться именно две строки - необходимо использовать ключевое слово
super)
*/
public class Student extends Human{
    private String nameGroup;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем "+name);
    }

    //Getter and Setter
    public String getNameGroup() {
        return nameGroup;
    }
    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }
    //Construction
    public Student(String name,String nameGroup) {
        super(name);
        this.nameGroup=nameGroup;
    }
}
