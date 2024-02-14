package Algorithm;
// Java program for implementation of Bubble Sort
class BubbleSort
{
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		int x = 1; // Modify code: start the sort with the first pass
		for (int i = 0; i < n-1; i++) {
			String y = (x == 1) ? "st Pass" : (x == 2) ? "nd Pass" : (x == 3) ? "rd Pass" : "th Pass"; // Modify code: increase from first to second, third, etc passes
			System.out.println(x + y);// Modify code: show the current pass
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					System.out.println(arr[j + 1] + " swaps into " + arr[j]); // Modify code: show which number is swapping
					printArray(arr, j + 1, j); // Modify code: print the array each time the number swaps
				}
			}
			System.out.println();
			x++;// Modify code: increase the number of passes each time
		}
	}
	/* Prints the array */
	void printArray(int arr[], int temp, int moveNum) // Modify code: input the temp, and the number that moving in order to highlight them
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			if(i == temp) { // Modify code: highlight the number that is temp and swap with the number on the left
				System.out.print("[" + arr[i] + "] ");
			}
			else if (i == moveNum) { // Modify code: highlight the number that moving, swaps to the right of the temp number
				System.out.print("*" + arr[i] + "* ");
			}
			else {
				System.out.print(arr[i] + " ");
			}
		System.out.println();
	}
	// Driver method to test above
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Given array");
		ob.printArray(arr, -1, -1); // Modify code: print the origin array at first
		System.out.println();
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr, -1, -1);
	}
}
/* This code is contributed by Rajat Mishra */

