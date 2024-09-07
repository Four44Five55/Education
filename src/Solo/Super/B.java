package Solo.Super;

public class B extends A{


    public void  print(){
        System.out.printf("Значение переменной i из класса В: "+ i);
        super.print();
    }


    public String i;
    public B(String a, int b){
        i=a;
        super.i=b;
    }
}
