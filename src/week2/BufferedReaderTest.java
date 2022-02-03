package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t1 = null;
        try {
             t1 = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] splitStr = t1.split("\\s+");
        System.out.println(splitStr[0] + " " + splitStr[1]);
    }
}
