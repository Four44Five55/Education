package PracticeDays.Day17;

public class Test {
    public static void main(String[] args) {
        Animal animal=Animal.CAT;
        switch (animal){
            case CAT -> System.out.println("It's cat");
            case DOG -> System.out.println("It's cat");
            case FROG -> System.out.println("It's cat");
        }

        Season season=Season.SUMMER;
        //Object->Enum->Season
        System.out.println(season instanceof Season);//является ли объект класса Season
        System.out.println(season instanceof Enum);//является ли объект класса Enum
        switch (season){
            case SUMMER -> System.out.println("It's worm outside");
            case WINTER -> System.out.println("It's cold outside");
        }
    }
}
