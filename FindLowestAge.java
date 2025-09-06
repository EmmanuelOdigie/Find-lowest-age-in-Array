package JavaFindSmallestElementInArray; // project made in eclipse

public class FindLowestAge {// public class 'FindLowestAge' made

	public static void main(String[] args) {// reads, runs & executes code
		
		int[] age = {25,10,76,72,2,1,5,95}; // integer Array made with the variable 'age' name
	
		int lowestAge = age[0]; // set int lowestAge to be age[0] which takes the first number in
		// array, int lowestAge = 25
		
	//for loop created to pass down the array values in variable 'age' to int 'newAge'
		for(int newAge:age) {
			if(lowestAge>newAge) { // if statement made if lowestAge is lower than the value in 
		//'newAge' and can't get any lower the 'lowestAge is then set as the newAge'
				lowestAge = newAge;
			}
			
		}
		System.out.println(lowestAge); // display lowest age
	}

}

// result
// 1