package PracticeDays.Day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private String username;
    private List<User> subscription;

    public User(String username) {
        this.username = username;
        this.subscription= new ArrayList<>();
    }
//этот аргумент принимет другого пользователя,и текущий объект класса Юзер, он подписывает на нового пользвователя из аргументов
    public void subscribe(User user){
         this.subscription.add(user);
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscription() {
        return subscription;
    }

    public boolean isSubscribe(User user){
        for(User currentUser: subscription){
            if (currentUser.getUsername().equals(user.getUsername()))
                return true;
        }
        return false;
    }

    public boolean isFriend(User user){
        return this.isSubscribe(user)&& user.isSubscribe(this);
    }

    public  void sendMassage(User user,String text){
        MessageDatabase.addNewMessage(this,user, text );
    }
    public String toString(){
        return username;
    }
}
