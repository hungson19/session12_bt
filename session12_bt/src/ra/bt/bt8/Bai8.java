package ra.bt.bt8;

import java.util.*;

public class Bai8 {
    public static void main(String[] args) {
        String text = "This is a sample text to count the occurrence of each word in this text.";

        Map<String, Integer> wordCountMap = countWords(text);

        System.out.println("Số lần xuất hiện của mỗi từ:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCountMap = new TreeMap<>();

        String[] words = text.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                if (wordCountMap.containsKey(word)) {
                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else {
                    wordCountMap.put(word, 1);
                }
            }
        }

        return wordCountMap;
    }
}

