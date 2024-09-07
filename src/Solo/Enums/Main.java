package Solo.Enums;
/*ПЕРЕЧИСЛЕНИЯ
* Перечмсления это специальный типа, используемый для определения коллекций констант.
*  В основном , enums  определяют переменные, которые представляют членов фиксированного набора.*/


public class Main {
    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }

    public static void main(String[] args) {
    Rank a= Rank.SOLDIER;
    switch (a){
        case SOLDIER -> System.out.println("Soldier");
        case CAPTAIN -> System.out.println("Captain");
        case SERGEANT -> System.out.println("SERGEANT");

    }
    /*Всегда следует использвоать Enums, когда переменная(особенно параметр метода)
    * может принимать только одно из небольшого набора возможных значений.
    * Если вы используете Enums вместо целых числе (или кодов String), вы увеличиваете
    * проверку на этапе компиляции и избегаете ошибок при передаче недопустимых констант,
    * а также документируете, какие значения можно использовать*/
    }
}
