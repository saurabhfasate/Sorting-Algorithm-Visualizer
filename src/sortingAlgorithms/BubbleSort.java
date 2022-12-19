package sortingAlgorithms;

public class BubbleSort {
	
	public void runSort(int[] array) {
		int n = array.length;
	    for (int i = 0; i < n - 1; i++)
	    	for (int j = 1; j < n - i; j++)
	            if (array[j-1] > array[j]) {
	                int temp = array[j-1];
	                array[j-1] = array[j];
	                array[j] = temp;	            	
	            }
	}

}
