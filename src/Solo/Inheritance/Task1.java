package Solo.Inheritance;
/*Стандартная бесплатная версия позволяет вам рисовать и писать текст на фотою у Pro версии
* есть две дополнительные функции
* -возможность использваония эффектов и возможность изменения разрешенияю.
* Необходимо чтобы класс Pro наследовал от Standard класса и успешно выполни все данные вызовы методов*/
public class Task1 {
    public static void main(String[] args) {
        Standard_task standard1=new Standard_task();
        Pro_task pro1=new Pro_task();
        //standard version
        standard1.draw();
        standard1.write();
        //Pro
        pro1.draw();
        pro1.write();
        pro1.useEffects();
        pro1.chageResolution();
    }
}
