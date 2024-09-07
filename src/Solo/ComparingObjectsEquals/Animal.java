package Solo.ComparingObjectsEquals;
/* equals()
* У каждого объекта есть предопределенный метод equals(), который используется для
* семантического сравнения на равенство. Но, чтобы он работал для наших классов,
* нам нужно переопределить его и проверить необходимые условия.
        * Существует просто й и быстрый способ генерации метода equals(), помимо его ручного написания.
        * Автоматически сгенерированный код hashCode() использкется для определения
* места хранения объекта внутри системы. Когда вы реализуете equals, вы должны также реализовать hashCode
*/

public class Animal {
    String name;
    Animal(String n){
        name=n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;

        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        final int prime=31;
        int result=1;
        result=prime*result+((name==null)?0:name.hashCode());
        return result;
    }
}
class myClass{
    public static void main(String[] args) {
        Animal an1=new Animal("Robby");
        Animal an2=new Animal("Robby");
        System.out.println(an1==an2);
        System.out.println(an1.equals(an2));
    }
}