package Algorithm;
// Java program for implementation of Selection Sort 
class SelectionSort 
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		int x = 1; // Modify code: start the sort with the first pass

		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++) 
		{ 
			String y = (x == 1) ? "st Pass" : (x == 2) ? "nd Pass" : (x == 3) ? "rd Pass" : "th Pass"; // Modify code: increase from first to second, third, etc passes
			System.out.println(x + y); // Modify code: show the current pass
			// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < n; j++) 
				if (arr[j] < arr[min_idx]) 
					min_idx = j; 
			System.out.println("The minimun number is: " + arr[min_idx]); // Modify code: show the minimum number in the array

			// Swap the found minimum element with the first 
			// element 
			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
			if(arr[min_idx] != arr[i]) {
				System.out.println(arr[min_idx] + " swaps into " + arr[i]); // Modify code: show which number is swapping
			}
			else {
				System.out.println(arr[i] + " stays at its index"); // Modify code: show that the number already stays at its correct position
			}
			printArray(arr, i, min_idx); // Modify code: print the array after each pass
			System.out.println();
			x++; // Modify code: increase the number of pass each time
		} 
	} 

	// Prints the array 
	void printArray(int arr[], int min_idx, int moveNum) // Modify code: input the minimun number, and the number that swapping to that index in order to highlight them
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			if(i == min_idx) { // Modify code: highlight the minimum number after each pass
				System.out.print("[" + arr[i] + "] ");
			}
			else if (i == moveNum) { // Modify code: highlight the number that swaps into the index of the minimum in each pass
				System.out.print("*" + arr[i] + "* ");
			}
			else {
				System.out.print(arr[i] + " "); 
			}
		System.out.println(); 
	} 

	// Driver code to test above 
	public static void main(String args[]) 
	{ 
		SelectionSort ob = new SelectionSort(); 
		int arr[] = {64,25,12,22,11}; 
		System.out.println("Givien array"); 
		ob.printArray(arr, -1, -1); // Modify code: print the origin array at first
		System.out.println();
		ob.sort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr, -1, -1); 
	} 
} 
/* This code is contributed by Rajat Mishra*/