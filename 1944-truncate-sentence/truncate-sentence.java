class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String temp = "";
        for(int i = 0;i < k-1;i++)
        {
            temp = temp + arr[i];
            temp = temp + " ";
        }
        temp = temp + arr[k-1];
        return temp;
        


        
    }
}