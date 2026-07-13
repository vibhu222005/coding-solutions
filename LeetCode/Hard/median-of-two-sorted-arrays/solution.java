class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int m=0;
        int n=0;
        int key=0;
        int len=arr.length;
        while(n<nums1.length&&m<nums2.length)
        {
            if(nums1[n]<nums2[m])
            {
                arr[key]=nums1[n];
                n++;
                key++;
            }
            else
            {
                arr[key]=nums2[m];
                m++;
                key++;
            }
        }
         while (n < nums1.length) {
            arr[key++] = nums1[n++];
        }

        while (m < nums2.length) {
            arr[key++] = nums2[m++];
        }
         if(len%2==0)
            {
                return (arr[(len/2)-1]+arr[len/2])/2.0;
            }
        return arr[len/2];
    }
}