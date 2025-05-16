package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WORDS {
    public static void main(String[] args){
        String words = "One Two Three Four";
        List<String> wordsList = Arrays.stream(words.split(" ")).toList();
        int iterator = 0;
        for (String word : wordsList){
            System.out.print(word);
            System.out.println();
            iterator++;
            //System.out.println(iterator);
        }
        int countWords = words.split("\\s").length;

        //System.out.println(countWords);
    }
}
