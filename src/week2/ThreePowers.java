package week2;

import java.util.*;
import java.lang.*;

public class ThreePowers {

        static void printSubset(long n) {
            ArrayList<Long> answer = new ArrayList<>();
            while(n > 0) {

                long p = (long)(Math.log(n) / Math.log(2));;

                answer.add((long)(Math.pow(3, p)));

                n %= (int)Math.pow(2, p);
            }

            Collections.sort(answer);
            System.out.println(answer);
        }

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            long n = scanner.nextLong();
            printSubset(n);
        }
    }

