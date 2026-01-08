// Top K Frequent Elements
// Given an integer array nums and an integer k, return the k most frequent elements. You
// may return the answer in any order.

// neetcode 150
// package problems.arrays_hashing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq
                = new PriorityQueue<>(
                        (Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) -> o2.getValue() - o1.getValue());

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll().getKey());
        }
        return result;
    }
}
