package com.learn.push;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
	public static void main(String[] args) {
		int nums[]= {1000000000,1000000000,1000000000,1000000000};
		int target=-294967296;
		Arrays.sort(nums);
		System.out.println(fourSum(nums, target));
	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<List<Integer>>();
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length-1;j++)
			{
				int k=j+1;
				int l=nums.length-1;
				while(k<l)
				{
                    long sum=nums[i];
                    sum=sum+nums[j]+nums[k]+nums[l];
					if(sum==target)
					{
						set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
						k++;
						l--;
					}
					else if(sum<target)
					{
						k++;
					}
					else
					{
						l--;
					}
				}
			}
		}
        return new ArrayList<>(set);
    }
}