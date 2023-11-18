class Solution {
    public String reverseWords(String s) {
        // Split the string into words using one or more spaces as the delimiter
        String[] words = s.trim().split("\\s+");
        
        
        int left = 0, right = words.length - 1;
        while (left < right) {
            // Swap words at left and right indices
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            
            // Move indices towards the center
            left++;
            right--;
        }
        
        // Join the reversed words into a single string with spaces
        return String.join(" ", words);
    }
}