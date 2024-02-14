package Algorithm;
// Java program for implementation of QuickSort 
class QuickSort 
{ 
	/* This function takes last element as pivot, 
	places the pivot element at its correct 
	position in sorted array, and places all 
	smaller (smaller than pivot) to left of 
	pivot and all greater elements to right 
	of pivot */
	int x = 1; // Modify code: start the sort with the first pass
	int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high]; 
		String y = (x == 1) ? "st Pass" : (x == 2) ? "nd Pass" : (x == 3) ? "rd Pass" : "th Pass"; // Modify code: increase from first to second, third, etc passes
		int i = (low-1); // index of smaller element 
		for (int j=low; j<high; j++) 
		{ 
			// If current element is smaller than or 
			// equal to pivot 
			if (arr[j] <= pivot) 
			{ 
				i++; 

				// swap arr[i] and arr[j] 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		// swap arr[i+1] and arr[high] (or pivot) 
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp;
		
		System.out.println(x + y); // Modify code: show the current pass
		System.out.println("The pivot of the array is: " + pivot); // Modify code: show which number is being a pivot
		System.out.println(arr[i + 1] + " swaps into " + arr[high]); // Modify code: show which number is swapping
		printArray(arr, high, i + 1); // Modify code: print the array after each pass
		x++; // Modify code: increase the number of pass each time
		System.out.println();
		return i+1; 
		} 


	/* The main function that implements QuickSort() 
	arr[] --> Array to be sorted, 
	low --> Starting index, 
	high --> Ending index */
	void sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			/* pi is partitioning index, arr[pi] is 
			now at right place */
			int pi = partition(arr, low, high); 

			// Recursively sort elements before 
			// partition and after partition 
			sort(arr, low, pi-1); 
			sort(arr, pi+1, high); 
		} 
	} 

	/* A utility function to print array of size n */
	static void printArray(int arr[], int high, int pivot) // Modify code: input the number in the back of the array, and the number that swapping to that index in order to highlight them
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			if(i == high) { // Modify code: highlight the number after swapping into the back of the array
				System.out.print("[" + arr[i] + "] ");
			}
			else if (i == pivot) { // Modify code: highlight the number that swaps into its correct position
				 System.out.print("*" + arr[i] + "* ");
			}
			else{
				System.out.print(arr[i] + " "); 
			}
		System.out.println(); 
	} 

	// Driver program 
	public static void main(String args[]) 
	{ 
		int arr[] = {10, 7, 8, 9, 1, 5}; 
		int n = arr.length; 

		QuickSort ob = new QuickSort(); 
		System.out.println("Givien array"); 
		ob.printArray(arr, -1, -1); // Modify code: print the origin array at first
		System.out.println();
		ob.sort(arr, 0, n-1); 

		System.out.println("sorted array"); 
		printArray(arr, -1 , -1); 
	} 
} 
/*This code is contributed by Rajat Mishra */