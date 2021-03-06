package cn.meow.hash.containsduplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() < nums.length;
    }
}
