package com.sai;

public class Mergesort {
	private int[] array; 
	private int[] temp;
	int length;
	
	public static void main(String[] args) {
		
		int [] inputArr = { 45,23,11,89,77,98,4,28,65,43};
		Mergesort ms = new Mergesort();
		ms.sort(inputArr);
		for(int i : inputArr)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		
	}
     public void sort(int[] inputArr) {
    	 this.array = inputArr;
    	 this.length = inputArr.length;
    	 this.temp = new int[length];
    	 doMergeSort(0,length-1);
    }
	public void doMergeSort(int i, int j) {
		
		if(i< j){
		int mid = i+(j-i)/2;
		doMergeSort(i,mid);
		doMergeSort(mid+1,j);
		merge(i,mid,j);
		}
	}
	public void merge(int low, int mid, int high) {
		
		for(int m =low;m<=high;m++ ){
			temp[m] = array[m];
		}
		int i = low;
		int j = mid+1;
		int k = low;
		
		while(i<=mid && j<=high)
		{
			if(temp[i]<= temp[j])
			{
				array[k] = temp[i];
				i++;
			}else
			{
				array[k] = temp[j];
				j++;
			}
			k++;
		}
		while(i<=mid)
		{
			array[k] = temp[i];
			i++;
			k++;
		}
		while(j<=high)
		{
			array[k] = temp[j];
			i++;
			j++;
		}
		
		
		
	}

}
