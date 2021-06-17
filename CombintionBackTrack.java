package com.algo;

import java.util.ArrayList;
import java.util.List;

public class CombintionBackTrack {
	
	void print(List<Character> nums) {
		for(char ch:nums) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	//abcd
	void combinationUtil(char[] input, List<Character> nums, int start, int n, int r) {
		if(nums.size() == r) {
			print(nums);
			return;
		}
		
		for (int i = start; i < n; i++){
			nums.add(input[i]);
            combinationUtil(input, nums,  i + 1,  n,  r);
            nums.remove(input[i]);
        }
		
	}
		
	//abcd
	void findCombination(char[] input, int r, int n) {
		List<Character> nums = new ArrayList<>();
		combinationUtil(input, nums, 0, n, r);
	}
	
	
	public static void main(String[] args) {
		Combination c = new Combination();
		char input[] = {'a','b','c','d'};
		c.findCombination(input, 3, input.length);
	}
	

}
