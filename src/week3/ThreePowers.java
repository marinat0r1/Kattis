package week3;

/** * Ausgewählte Probleme aus dem ACM Programming Contest  SS 2021

 * Problem: Three Powers

 * Link: https://open.kattis.com/problems/threepowers ;

 * @author Marin-Petru Hincu

 * @version 2.0, 2021-11-26

 * Method : Ad-Hoc

 * Status : Accepted

 * Runtime: 0.22 s */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ThreePowers {

    public static String toBin(BigInteger num) {
        return num.toString(2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BigInteger> powers3 = new ArrayList<>();
        powers3.add(BigInteger.ONE);

        for (int i = 1; i < 65; i++) {
            powers3.add(powers3.get(i - 1).multiply(new BigInteger("3")));
        }

        while (scanner.hasNext()) {
            BigInteger number = new BigInteger(scanner.next());
            if (number.equals(BigInteger.ZERO)) break;
            number = number.subtract(BigInteger.ONE);
            String str = toBin(number);

            if (number.equals(BigInteger.ZERO)) System.out.println("{ }");
            else { System.out.print("{ ");

                for (int i = str.length() - 1; i >= 0; i--) {
                    if (str.charAt(i) == '1') {
                        if (i == 0){
                            System.out.print(powers3.get(str.length()
                                                - i - 1));
                        }
                        else{
                            System.out.print(powers3.get(str.length()
                                                - i - 1) + ", ");
                        }
                    }
                }
                System.out.println(" }");
            }
        }
    }
}


