package com.viettel.api.util;


/**
 * 
 * @author TRUNGKH
 * 
 */

public class Quicksort<T> {

	public static <T> void sort(T[] values, Class<T> clazz, Comparator<T> comparator) {
		Quicksort<T> quicksort = new Quicksort<T>();
		
		if (values == null || values.length == 0) {
			return;
		}
		
		quicksort.sort(values, comparator);
	}
	
	public void sort(T[] values, Comparator<T> comparator) {
		// check for empty or null array
		if (values == null || values.length == 0) {
			return;
		}

		int length = values.length;
		quicksort(values, 0, length - 1, comparator);
	}

	private void quicksort(T[] values, int low, int high, Comparator<T> comparator) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		T pivot = values[low + (high - low) / 2];

		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (comparator.compare(values[i], pivot)) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (comparator.compare(pivot, values[j])) {
				j--;
			}

			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(values, i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quicksort(values, low, j, comparator);
		if (i < high)
			quicksort(values, i, high, comparator);
	}

	private void exchange(T[] values, int i, int j) {
		T temp = values[i];
		values[i] = values[j];
		values[j] = temp;
	}

	public interface Comparator<T> {

		/**
		 * 
		 * @param t1
		 * @param t2
		 * @return true if t1 before t2
		 */
		public boolean compare(T t1, T t2);
	}

}
