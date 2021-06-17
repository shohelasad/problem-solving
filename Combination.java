package com.algo;

public class Combination {
	
	void print(char[] result) {
		for(int j = 0; j < result.length; j++) {
			System.out.print(result[j]);
		}
		System.out.println();
	}
	
	//abcd
	void combinationUtil(char[] input, char[] result, int start, int end,  int index, int r) {
		if(index == r) {
			print(result);
			return;
		}
		
		for (int i = start; i <= end && i <= end - r + index + 1; i++){
			result[index] = input[i];
            combinationUtil(input, result, i+1, end, index+1, r);
        }
		
	}
		
	//abcd
	void findCombination(char[] input, int r, int n) {
		char result[]=new char[r];
		combinationUtil(input, result, 0, n-1, 0, r);
	}
	
	
	public static void main(String[] args) {
		Combination c = new Combination();
		char input[] = {'a','b','c','d'};
		c.findCombination(input, 3, input.length);
	}
	
}
