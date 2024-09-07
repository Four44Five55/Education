package Solo.AnonymousClasses;

import java.util.ArrayList;
import java.util.List;

/*Предлагается скидка на все товары 10%.Покупки сделали два клиента, необходимо второму клинету
* который сделал покупку на большую сумму товаров сделать скидку 20%*/
class Task {
    public static void main(String[] args) {
        Purchase customer=new Purchase();
        Purchase specialCustomer=new Purchase(){
            @Override
            public int totalAmount(int price) {
                return price-(price*20)/100;
            }
        };
        System.out.println(customer.totalAmount(1000));
        System.out.println(specialCustomer.totalAmount(100000));
        List<Integer> list=new ArrayList<>();
    }


}
