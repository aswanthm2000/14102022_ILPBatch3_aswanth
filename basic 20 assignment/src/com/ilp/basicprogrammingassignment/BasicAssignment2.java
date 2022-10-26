package com.ilp.basicprogrammingassignment;

import java.util.Arrays;
import java.util.Scanner;

public class BasicAssignment2 {

	public static void main(String[] args) {
		System.out.println("Arrange numbers in both ascending and descending order");

		
        Scanner input =new Scanner(System.in);
	    int[] array= new int [4];
	    for(int b=0;b<array.length;b++){
	   System.out.print("enter no." + (b+1) +"=");
	   array[b]=input.nextInt();
	    }

	    for (int i=0; i<array.length;i++) {
	        for (int k=i;k<array.length;k++) {

	        if(array[i] > array[k]) {

	        int temp=array[k];
	        array[k]=array[i];
	        array[i]=temp;
	        }
	            }

	    }
	    System.out.println("******************\n output  ascending order");


	    for (int i : array){
	        System.out.println(i);
	    }
	    for (int i=0; i<array.length;i++) {
	        for (int k=i;k<array.length;k++) {

	        if(array[k] > array[i]) {

	        int temp=array[i];
	        array[i]=array[k];
	        array[k]=temp;
	        }
	            }

	    }
	    System.out.println("******************\n output\t descending order");


	    for (int k : array){
	        System.out.println(k);
	}
 }
}