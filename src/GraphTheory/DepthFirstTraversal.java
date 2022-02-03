package GraphTheory;

import java.util.*;

public class DepthFirstTraversal {

    public static HashMap<Character, ArrayList<Character>> graph = new HashMap<>();
    static {
        graph.put('a', new ArrayList<>(Arrays.asList('b', 'c')));
        graph.put('b', new ArrayList<>(Collections.singletonList('d')));
        graph.put('c', new ArrayList<>(Collections.singletonList('e')));
        graph.put('d', new ArrayList<>(Collections.singletonList('f')));
        graph.put('e', new ArrayList<>(Collections.emptyList()));
        graph.put('f', new ArrayList<>(Collections.emptyList()));
    }

    public static void depthFirstPrint(HashMap<Character, ArrayList<Character>> graph, Character start) {
        Stack<Character> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            Character current = stack.pop();
            System.out.println(current);
            for (Character neighbor : graph.get(current)) {
                stack.push(neighbor);
            }
        }
    }

    public static void recursiveDepthFirstPrint(HashMap<Character, ArrayList<Character>> graph, Character start) {
        System.out.println(start);
        for (Character neighbor : graph.get(start)) recursiveDepthFirstPrint(graph,neighbor);
    }

    public static void main(String[] args) {
        depthFirstPrint(graph,'a');
        System.out.println("\n");
        recursiveDepthFirstPrint(graph, 'a');
    }
}
