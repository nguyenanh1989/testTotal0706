package com.exercise;

import java.util.Arrays;

public class Exercise2 {
	
	public boolean subsetSum(int[] arr){
		Arrays.sort(arr);
		if(!ischeck(arr)){
			return false;
		}
		return true;
	}

	private boolean ischeck(int[] arr) {
		int index = arr.length-1;
		int sum1 = arr[arr.length-1];
		int sum2 = 0;	
		for (int i=0 ; i < index ; i++){
				sum2=getSum(i,arr);
				if(sum1 > sum2){
					return false;
				}if(sum1 < sum2){
					sum1+= arr[i];
				}else{
					return true;
				}
				
		}
			
			
		return false;
	}

	private int getSum(int i, int[] arr) {
		int sum = 0;
		for (int j=i;j< arr.length-1;j++){
			sum += arr[j];
		}
		System.out.println(sum);
		return sum;
	}
	
	
}
