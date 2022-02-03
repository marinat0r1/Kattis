package week2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        BigDecimal whitespace= new BigDecimal(0);
        BigDecimal lowercase= new BigDecimal(0);
        BigDecimal uppercase= new BigDecimal(0);
        BigDecimal symbol= new BigDecimal(0);

        for (int i=0; i< word.length(); i++){
            int ascii = word.charAt(i);
                if (ascii == 95) whitespace = whitespace.add(BigDecimal.valueOf(1));
                else if (ascii>96 & ascii<123) lowercase = lowercase.add(BigDecimal.valueOf(1));
                else if (ascii>64 & ascii<91) uppercase = uppercase.add(BigDecimal.valueOf(1));
                else symbol = symbol.add(BigDecimal.valueOf(1));
        }

        MathContext mc = new MathContext(18);

        System.out.println(whitespace.divide((BigDecimal.valueOf(word.length())),mc));
        System.out.println(lowercase.divide((BigDecimal.valueOf(word.length())),mc));
        System.out.println(uppercase.divide((BigDecimal.valueOf(word.length())),mc));
        System.out.println(symbol.divide((BigDecimal.valueOf(word.length())),mc));
    }
}
