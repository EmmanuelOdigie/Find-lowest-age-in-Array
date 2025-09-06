package JavaFindSmallestElementInArray; // project made in eclipse

public class FindLowestAgePT2 {// public class 'FindLowestAgePT2' created

	public static void main(String[] args) {// reads, runs & executes code
		int[] ages = {10,2,25,64,34,50,43}; // int array variable 'ages' is set up
		int lowestAge = ages[0]; // int lowestAge stores the ages[0] 'first number in the array'
		// number starts from 0,1,2,3 etc
		
		for(int age:ages) {// the array set up in int array variable ages is pass down to int variable
			// age
			if(lowestAge>age) { // if statement set, if there's a lower number than each number in the Array
				lowestAge = age; // that number becomes the number in variable'age'
			}
			
		}
		
		System.out.println("Lowest age in the array: " + lowestAge); // display results

	}

}

// result:
// Lowest age in the array: 2