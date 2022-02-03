package week2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int i=0;i<n;i++) {
            Set<Character> alphabet = new HashSet<Character>();
            Set<Character> word = new HashSet<Character>();

            for (int j=97;j<123;j++) {
                alphabet.add((char) j);
            }
            Scanner stringScanner = new Scanner(System.in);
            String line = stringScanner.nextLine();
            for (int j=0; j< line.length(); j++) {
                if (line.charAt(j)>96 & line.charAt(j)<123){
                    word.add(line.charAt(j));
                    word.add((char) (line.charAt(j)-32));
                } else {
                    word.add(line.charAt(j));
                    word.add((char) (line.charAt(j)+32));
                }
            }

            alphabet.removeAll(word);

            if (alphabet.isEmpty()) System.out.println("pangram ");
            else {
                System.out.print("missing ");
                for (Character character : alphabet) {
                    System.out.print(character);
                }
            }
        }
    }
}
