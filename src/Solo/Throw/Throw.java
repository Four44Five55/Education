package Solo.Throw;
/*throw
* Ключевое слово throw позволяет вам вручную генерировать исключения из ваших методов.
* К числу многочисленных доступных типов исключение относятся IndexOutOfBoundsException,
* IllegalArgumentException, ArithmeticException  и т.д.
* Напримр, мы можем сгенерирвовать ArithmeticException в ншем методе когда параметр равен 0 */
public class Throw {
    //Выражение throws в определении метода определяет тип исключения(или исключений),
    //которые может сгенерировать метод
    static int div(int a, int b) throws ArithmeticException{
        if(b==0){
            //затем ключевое слово throw генериует сооответсвующие исключения, вместе с сообщением
            throw new ArithmeticException("Division by Zero");
        }else{
        return a/b;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(42,0));
    }
}
