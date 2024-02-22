package s;
import java.util.Arrays;

public class Logic1A {
		    public static void main(String[] args) {
		        // Input array
		        int[] inputArray = {10, 20, 30};
		        
		        // Reversing the array
		        reverseArray(inputArray);
		        
		        // Output the reversed array
		        System.out.println("Reversed array: " + Arrays.toString(inputArray));
		    }
		    
		    public static void reverseArray(int[] arr) {
		        int start = 0;
		        int end = arr.length - 1;
		        while (start < end) {
		            // Swap elements at start and end indices
		            int temp = arr[start];
		            arr[start] = arr[end];
		            arr[end] = temp;
		            // Move towards the center
		            start++;
		            end--;
		        }
		    }
		

		
	}


