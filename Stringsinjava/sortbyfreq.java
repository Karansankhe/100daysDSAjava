import java.util.*;

public class sortbyfreq {
    public String frequencySort(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        // Count the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Create a max heap based on character frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        // Add all characters to the max heap
        maxHeap.addAll(frequencyMap.keySet());

        // Build the result string
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char currentChar = maxHeap.poll();
            int frequency = frequencyMap.get(currentChar);
            for (int i = 0; i < frequency; i++) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
