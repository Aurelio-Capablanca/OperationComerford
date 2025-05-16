package org.example.TextSubstring;

import java.util.regex.*;

public class Test {

    public static String returnClean(String title) {
        Pattern pattern1 = Pattern.compile("[/\\[\\]()-]");//Pattern.compile("[/\\[\\]-]");
        Matcher matcher1 = pattern1.matcher(title);
        if (matcher1.find()) {
            for (int i = 0; i < title.length(); i++) {
                if (String.valueOf(title.charAt(i)).equals(matcher1.group()) && i > 0) {
                    title = title.substring(0, i);
                }
            }
        }
        return title;
    }

    public static void main(String[] args) {
        String testString = "(Prueba) Mardoqueo Carranza";//(Prueba) Mardoqueo Carranza - SOMEWHERE , someone/Consultation Matter
        System.out.println(returnClean(testString));
    }
}
