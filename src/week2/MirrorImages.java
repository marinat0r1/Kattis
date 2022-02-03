package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MirrorImages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        for (int i=0;i<testCases;i++){
            int rows, columns;
            rows = scanner.nextInt();
            columns = scanner.nextInt();
            ArrayList<String> chars = new ArrayList<>();

            for (int j=0;j<rows*columns;j++) {
                chars.add(scanner.next());
            }
            Collections.reverse(chars);
            System.out.println("Test " + (i+1));
            for (int j=0;j<rows*columns;j++) {
                if ((j+1)%columns == 0 & j != 0){
                    System.out.println(chars.get(j));
                }else {
                    System.out.print(chars.get(j));
                }
            }
        }

    }
}
