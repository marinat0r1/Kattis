package DynamicProgramming.tabulation;

import java.util.Arrays;

public class CountConstruct {

    public static int countConstruct(String target, String[] candidates) {
        int[] table = new int[target.length() + 1];
        Arrays.fill(table, 0);
        table[0] = 1;

        for (int i = 0; i < table.length; i++) {
            if (table[i] > 0) {
                for (String word : candidates) {
                    if (word.length() + i < table.length) {
                        if (word.equals(target.substring(i, i + word.length()))) {
                            table[i + word.length()] += table[i];
                        }
                    }
                }
            }
        }
        return table[target.length()];

    }

    public static void main(String[] args) {

        System.out.println(countConstruct("abcdefg", new String[]{"aa", "bb", "cdefg"}));
        System.out.println(countConstruct("abcdefg", new String[]{"a", "b", "cdefg", "ab", "abc"}));
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));
    }
}
