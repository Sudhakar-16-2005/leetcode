class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int val=0;
            int num=nums[i];
            while(num!=0){
              int rem=num%10;
              val+=rem;
              num=num/10;
            }
            if(val == i){
                return i;
            }
        }
        return -1;
    }
}