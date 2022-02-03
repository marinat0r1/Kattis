package week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class WordsForNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        ArrayList<String> words = new ArrayList<String>();
        while (scanner.hasNext()){
            //words.add();
        }

        HashMap<Integer, String> wordMap = new HashMap<Integer, String>();
        wordMap.put(1,"one");
        wordMap.put(2,"two");
        wordMap.put(3,"three");
        wordMap.put(4,"four");
        wordMap.put(5,"five");
        wordMap.put(6,"six");
        wordMap.put(7,"seven");
        wordMap.put(8,"eight");
        wordMap.put(9,"nine");
        wordMap.put(10,"ten");
        wordMap.put(20,"twenty");
        wordMap.put(30,"thirty");
        wordMap.put(40,"forty");
        wordMap.put(50,"fifty");
        wordMap.put(60,"sixty");
        wordMap.put(70,"seventy");
        wordMap.put(80,"eighty");
        wordMap.put(90,"ninety");



    }
}
