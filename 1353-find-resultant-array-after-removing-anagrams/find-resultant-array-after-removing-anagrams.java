import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        String prev = ""; // store previous word in sorted form
        
        for (String word : words) {
            char[] arr = word.toCharArray(); //char array bna liya
            Arrays.sort(arr);
            String sortedWord = new String(arr);
            
            if (!sortedWord.equals(prev)) {
                result.add(word);   // add original word
                prev = sortedWord;  // update prev
            }
        }
        
        return result;
    }
}
