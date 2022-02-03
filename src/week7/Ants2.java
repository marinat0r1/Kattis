package week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Ants2 {

    public static int soonestFallOfTime(ArrayList<Integer> positions, int poleLength) {
        int mid = (int) Math.floor(poleLength/2);
        ArrayList<Character> direction = new ArrayList<>();
        for (int i = 0; i < positions.size(); i++) {
            if (positions.get(i) > mid) {
                direction.set(i, 'r');
            } else {
                direction.set(i, 'l');
            }
        }

        while (positions.size() > 0) {
            for (int i = 0; i < positions.size(); i++) {
                if (positions.get(i) < 0 | positions.get(i) >= positions.size()) positions.remove(i);
                if (direction.get(i) == 'r') positions.set(i, positions.get(i)+1);
                else positions.set(i, positions.get(i)-1);
            }
        }
        System.out.println(direction);
        return 0;
    }

    public static int latestFallOfTime() {

        return 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int poleLength = scanner.nextInt();
            int nOfAnts = scanner.nextInt();
            ArrayList<Integer> antPositions = new ArrayList<>(nOfAnts);
            for (int j = 0 ; j < nOfAnts; j++) antPositions.add(scanner.nextInt());
            soonestFallOfTime(antPositions,poleLength);

        }
    }
}
