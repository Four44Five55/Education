package PracticeDays.Day16;

public class Video {
    public static void main(String[] args) {
        byte x=123;//-128 to 127
        long y=123;//
        double a=12.3;
        float g=12.2f;
        //конвертация double во float int в long
        float f=123.2f;//обязательно определять f для float
        long l=1232323233223323323L;//изначально все целые числа int, обязательно ставить L

        int intA=123;
        long longB=intA;//приведение-НЕЯВНОЕ.конвертация инта в лонг
        //int intB=longB;//приведение-НЕЯВНОЕ.Так не работает.ошибка конвертации из лонга в инт
        int intB=(int)longB;//приведение-ЯВНОЕ
        System.out.println(intB);


        //int intA=123;
        double doubleX=intA;
        System.out.println(doubleX);

        //для обратного преобразования дабл в инт необходимо использовать явное преобразование
        double doubleC=123.5;
        int intC=(int) doubleC;
        System.out.println("Ковертация double 123.5 в int: "+ intC);

        long LongC=Math.round(doubleC);
        System.out.println("Округление double 123.5: "+ LongC);

        //явная конвертация большего числа в меньшее
        byte byteX=(byte) 128;//-128
        System.out.println("Явная конвертация превышенного числа 128 "+byteX);
        byte byteY=(byte) 166;//-90
        System.out.println("Явная конвертация превышенного числа 160 "+byteY);
        byte byteZ=(byte) 344;//-88
        System.out.println("Явная конвертация превышенного числа 160 "+byteZ);


    }
}
