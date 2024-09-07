package PracticeDays.Day6;

import java.util.Random;
public class Teacher {
    private String FIO;
    private String Discipline;

    public void evaluate(Student student){
        Random random = new Random();
        int grade=random.nextInt(2,6);
        String strGrade=null;
        switch (grade) {
            case 2 -> strGrade = "неудовлетворительно";
            case 3 -> strGrade = "удовлетворительно";
            case 4 -> strGrade = "хорошо";
            case 5 -> strGrade = "отлично";
        }
        System.out.println("Преподователь оценил студента "+ student.getName()+ " по дисциплине "+Discipline+" на оценку "+strGrade );

    }
    public Teacher(String FIO, String discipline) {
        this.FIO = FIO;
        Discipline = discipline;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getDiscipline() {
        return Discipline;
    }

    public void setDiscipline(String discipline) {
        Discipline = discipline;
    }
}
