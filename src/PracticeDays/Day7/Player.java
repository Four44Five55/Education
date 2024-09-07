package PracticeDays.Day7;

public class Player {
    private int stamina;
    private final static  int MAX_STAMINA=100;
    private final static int MIN_STAMINA=0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers<7) {
            countPlayers++;
        }
    }

    public void run()   {
        if (stamina==0) {
            return;
        }
        stamina--;

        if(stamina==0){
            countPlayers--;
        }
    }

    /*игроков меньше 6, то выводит сообщение: “Команды неполные. На поле еще есть ...
    свободных мест”, иначе: “На поле нет свободных мест”. Грамматикой русского языка
    пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.*/
    public static void info (){
        if (countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть "+ (6-countPlayers)+"  свободных мест" );
        }else {
            System.out.println("Нет свободных мест" );
        }
    }
}
