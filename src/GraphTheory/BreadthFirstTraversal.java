package GraphTheory;

import java.util.*;

public class BreadthFirstTraversal {

    public static HashMap<Character, ArrayList<Character>> graph = new HashMap<>();
    static {
        graph.put('a', new ArrayList<>(Arrays.asList('c', 'b')));
        graph.put('b', new ArrayList<>(Collections.singletonList('d')));
        graph.put('c', new ArrayList<>(Collections.singletonList('e')));
        graph.put('d', new ArrayList<>(Collections.singletonList('f')));
        graph.put('e', new ArrayList<>(Collections.emptyList()));
        graph.put('f', new ArrayList<>(Collections.emptyList()));
    }

    public static void breadthFirstPrint(HashMap<Character, ArrayList<Character>> graph, Character start) {
        ArrayList<Character> queue = new ArrayList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            Character current = queue.get(0);
            queue.remove(0);
            System.out.println(current);
            for (Character neighbor : graph.get(current)) {
                queue.add(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        breadthFirstPrint(graph, 'a');
    }
}
