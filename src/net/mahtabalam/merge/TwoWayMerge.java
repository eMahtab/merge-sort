package net.mahtabalam.merge;

public class TwoWayMerge {

	public static int[] merge(int[] arr1, int[] arr2) {

		int left = arr1.length;
		int right = arr2.length;
		int[] array = new int[left+right];

		int i = 0, j = 0, k = 0;

		while (i < left && j < right) {

			if (arr1[i] <= arr2[j]) {
				array[k] = arr1[i];
				i++;
			}
			else {
				array[k] = arr2[j];
				j++;
			}
			k++;	
		}

		while (i < left) {
			array[k] = arr1[i];
			i++;
			k++;
		}

		while (j < right) {
			array[k] = arr2[j];
			j++;
			k++;
		}
		return array;	
	}

}
