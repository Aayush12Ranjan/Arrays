package PracticeQsn;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m=nums1.length;
        n=nums2.length;
        int ans[]=new int[m+n];
       m=0;
       n=0;
        int k=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]  > nums2[j]){
                ans[k++]=nums1[i++];
            }
            else{
                ans[k++]=nums2[j++];
            }
        }

        while(i<nums1.length){
            ans[k++]=nums1[i++];
        }
        while(i<nums2.length){
            ans[k++]=nums2[j++];
        }

        for( i=0; i<m+n; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    


    }
    public static void main(String[] args) {
        int nums1[]={2,3,4,5,6};
        int m=nums1.length;
        int nums2[]={8,9,12,23,34};
        int n=nums2.length;
        int ans[]= new int[m+n];

        merge(nums1, m, nums2, n);
        
    }
}