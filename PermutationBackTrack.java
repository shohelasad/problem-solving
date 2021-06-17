package com.algo;


public class PermutationBackTrack {
	
	void print(char[] input) {
		for(char ch:input) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	//abcd
	void permutationUtil(char[] input, int start, int n) {
		if(start == n) {
			print(input);
		}

		for (int i = start; i < n; i++){
			swap(input, i, start);
			permutationUtil(input,  start + 1,  n);
			swap(input, i, start);
        }
		
	}
	
	void swap(char[] input, int x, int y) {
		char temp = input[x];
		input[x] = input[y];
		input[y] = temp;
	}
		
	//abcd
	void findPermutation(char[] input, int n)  {
		permutationUtil(input, 0, n);
	}
	
	
	public static void main(String[] args) {
		PermutationBackTrack permutation = new PermutationBackTrack();
		char input[] = {'a','b','c', 'd'};
		permutation.findPermutation(input, input.length);
	}
	

}
