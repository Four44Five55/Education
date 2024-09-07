package LeetCode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] scorePlaces = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        int[] inputScore = {10, 3, 8, 9, 4};
        HashMap<Integer, Integer> hashInputScore = new HashMap<>();
        for (int i = 1; i <= score.length; i++) {
            hashInputScore.put(i, inputScore[i]);
        }
        TreeMap<Integer, Integer> sorted = new TreeMap<>();
        sorted.putAll(hashInputScore);
        System.out.println(sorted);
        return scorePlaces;
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void main(String[] args) {

        int[] inputScore = {10, 3, 8, 9, 4};
        int[] array = Arrays.copyOf(inputScore, inputScore.length);
        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        String[] scorePlaces = new String[]{"5", "4", "Bronze Medal", "Silver Medal", "Gold Medal"};
        String[] rezultPlaces = new String[5];
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - 1; j++) {
                if (array[i] == inputScore[j]) {
                    rezultPlaces[j] = scorePlaces[i];
                }
            }
        }
        System.out.println(Arrays.toString(rezultPlaces));
    }
}



