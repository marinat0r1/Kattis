package week7;

public class SpidermansWorkout {

    public static String woSequence(int[] climbs) {

        StringBuilder result = new StringBuilder("U");
        int temp = climbs[0];
        for (int i = 1; i < climbs.length; i++) {
            if (temp - climbs[i] >= 0) {
                temp -= climbs[i];
                result.append("D");
            } else {
                temp += climbs[i];
                result.append("U");
            }
        }
        if (temp != 0) {
            return "IMPOSSIBLE";
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(woSequence(new int[]{20,20,20,20}));
        System.out.println(woSequence(new int[]{3,2,5,3,1,2}));
        System.out.println(woSequence(new int[]{3,4,2,1,6,4,5}));
    }
}
