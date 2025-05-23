class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       int i=-1, j=-1;
        int count=0;
        for(int a=0; a<s1.length(); a++){
            if(s1.charAt(a)!=s2.charAt(a)){
                count++;
                if(i == -1) i=a;
                else if(j ==-1) j=a;
            }
        }
        if(count == 0) return true;
        else if(count == 2 && s1.charAt(i) == s2.charAt(j) && s2.charAt(i) == s1.charAt(j)){
            return true;
        }
        return false;
    }
}
