package Vehicle;
import java.util.Scanner;
/*
* Программа запроса 3 входных данных имя фильма, ряд и место с послеующим присовоеним введенных
* данных созданному объекту через конструктор
* */
public class Main
{

    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in);
        String movie = read.nextLine();
        int row =read.nextInt();
        int seat =read.nextInt();

        Ticket ticket= new Ticket (movie, row, seat);

        System.out.println("Movie "+ ticket.getMovie());
        System.out.println("Row: "+ ticket.getRow());
        System.out.println("Seat: " + ticket.getSeat());
    }
}
