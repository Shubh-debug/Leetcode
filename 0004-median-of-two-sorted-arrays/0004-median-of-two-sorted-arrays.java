class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1=nums1.length;
        int len2=nums2.length;
        int i=0,j=0,k=0;
        int sizecomb=len1+len2;
        int arr[]=new int[sizecomb];
        while(i<len1 && j<len2)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k++]=nums1[i++];
                
            }
            else
            {
                arr[k++]=nums2[j++];
                
            }
        }
            while(i<len1)
            {
                arr[k++]=nums1[i++];
                
            }
            while(j<len2)
            {
                arr[k++]=nums2[j++];
                
            }
            double med;
            if(sizecomb%2!=0)
            {
              med=arr[sizecomb/2];
            }else
            {
                med=(arr[sizecomb/2]+arr[(sizecomb/2)-1])/2.0;
            }
        
        for(int f=0;f<sizecomb;f++)
        {
            System.out.print(arr[f]);
        }
        return med;
    }
}