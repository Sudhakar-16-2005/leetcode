class Solution {
    public int differenceOfSum(int[] nums) {
        int element=0;
        int digit=0;
        for(int num:nums){
            element+=num;
            int temp = Math.abs(num);
            while(temp>0){
                digit+=temp%10;
                temp/=10;
            }
        }
        return Math.abs(element-digit);
    }
}