package PracticeDays.Day17;

public class Video {
    private  static final int DOG=0;
    private  static final int CAT=1;
    private  static final int FROG=2;

    public static void main(String[] args) {
        int animal=DOG;
        switch (animal){
            case DOG:
                System.out.println("Dog");
                break;
            case FROG:
                System.out.println("Frog");
                break;
            default:
                System.out.println("It's not animal");
        }
    }
}
