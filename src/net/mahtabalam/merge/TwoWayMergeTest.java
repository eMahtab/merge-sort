package net.mahtabalam.merge;

import java.util.Arrays;

public class TwoWayMergeTest {

	public static void main(String[] args) {
		
        int[] a1 = new int[] {5};
        int[] a2 = new int[] {1};
        printTestResult(a1, a2, new int[] {1, 5});
        
        int[] b1 = new int[] {5, 10, 87};
        int[] b2 = new int[] {1};
        printTestResult(b1, b2, new int[] {1, 5, 10, 87});
        
        int[] c1 = new int[] {5};
        int[] c2 = new int[] {1, 31, 123};
        printTestResult(c1, c2, new int[] {1, 5, 31, 123});
        
        int[] d1 = new int[] {1, 45, 55};
        int[] d2 = new int[] {10, 31, 123, 200};
        printTestResult(d1, d2, new int[] {1, 10, 31, 45, 55, 123, 200});
        
	}
	
	public static void printTestResult(int[] arr1, int[] arr2, int[] expected) {
		if(Arrays.equals(TwoWayMerge.merge(arr1, arr2), expected)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
	}

}
