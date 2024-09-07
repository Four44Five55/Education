package Vehicle;

public class Ticket {
    private  String movie;
    private int row;
    private  int seat;
    public Ticket(String movie,int row, int seat){
        this.movie=movie;
        this.row=row;
        this.seat=seat;
    }
    public String getMovie(){
        return movie;
    }
    public int getRow(){
        return row;
    }
    public int getSeat(){
        return seat;
    }
}
