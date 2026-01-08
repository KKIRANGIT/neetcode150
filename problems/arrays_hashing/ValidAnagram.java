// Valid Anagram.java
// neetcode 150
// package problems.arrays_hashing;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}// neetcode 150

// package problems.arrays_hashing; 
// import java.util.HashMap;
// import java.util.Map;
// public class ValidAnagram {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }
//         Map<Character, Integer> map = new HashMap<>();
//         for (char c : s.toCharArray()) {
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }
//         for (char c : t.toCharArray()) {
//             if (!map.containsKey(c) || map.get(c) == 0) {
//                 return false;
//             }
//             map.put(c, map.get(c) - 1);
//         }
//         return true;
//     }
// }
