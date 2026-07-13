# Median of Two Sorted Arrays

![Hard](https://img.shields.io/badge/Difficulty-Hard-red) | [View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)

## Problem

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.


Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


 
Constraints:


	nums1.length == m
	nums2.length == n
	0 <= m <= 1000
	0 <= n <= 1000
	1 <= m + n <= 2000
	-106 <= nums1[i], nums2[i] <= 106

**Example 1:**
```
Input:  nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
```

**Example 2:**
```
Input:  nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
```

## Constraints

nums1.length == m
	nums2.length == n
	0 <= m <= 1000
	0 <= n <= 1000
	1 <= m + n <= 2000
	-106 <= nums1[i], nums2[i] <= 106

## Tags

`Array` `Binary Search` `Divide and Conquer`

## Solution

```java
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
```

## Stats

| Metric | Value |
|--------|-------|
| Runtime | 1 ms |
| Memory | 48.9 MB |
| Solved At | Mon, 13 Jul 2026 09:08:45 GMT |
