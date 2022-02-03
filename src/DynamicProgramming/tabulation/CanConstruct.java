package DynamicProgramming.tabulation;

import java.util.Arrays;

public class CanConstruct {

    public static boolean canConstruct(String target, String[] candidates) {
        boolean[] table = new boolean[target.length() + 1];
        Arrays.fill(table, false);
        table[0] = true;

        for (int i = 0; i < table.length; i++) {
            if (table[i]) {
                for (String word : candidates) {
                    if (word.length() + i < table.length) {
                        if (word.equals(target.substring(i, i + word.length()))) {
                            table[i + word.length()] = true;
                        }
                    }
                }
            }
        }
        return table[target.length()];
    }

    public static void main(String[] args) {

        System.out.println(canConstruct("abcdefg", new String[]{"aa", "bb", "cdefg"}));
        System.out.println(canConstruct("abcdefg", new String[]{"a", "b", "cdefg", "ab", "abc"}));
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));
    }
}
