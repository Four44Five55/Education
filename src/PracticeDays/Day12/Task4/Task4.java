package PracticeDays.Day12.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
    List<String> members1=new ArrayList<>();
        members1.add("Stiv1");
        members1.add("Stiv2");
        members1.add("Stiv3");
        members1.add("Stiv4");
        members1.add("Stiv5");

        MusicBand band1=new MusicBand("Jefferson Airplane",1965,members1);

        List<String> members2=new ArrayList<>();
        members2.add("Nick1");
        members2.add("Nick2");
        members2.add("Nick3");
        members2.add("Nick4");
        members2.add("Nick5");

        MusicBand band2=new MusicBand("The Beatles",1960,members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();
    }
}
