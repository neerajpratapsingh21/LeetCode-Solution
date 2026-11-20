import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> group = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int val : count) {
                sb.append('#').append(val);
            }
            String key = sb.toString();
            group.putIfAbsent(key, new ArrayList<>());
            group.get(key).add(s);
        }
        return new ArrayList<>(group.values());
    }
}