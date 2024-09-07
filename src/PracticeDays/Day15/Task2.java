package PracticeDays.Day15;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("100gb.txt"));
            String line = reader.readLine();
            int[] myArray; // объявление массива
            myArray = new int[10]; // создание, то есть, выделение памяти для массива на 10 элементов типа int
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
