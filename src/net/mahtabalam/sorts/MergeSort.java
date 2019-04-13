package net.mahtabalam.sorts;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int []a = { 7, 87, 3, 9, 23, 43, 17 };
		mergeSort(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public static void mergeSort(int[] array) {
		System.out.println("sort(" + Arrays.toString(array) + ")");
		int n = array.length;
		if (n == 1)
			return;
		int mid = n / 2;
		int[] leftSubArray = new int[mid];
		int[] rightSubArray = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			leftSubArray[i] = array[i];
		}
		for (int i = mid; i < n; i++) {
			rightSubArray[i - mid] = array[i];
		}
		mergeSort(leftSubArray);
		mergeSort(rightSubArray);

		merge(array, leftSubArray, rightSubArray);
	}

	public static void merge(int[] array, int[] leftArr, int[] rightArr) {

		System.out.println("merge(" +Arrays.toString(leftArr) + ", "
				+ Arrays.toString(rightArr) + " )");

		int left = leftArr.length;
		int right = rightArr.length;

		int i = 0, j = 0, k = 0;

		while (i < left && j < right) {

			if (leftArr[i] <= rightArr[j]) {
				array[k] = leftArr[i];
				i++;
			}
			else {
				array[k] = rightArr[j];
				j++;
			}
			k++;	
		}

		while (i < left) {
			array[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < right) {
			array[k] = rightArr[j];
			j++;
			k++;
		}
			
	}
}