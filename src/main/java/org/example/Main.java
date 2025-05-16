package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String month = "March";
        String numericValue = convertMonthToNumeric(month);
        System.out.println(numericValue); // Output: 03
    }

    public static String convertMonthToNumeric(String month) {
        Scanner scan = new Scanner(month);
        if (scan.hasNextInt()) {
            return month; // Already a numeric value
        }

        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("January", "01");
        monthMap.put("February", "02");
        monthMap.put("March", "03");
        monthMap.put("April", "04");
        monthMap.put("May", "05");
        monthMap.put("June", "06");
        monthMap.put("July", "07");
        monthMap.put("August", "08");
        monthMap.put("September", "09");
        monthMap.put("October", "10");
        monthMap.put("November", "11");
        monthMap.put("December", "12");

        return monthMap.getOrDefault(month, "00");
    }
}