class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=n-1,j=m-1,k=m+n-1;
        while(i>=0&&j>=0){
            if(nums1[j]<nums2[i]){
                nums1[k--]=nums2[i--];
            }else{
                nums1[k--]=nums1[j--];
            }
        }
        System.arraycopy(nums2, 0, nums1, 0, i + 1);
    }
}