package Solo.WorkingWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Самый простой способ для чтения файла использовать Scanner из пакета java.util.
 * Для чтения файла необходимо создать объект File  с соответсвующим путем и передать его Scanner*/
public class ReadingFile {
    public static void main(String[] args) {
        //оборачивание кода в блок try/catch для проверки на существование файла
        try {
            File file = new File("C:\\data\\input-file.txt");
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        //класс Scanner наследуется от Iterator. Для чтенияиспользуме метод next(), который
        // выводит каждое слово отдельно
        try {
            File file = new File("input2.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            //Всегда полезно закрывать файл
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }



    }
}
