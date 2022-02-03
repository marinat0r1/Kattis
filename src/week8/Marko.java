package week8;

import java.util.*;

public class Marko {

    public static void main(String[] args) {

        ArrayList<char[]> dictionary = new ArrayList<>();

        HashMap<Character, HashSet<Character>> map = new HashMap<>();

        map.put('2', new HashSet<>(Arrays.asList('a', 'b', 'c')));
        map.put('3', new HashSet<>(Arrays.asList('d', 'e', 'f')));
        map.put('4', new HashSet<>(Arrays.asList('g', 'h', 'i')));
        map.put('5', new HashSet<>(Arrays.asList('j', 'k', 'l')));
        map.put('6', new HashSet<>(Arrays.asList('m', 'n', 'o')));
        map.put('7', new HashSet<>(Arrays.asList('p','q', 'r', 's')));
        map.put('8', new HashSet<>(Arrays.asList('t', 'u', 'v')));
        map.put('9', new HashSet<>(Arrays.asList('w', 'x', 'y', 'z')));

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) dictionary.add(scanner.nextLine().toCharArray());

        char[] seq = scanner.nextLine().toCharArray();
        HashSet<Character> comb = new HashSet<>();
        for (char s : seq) {
            if (map.containsKey(s)) {
                comb.addAll(map.get(s));
            }
        }


        int[] result = new int[dictionary.size()];
        for (int i = 0; i < dictionary.size(); i++) {
            for (char c : dictionary.get(i)) {
                if (!comb.contains(c)) {
                    result[i] = 0;
                    break;
                }
                result[i] = 1;
            }
        }

        int resultAsInt = 0;

        for (int i : result) resultAsInt += i;
        System.out.println(resultAsInt);

    }
}
