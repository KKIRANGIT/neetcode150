// Container With Most Water - LeetCode Problem
// Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
// Find two lines, which together with the x-axis forms a container, such that the container contains the most water.
// Notice that you may not slant the container.
// neetcode 150
// package problems.twopointers;

public class ContainerWater {

    public static void main(String[] args) {
        ContainerWater cw = new ContainerWater();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = cw.maxArea(height);
        System.out.println("Max Area: " + result); // Output: Max Area: 49
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
