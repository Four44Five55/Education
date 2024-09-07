package PracticeDays.Day12.Task5;
import java.util.ArrayList;
import java.util.List;

/*5. *Выполнять в подпапке task5 в day12*
Скопировать MusicBand из прошлого задания и доработать - теперь у участника
музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
участником понимается не строка, а объект класса MusicArtist. Необходимо
реализовать класс MusicArtist и доработать класс MusicBand (создать копию
класса) таким образом, чтобы участники были - объекты класса MusicArtist. После
этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
проверить состав групп после слияния. Методы для слияния и для вывода участников
в консоль необходимо тоже переработать, чтобы они работали с объектами класса
MusicArtist*/
public class Task5 {public static void main(String[] args) {
    List<MusicArtist> members1=new ArrayList<>();
    members1.add(new MusicArtist("Stiv1",31));
    members1.add(new MusicArtist("Stiv2",32));
    members1.add(new MusicArtist("Stiv3",33));
    members1.add(new MusicArtist("Stiv4",34));
    members1.add(new MusicArtist("Stiv5",35));

    MusicBand band1=new MusicBand("Jefferson Airplane",1965,members1);


    List<MusicArtist> members2=new ArrayList<>();
    members2.add(new MusicArtist("Nick1",31));
    members2.add(new MusicArtist("Nick2",32));
    members2.add(new MusicArtist("Nick3",33));
    members2.add(new MusicArtist("Nick4",34));
    members2.add(new MusicArtist("Nick5",35));

    MusicBand band2=new MusicBand("The Beatles",1960,members2);

    band1.printMembers();
    band2.printMembers();

    MusicBand.transferMembers(band1,band2);
    band1.printMembers();
    band2.printMembers();
}
}
