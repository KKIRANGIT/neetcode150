// Trapping Rain Water problem implementation would go here
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
// neetcode 150
// package problems.twopointers;

public class TrappingRainWater {

    public static void main(String[] args) {
        TrappingRainWater trw = new TrappingRainWater();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = trw.trap(height);
        System.out.println("Trapped Water: " + result); // Output: Trapped Water: 6 
    }

    public int trap(int[] height) {
        // Implementation would go here

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }
}
