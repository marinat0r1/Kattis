package DynamicProgramming.memoization;

import java.util.ArrayList;

/* Unfinished!!! **/

public class AllConstruct {

    public static ArrayList<ArrayList<String>> allConstruct(String targetString, ArrayList<String> components) {
        if (targetString.equals("")) return new ArrayList<>();


        for (String string : components) {
            if (targetString.startsWith(string)) {
                String[] suffix = targetString.split(string);
                ArrayList<ArrayList<String>> suffixWays = allConstruct(suffix[suffix.length-1], components);
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
