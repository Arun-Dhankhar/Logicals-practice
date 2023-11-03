package com.practice;

public class ArraySorting {
        public static void main(String[] args) {
			int[] arr= {2,3,2,5,6,8,3,2,7,9,5,4};
			sortingArray(arr);
		}

		private static void sortingArray(int[] arr) {
			int temp;
			     for(int i=0;i<arr.length;i++) {
			    	 for(int j=i+1;j<arr.length;j++) {
			    		 if(arr[i]>arr[j]) {
			    			 temp=arr[i];
			    			 arr[i]=arr[j];
			    			 arr[j]=temp;
			    		 }
			    	 }
			     }
			     for(int i: arr) {
			    	 System.out.print(i+" ");
			     }
		}
        
}
