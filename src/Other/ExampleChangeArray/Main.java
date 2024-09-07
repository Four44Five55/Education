package Other.ExampleChangeArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mas=new int[]{0,0,0};
        method(mas);
        System.out.println(Arrays.toString(mas));
        anotherMethod(mas);
        System.out.println(Arrays.toString(mas));
    }

    public static void method (int[] arr){
        arr[0]=999;
    }
    public static void anotherMethod(int[] arr){
        int[] mas={1,1,1};
        arr=mas;
    }
}
