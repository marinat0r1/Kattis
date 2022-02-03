package GraphTheory;

import java.util.*;

public class HasPath {

    public static HashMap<Character, ArrayList<Character>> graph = new HashMap<>();
    static {
        graph.put('f', new ArrayList<>(Arrays.asList('g', 'i')));
        graph.put('g', new ArrayList<>(Collections.singletonList('h')));
        graph.put('h', new ArrayList<>(Collections.emptyList()));
        graph.put('i', new ArrayList<>(Arrays.asList('g', 'k')));
        graph.put('j', new ArrayList<>(Collections.singletonList('i')));
        graph.put('k', new ArrayList<>(Collections.emptyList()));
    }

    public static boolean hasPath(HashMap<Character, ArrayList<Character>> graph, Character start, Character destination) {
        Stack<Character> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            Character current = stack.pop();
            for (Character neighbor : graph.get(current)) {
                if (destination.equals(neighbor)) {
                    return true;
                }
                stack.push(neighbor);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasPath(graph, 'g', 'f'));
        System.out.println(hasPath(graph, 'f', 'g'));
        System.out.println(hasPath(graph, 'i', 'h'));
    }
}
