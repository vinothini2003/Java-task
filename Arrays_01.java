// 1).Initialize Array: Declare an array of integers named numbers with a size of 5 and initialize it 
//with values {1, 2, 3, 4, 5}.
public class  Arrays_01{
	public static void main(String[] args){
		int[] numbers = {1, 2, 3, 4, 5};
		for(int i=0; i<5 ; i++){
		System.out.println(i);
		}	
	}
}

// 2).Access Element: Print the third element of the array numbers.
public class  Arrays_02{
	public static void main(String[] args){
	  int[] numbers = {1, 2, 3, 4, 5};
	  System.out.println(number[3]);
	  
  	}
}

// 3).Modify Element: Change the value of the second element of the array numbers to 10.
public class  Arrays_03{
	public static void main(String[] args){
	  int[] numbers = {1, 2, 3, 4, 5};
	  numbers[1] = 10;
	  System.out.println(number[1]);
	  
  	}
}
 
 // 4).Array Length: Print the length of the array numbers.
public class Arrays_04{
	public static void main(String[] args) {
	  int[] numbers = {8, 7, 6,5, 4, 3, 2, 1};
	   
	       System.out.println(numbers.length);
	   
	}
}

// 5).Sum of Elements: Calculate and print the sum of all elements in the array numbers. 
 
 public class Arrays_05{
	public static void main(String[] args) {
	  int[] numbers = {8, 7, 6,5, 4, 3, 2, 1};
	  
	   for(int i =0; i<numbers.length; i++){
	       sum += numbers[i];
	   }
	   System.out.println("Sum of numbers :"+sum);
	}
}

// 6).Average of Elements: Calculate and print the average of all elements in the array numbers.
public class Arrays_06{
	public static void main(String[] args) {
	  int sum = 0;
	  
	   for(int num: numbers){
	       sum += num;
	   }
	   double average =(double) sum/numbers.length;
	   System.out.println("Sum of numbers :"+average);
	}
}
// 7).Find Maximum: Find and print the maximum element in the array numbers.
public class Arrays_07{
	public static void main(String[] args) {
	  int copyNumbers = new int[numbers.length];
	  
	   
	   System.arrayCopy(numbers,0, numbers.length);
	   }
}

// 8).Find Minimum: Find and print the minimum element in the array numbers
public class Arrays_08 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9, 4}; 
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The minimum element in the array is: " + min);
    }
}

// 9).Copy Array: Create a new array copyNumbers and copy all elements from numbers to copyNumbers.
public class Arrays_09{
	public static void main(String[] args) {
	  int copyNumbers = new int[numbers.length];
	  
	   
	   System.arrayCopy(numbers,0, numbers.length);
	   }
}
// 10).Reverse Array: Reverse the elements of the array numbers in-place
public class Arrays_10 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; 

        System.out.println("Original array:");
        printArray(numbers);
        reverseArray(numbers);
		
        System.out.println("Reversed array:");
        printArray(numbers);
    }

    public static void reverseArray(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


 //12).Sort Array: Sort the elements of the array numbers in ascending order.
class Arrays_12{
	public static void main(String[] args) {
		int[] numbers = {5, 2, 3, 6, 1, 4};
		for(int i=0; i<numbers.length; i++){
			
		
		}
		System.out.println(Arrays.toString(numbers));
	}
} 
 
// 13) Merge Arrays: Merge two arrays arr1 = {1, 2, 3} and arr2 = {4, 5, 6} 
//     into a new array mergedArray.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("Merged array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        return mergedArray;
    }
}

// 14) Count Occurrences: Count and print the number of occurrences of a specific value (e.g., 3) in the array numbers.
public class Arrays_14 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 3, 7, 3, 9}; // Example array
        int targetValue = 3; // Value to count occurrences for

        int occurrences = countOccurrences(numbers, targetValue);

        System.out.println("Number of occurrences of " + targetValue + ": " + occurrences);
    }

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}

// 15) Remove Element: Remove the element at index 2 from the array numbers.
import java.util.Arrays;
public class Arrays_15 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Example array

        numbers = removeElementAtIndex(numbers, 2);

        System.out.println("Array after removing element at index 2: " + Arrays.toString(numbers));
    }

    public static int[] removeElementAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {

            return arr;
        }

        int[] newArray = new int[arr.length - 1];
        
        System.arraycopy(arr, 0, newArray, 0, index);

        System.arraycopy(arr, index + 1, newArray, index, arr.length - index - 1);

        return newArray;
    }
}
