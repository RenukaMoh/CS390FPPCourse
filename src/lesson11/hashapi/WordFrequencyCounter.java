package lesson11.hashapi;

import java.util.HashMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "java is an object oriented programming java is an functional programming";
        String[] words = text.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            // Using getOrDefault to get the current count of the word or 0 if it doesn't exist
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }

        // Printing the word frequencies
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }

    }
}
