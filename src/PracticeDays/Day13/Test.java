package PracticeDays.Day13;

public class Test {
    public static void main(String[] args) {
    User user1=new User("user1");
    User user2=new User("user2");
    User user3=new User("user3");

    user1.sendMassage(user2,"Hello from user1");
    user1.sendMassage(user2,"How are you?");

    user2.sendMassage(user1,"Hi user1");
    user2.sendMassage(user1,"Im user2");
    user2.sendMassage(user1,"Im fine, and you");

        user3.sendMassage(user1,"Hi user1, im user3");
        user3.sendMassage(user1,"Do you remember me?");
        user3.sendMassage(user1,"We went to the same school");

        MessageDatabase.showDialog(user1,user2);

    }
}
