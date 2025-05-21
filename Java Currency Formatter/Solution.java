import java.util.*;
import java.text.NumberFormat;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + us.format(n));
        Locale locale = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(locale);
        System.out.println("India: " + india.format(n));
        NumberFormat Chi = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + Chi.format(n));
        NumberFormat fra = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + fra.format(n));
        sc.close();
    }
}
