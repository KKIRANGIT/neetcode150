// neetcode 150
// package problems.arrays_hashing;
// ContainsDuplicate description
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.  
// example 1:
// Input: nums = [1,2,3,1]
// Output: true

// example 2:
// Input: nums = [1,2,3,4]
// Output: false
// example 3:
// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true
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
