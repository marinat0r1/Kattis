package DynamicProgramming.tabulation;

import java.util.Arrays;

public class CanSum {

    public static boolean canSum(int targetSum, int[] numbers) {
        boolean[] answer = new boolean[targetSum + 1];
        Arrays.fill(answer,false);
        answer[0] = true;

        for (int i = 0; i <= targetSum; i++) {
            if (answer[i]) {
                for (int n : numbers) {
                    if (i + n <= targetSum) {
                        answer[i+n] = true;
                    }
                }
            }
        }
        //System.out.println(Arrays.toString(answer));
        return answer[targetSum];
    }

    public static void main(String[] args) {
        System.out.println(canSum(7, new int[]{5, 3, 4}));
        System.out.println(canSum(7, new int[]{2,8}));
        System.out.println(canSum(7, new int[]{1}));
        System.out.println(canSum(300, new int[]{7,14}));
    }
}
