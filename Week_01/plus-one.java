class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        for(int i=len-1;i>=0;i--){
            digits[i]+=1;
            if(digits[i]==10){
                digits[i]=0;
                if(i==0){
                    digits = new int[digits.length + 1];
                    digits[0]=1;
                }
            }
            else{
                break;
            }
        }
        return digits;
    }
}