package jawadmouradlab10;

	/*
	 * testSelectionSort.java
	 *
	 * To change this template, choose Tools | Template Manager
	 * and open the template in the editor.
	 */
	import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.assertArrayEquals;

	public class testSelectionSort {
		private SelectionSort sorter = new SelectionSort();
		@Test
		
		public void test() {
			testPositive();
			testNegative();
			testMixed();
			testDuplicates();
		}
		public testSelectionSort() {
		}	
		public void testPositive() {
	        int[] arr = {8, 9, 7, 10, 2};
	        int[] sortedArr = {2, 7, 8, 9, 10};
	        arr = sorter.basicSelectionSort(arr);
	        assertArrayEquals(sortedArr, arr, "The array should be sorted in ascending order");
	    }

	    public void testNegative() {
	        int[] arr = {-3, -1, -7, -4, -5};
	        int[] sortedArr = {-7, -5, -4, -3, -1};
	        arr = sorter.basicSelectionSort(arr);
	        assertArrayEquals(sortedArr, arr, "The array should be sorted in ascending order");
	    }

	    public void testMixed() {
	        int[] arr = {-1, 0, 5, -2, 3};
	        int[] sortedArr = {-2, -1, 0, 3, 5};
	        arr = sorter.basicSelectionSort(arr);
	        assertArrayEquals(sortedArr, arr, "The array should be sorted in ascending order");
	    }

	    public void testDuplicates() {
	        int[] arr = {5, 1, 5, 2, 2};
	        int[] sortedArr = {1, 2, 2, 5, 5};
	        arr = sorter.basicSelectionSort(arr);
	        assertArrayEquals(sortedArr, arr, "The array should be sorted in ascending order");
	    }
}
