class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len1=nums1.length;
        int len2=nums2.length;
        int ans[] = new int[len1];
        for (int i=0; i<len2; i++)
        {
            map.put(nums2[i], i);
        }
        for (int j=0; j<len1; j++)
        { ans[j]=-1;
            if(map.containsKey(nums1[j]))
            {
                int index= map.get(nums1[j]);
               
                for(int i=index+1;i<len2;i++)
                {
                    if(nums2[i]>nums2[index])
                    {
                        ans[j]=nums2[i];
                        break;
                    }
                        
                }
                
            }
        }
        return ans;
    }
}