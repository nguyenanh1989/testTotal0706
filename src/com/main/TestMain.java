package com.main;

import java.math.BigInteger;

import com.exercise.Exercise1;
import com.exercise.Exercise2;
import com.exercise.Exercise3;
import com.exercise.Exercise4;

public class TestMain {
	public static void main(String[] args){
		
		//System.out.println(new Exercise1().getPath("//home/./ka/../kjae/../fa//adf/a/x/x/d/.."));
		//int[] h = {1,2,3,4,5,15,1,1,30};
		//System.out.println(new Exercise2().subsetSum(h));
		
		//new Exercise4().getNumber(2015600160);
		int[][] arr = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,1},{1,1,1,1}};
		System.out.println(new Exercise3().maximalSquare(arr));
		
		
		
	}
}
