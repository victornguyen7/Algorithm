package Algorithm;
// Java program for implementation of Insertion Sort
class InsertionSort {
	/*Function to sort array using insertion sort*/
	void sort(int arr[])
	{
		int n = arr.length;
		int x = 1; // Modify code: start the sort with the first pass
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			String y = (x == 1) ? "st Pass" : (x == 2) ? "nd Pass" : (x == 3) ? "rd Pass" : "th Pass"; // Modify code: increase from first to second, third, etc passes
			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
			System.out.println(x + y); // Modify code: show the current pass
			if(arr[i] != arr[j + 1]) {
				System.out.println(arr[i] + " moves to the index of " + arr[j + 1]); // Modify code: show where the larger number moves into
			
				if (j >= 0 && arr[j + 1] > arr[j]) { // Modify code: show where the smaller number moves into
					System.out.println(arr[j + 1] + " moves to the index after " + arr[j]);
				} else {
					System.out.println(arr[j + 1] + " moves to the first index of the array");
				}
			}
			else {
				System.out.println(arr[i] + " stays at its index"); // Modify code: show that the number already stays at its correct position
			}
			printArray(arr, i, j + 1); // Modify code: print the array after each pass
			x++; // Modify code: increase the number of passes each time
			System.out.println();
		}
	}
	/* A utility function to print array of size n*/
	static void printArray(int arr[], int key_idx, int start_idx) // Modify code: input the key, and the number that moves in order to highlight them
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			if(i == key_idx) { // Modify code: highlight the key number and move to the right part of the array
				System.out.print("[" + arr[i] + "] ");
			}
			else if (i == start_idx) { // Modify code: highlight the number that is moving to the left part of the array
				 System.out.print("*" + arr[i] + "* ");
			}
			else{
				System.out.print(arr[i] + " ");
			}
		System.out.println();
	}
	// Driver method
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6 };
		InsertionSort ob = new InsertionSort();
		System.out.println("Given array");
		ob.printArray(arr,-1, -1); // Modify code: print the origin array at first
		System.out.println();
		ob.sort(arr);
		printArray(arr, -1, -1);
	}
} /* This code is contributed by Rajat Mishra. */



