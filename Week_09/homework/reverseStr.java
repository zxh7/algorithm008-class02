class Solution {
    public String reverseStr(String s, int k) {
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i+=2*k){
            swap(str,i,i+k);
        }
        return String.valueOf(str);
    }
    public void swap(char[] str,int i,int j){
        j=Math.min(str.length,j)-1;
        for(;i<j;i++,j--){
            char tmp=str[i];
            str[i]=str[j];
            str[j]=tmp;
        }
        
    }
}