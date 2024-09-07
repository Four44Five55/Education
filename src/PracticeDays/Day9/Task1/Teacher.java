package PracticeDays.Day9.Task1;

public class Teacher extends  Human{
    public String nameDiscipline;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем "+name);
    }

    //Getter and Setter
    public String getNameDiscipline() {
        return nameDiscipline;
    }
    public void setNameDiscipline(String nameDiscipline) {
        this.nameDiscipline = nameDiscipline;
    }

    //Construction
    public Teacher(String name,String nameDiscipline){
        super(name);
        this.nameDiscipline=nameDiscipline;
    }
}
