package com.java.part1.answers;

public class Answer_22 {

	public static void main(String[] args) {
		
		//Write a Java program to implement binary search algorithm.
		
		int nums[] = {5,7,9,11,13};
		int target = 11;
		
		int result = binarySearch(nums, target);
		
		if(result != -1) {
			System.out.println("Element found at Index: " + result);
		}else {
			System.out.println("Element not found.");
		}

	}
	
	public static int binarySearch(int[] nums, int target) {
		
		int left = 0;
		int right = nums.length -1;
		
		while(left <= right) {
			int mid = (left + right)/2;
			
			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid]<target) {
				left = mid +1;
			} else{
				right = mid;
			}
			
		}
		
		return -1;
	}

}
