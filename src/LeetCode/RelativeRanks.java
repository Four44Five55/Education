package LeetCode;

public class RelativeRanks {
    public static void main(String[] args) {
    int x=10;
    int y=20;
    x+=y;
    y=x-y;
    x=x-y;
        System.out.println(x);
        System.out.println(y);

        int z=10;
        int f=20;
        z^=f;
        f^=z;
        //z^=f;
        System.out.println(z);
        System.out.println(f);
    }
}
