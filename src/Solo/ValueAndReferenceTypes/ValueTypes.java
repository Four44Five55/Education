package Solo.ValueAndReferenceTypes;
/*Типы значений являются базовыми типами и включают в себя byte, short, int,long, float, double, boolean и char.
Эти типы данных хранят присвоенные им значения в соответсвующих областях памятию
Таким образом, когда передается их в метод, фактически работаете с значением переменной, а не самой переменной. */
public class ValueTypes {
    public static void main(String[] args) {
        int x =5;
        addOneTo(x);
        System.out.println(x);
        square(x);
        System.out.println(x);

       }

    /*Метод принимает значение своего параметра, поэтому исходня переменная не застрагивается и 5 остается ее значением*/
    static void addOneTo(int num){
        num+=1;
        //System.out.println(num);
    }
    static void square(int x){
        x*=x;
        //System.out.println(x);
    }
}
