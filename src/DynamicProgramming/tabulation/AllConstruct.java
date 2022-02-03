package DynamicProgramming.tabulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* Unfinished!!! **/

public class AllConstruct {

    public static ArrayList<ArrayList<String>> allConstruct(String target, String[] components) {
        HashMap<Integer, ArrayList<ArrayList<String>>> table = new HashMap<>();

        table.put(0,new ArrayList<ArrayList<String>>());

        System.out.println(table);

        for (int i = 0; i <= target.length(); i++) {
            if (table.containsKey(i)){
                for (String word : components) {
                    if (target.length() > i + word.length()){
                        if (word.equals(target.substring(i, i + word.length()))) {
                            ArrayList<ArrayList<String>> temp = new ArrayList<>(table.get(i));
                            if (table.containsKey(i + word.length())) temp.addAll(table.get(i + word.length()));
                            temp.add(new ArrayList<String>(Collections.singleton(word)));
                            table.put(i + word.length(), temp);
                        }
                    }

                }
            }
        }
        System.out.println(table);
        return table.get(target.length());
    }

    public static void main(String[] args) {
        System.out.println(allConstruct("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
    }
}
