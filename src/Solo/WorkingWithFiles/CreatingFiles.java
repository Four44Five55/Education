package Solo.WorkingWithFiles;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/*Formatter, еще один полезный класс в пакете java.util,
используется для создание контента и записи его в файл*/
public class CreatingFiles {
    public static void main(String[] args) {
        try {
            //Formatter f = new Formatter("C:\\Users\\1\\IdeaProjects\\Sololearn\\src\\FileFormatterTest.txt");

            Formatter f = new Formatter("FileFormatterTest2.txt");
            f.format("%s %s %s", "1", "John", "Smith \r\n");
            f.format("%s %s %s", "2", "Amy", "Brown");
            f.close();

            File test = new File("FileFormatterTest2.txt");
            Scanner sc = new Scanner(test);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
