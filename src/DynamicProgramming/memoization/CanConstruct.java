package DynamicProgramming.memoization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CanConstruct {

    public static boolean canConstruct(String targetString, ArrayList<String> components) {
        if (targetString.equals("")) return true;

        for (String string : components) {
            if (targetString.startsWith(string)) {
                String[] suffix = targetString.split(string);
                if (suffix.length == 0) {
                    return true;
                } else if (canConstruct(suffix[suffix.length-1],components)) {
                        return true;
                    }
                }
            }
        return false;
    }

    public static boolean dynamicCanConstruct(String targetString, ArrayList<String> components, HashMap<String, Boolean> memo) {
        if (targetString.equals("")) return true;
        if (memo.containsKey(targetString)) return memo.get(targetString);

        for (String string : components) {
            if (targetString.startsWith(string)) {
                String[] suffix = targetString.split(string);
                if (suffix.length == 0) {
                    memo.put(targetString, true);
                    return true;
                } else if (dynamicCanConstruct(suffix[suffix.length-1], components, memo)) {
                    memo.put(targetString, true);
                    return true;
                }
            }
        }
        memo.put(targetString, false);
        return false;
    }

    public static void main(String[] args) {

        System.out.println(dynamicCanConstruct("abcdef", new ArrayList<>(Arrays.asList("ab","a","cd","c", "ef")), new HashMap<>()));
        System.out.println(dynamicCanConstruct("abcdef", new ArrayList<>(Arrays.asList("ab","a","cc","ccc")), new HashMap<>()));
        System.out.println(dynamicCanConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" +
                "                                  eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" +
                "                                  eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new ArrayList<>(Arrays.asList(
                "e","ee","eee","eeee", "eeeee", "eeeeee")), new HashMap<>()));

        System.out.println(canConstruct("abcdef", new ArrayList<>(Arrays.asList("ab","a","cd","c", "ef"))));
        System.out.println(canConstruct("abcdef", new ArrayList<>(Arrays.asList("ab","a","cc","ccc"))));
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" +
                "                                  eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" +
                "                                  eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new ArrayList<>(Arrays.asList(
                                                    "e","ee","eee","eeee", "eeeee", "eeeeee"))));
    }
}
