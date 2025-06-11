class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] keys = new int[nums.length];      
        int[] counts = new int[nums.length]; 
        int size = 0;
        int maxFreq = 0;
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num % 2 != 0) continue; 
            int index = -1;
            for (int j = 0; j < size; j++) {
                if (keys[j] == num) {
                    index = j;
                    break;
                }
            }
            if (index == -1) {
                keys[size] = num;
                counts[size] = 1;
                index = size;
                size++;
            } else {
                counts[index]++;
            }
            if (counts[index] > maxFreq || 
                (counts[index] == maxFreq && keys[index] < result)) {
                maxFreq = counts[index];
                result = keys[index];
            }
        }
        return result;
    }
}