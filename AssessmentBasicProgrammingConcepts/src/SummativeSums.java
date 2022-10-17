
public class SummativeSums {
	
	// Method which gets an array and returns the sum of the array's element
	public static int Sum(Integer[] array) {
		
		// Initialize variable
		int sum=0;
		
		// Loop through all the elements of the array
		for(Integer element: array)
			
			//Calculating the sum
			sum=sum+element;
		
		return sum;
	}
	
	public static void main(String[] args){
		// Declaring arrays
		Integer[] Array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
		Integer[] Array2 = { 999, -60, -77, 14, 160, 301 };
		Integer[] Array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
				140, 150, 160, 170, 180, 190, 200, -99 };
		
		// Calling the Sum method and saving the result
		int sumOfArray1 = Sum(Array1);
		int sumOfArray2 = Sum(Array2);
		int sumOfArray3 = Sum(Array3);
		
		// Printing out the virables
		System.out.println("#1 Array Sum: " + sumOfArray1);
		System.out.println("#2 Array Sum: " + sumOfArray2);
		System.out.println("#3 Array Sum: " + sumOfArray3);
	}
}
