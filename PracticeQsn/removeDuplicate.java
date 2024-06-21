package PracticeQsn;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int uniqueIndex = 1; // Start from the second element
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex - 1]) {
                nums[uniqueIndex-1] = nums[i];
                uniqueIndex++;
            }
        }
        
        return uniqueIndex; // The length of the array with unique elements
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int uniqueLength = solution.removeDuplicates(nums);
        
        System.out.println("The length of the array with unique elements: " + uniqueLength);
        System.out.print("The array with unique elements: ");
        for (int i = 0; i < uniqueLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
