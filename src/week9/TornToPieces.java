package week9;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Torn To Pieces

 * Link: https://open.kattis.com/problems/torn2pieces ;

 * @author Marin-Petru Hincu

 * @version 2.0, 2022-01-16

 * Method : Ad-Hoc

 * Status : Compile Error

 * Runtime: - */

import java.util.*;

public class TornToPieces {

    public static boolean breadthFirstPrint(HashMap<String, HashSet<String>> graph, String start, String destination) {
        ArrayList<String> queue = new ArrayList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            String current = queue.get(0);
            System.out.println(current);
            queue.remove(0);
            for (String neighbor : graph.get(current)) {
                if (neighbor.equals(destination)) {
                    return true;
                }
                queue.add(neighbor);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        HashMap<String, HashSet<String>> graph = new HashMap<>();

        for (int i = 0; i <= n; i++) {
            String[] temp = scanner.nextLine().split(" ");

            HashSet<String> set = new HashSet<>();
            for (int  j = 1; j < temp.length; j++) {
                set.add(temp[j]);
            }
            graph.put(temp[0], set);

            for (int  j = 1; j < temp.length; j++) {
                if (!graph.containsKey(temp[j])) {
                    graph.put(temp[j], new HashSet<String>(Collections.singleton(temp[0])));
                } else {
                    graph.get(temp[j]).add(temp[0]);
                }
            }

            System.out.println(graph);
        }

        String src = scanner.next(), dst = scanner.next();

        System.out.println(breadthFirstPrint(graph, src, dst));
    }
}
