package week7;

import java.util.*;
import java.util.stream.Collectors;

public class Ants {

    public static void ants(int[] positions, int poleLength) {
        int mid = (int) Math.floor(poleLength/2);
        List<Integer> list = Arrays.stream(positions).boxed().collect(Collectors.toList());

        int result = list.stream()
                .min(Comparator.comparingInt(i -> Math.abs(i - mid)))
                .orElseThrow(() -> new NoSuchElementException("No value present"));

        System.out.println(poleLength - result + " " + Math.max((Arrays.stream(positions).max()).getAsInt(), poleLength - Arrays.stream(positions).min().getAsInt()));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int poleLength = scanner.nextInt();
            int nOfAnts = scanner.nextInt();
            int[] antPositions = new int[nOfAnts];
            for (int j = 0 ; j < nOfAnts; j++) antPositions[j] = scanner.nextInt();
            if (nOfAnts > 0) {
                ants(antPositions,poleLength);
            } else {
                System.out.println(0 + " " + 0);
            }

        }

    }
}
