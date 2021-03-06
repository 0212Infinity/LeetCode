package cn.meow.str.validanagram;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                Integer val = map.get(c);
                if (val > 1) {
                    map.put(c, val - 1);
                } else {
                    map.remove(c);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }
}
