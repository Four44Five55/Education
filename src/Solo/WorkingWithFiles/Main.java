package Solo.WorkingWithFiles;

import java.io.File;

/*Пакет java.io включает в себ класс File, который позволяет вам работать с файлами.
* Для начала создайте объект File и укажите путь к файлу в конструкторе*/
class Main {

    public static void main(String[] args) {
        File file = new File("C:\\data\\input-file.txt");
        //Метод exists() определяет существование файла
        if(file.exists()){
            System.out.println(file.getName()+" exists!");
        }
        else{
            System.out.println("The file does not exists.");
        }

        int x=5;
        x++;
        x--;
    }
}
