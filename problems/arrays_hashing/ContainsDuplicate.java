// neetcode 150
// package problems.arrays_hashing;
// ContainsDuplicate description
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
