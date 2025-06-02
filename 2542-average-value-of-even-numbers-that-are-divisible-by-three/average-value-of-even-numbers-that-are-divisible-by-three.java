class Solution {
    public int averageValue(int[] nums) {
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0 && nums[i] % 2 == 0){
                a += nums[i];
                b++;
            }
        }
        if (b > 0) { 
            return a / b; 
        } 
        return a;
    }
}