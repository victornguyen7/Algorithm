package Algorithm;
// Java implementation of recursive Binary Search 
class BinarySearch { 
	// Returns index of x if it is present in arr[l.. 
	// r], else return -1 
	int y = 2; // Modify code: show the number of sub-array (origin array is the array 1)
	int binarySearch(int arr[], int l, int r, int x) 
	{ 
		if (r >= l) { 
			int mid = l + (r - l) / 2; 
			System.out.println("The midpoint is : " + arr[mid]); // Modify code: show the midpoint of the array, sub-array

			// If the element is present at the 
			// middle itself 
			if (arr[mid] == x) {
				System.out.print("Array " + y + " : " ); // Modify code: print the number of times the array has divided
				System.out.println(arr[mid]); // Modify code: print the midpoint number based on its index
				return mid; 
			}

			// If element is smaller than mid, then 
			// it can only be present in left subarray 
			else if (arr[mid] > x) { 
				System.out.print("Array " + y + " : " ); // Modify code: print the number of times the array has divided
				printArray(arr, l, mid + 1); // Modify code: print the new array after division
				y++; // Modify code: increase the number of division times
				return binarySearch(arr, l, mid - 1, x); 
			}

			// Else the element can only be present 
			// in right subarray 
			else if (arr[mid] < x) { 
				System.out.print("Array " + y + " : " ); // Modify code: print the number of times the array has divided
				printArray(arr, mid, r + 1); // Modify code: print the new array after division
				y++; // Modify code: increase the number of division times
				return binarySearch(arr, mid + 1, r, x); 
			}
		} 

		// We reach here when element is not present 
		// in array 
		return -1; 
	} 
	// Modify code: A utility function to print array
	static void printArray(int arr[], int start, int end) // Modify code: input the start, and the end number of any sub-array
	{ 
		for (int i = start ; i < end ; ++i) 

				System.out.print(arr[i] + " "); 
			
		System.out.println(); 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
		int arr[] = { 2, 3, 4, 10, 40};
		int n = arr.length; 
		int x = 40; 
		System.out.print("Array " + 1 + " : " );
		ob.printArray(arr, 0, n);  // Modify code: print the origin array at first
		int result = ob.binarySearch(arr, 0, n - 1, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 
	} 
} 
/* This code is contributed by Rajat Mishra */