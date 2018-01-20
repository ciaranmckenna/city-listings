/**
 * 
 */
package practicalTen;

/**
 * @author Ciaran
 *
 */
public class CityAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		City Beijing = new City("Beijing", 11, true, "China");
		City Madrid = new City("Madrid", 5, true, "Spain");
		City Rome = new City("Rome", 6, true, "Italy");
		City NewYork = new City("New York", 8, false, "USA");
		City Washington = new City("Washington", 2, true, "USA");
		City Dallas = new City("Dallas", 3, false, "USA");

		// Array to store the city objects
		City[] cities = { Beijing, Madrid, Rome, NewYork, Washington, Dallas };

		// invoking methods
		// displayAll(cities);
		smallestPopulation(cities);
		capitalCity(cities);
		americanCities(cities);
		averagePopulation(cities);
	}

	/*
	 * method to display the details of the flight array ....
	 */
	public static void displayAll(City[] myArray) {

		for (int loop = 0; loop < myArray.length; loop++) {
			System.out.println(myArray[loop].toString());
		}

	}

	/*
	 * method to search for the city with the smallest population ...
	 * 
	 */
	public static void smallestPopulation(City[] myArray) {

		int smallest = myArray[0].getPopulation();

		for (int loop = 0; loop < myArray.length; loop++) {
			if (myArray[loop].getPopulation() < smallest) {
				smallest = myArray[loop].getPopulation();
			}
		}
		System.out.println("The smallest population is " + smallest);
	}

	/**
	 * capital city search method
	 */
	public static void capitalCity(City[] myArray) {

		for (int loop = 0; loop < myArray.length; loop++) {
			if (myArray[loop].isCountryCapital() == true) {
				System.out.println(myArray[loop].getCityNames() + " in " + myArray[loop].getCountry());
			}
		}
	}

	public static void americanCities(City[] myArray) {

		for (int loop = 0; loop < myArray.length; loop++) {
			if (myArray[loop].getCountry() == "USA") {
				System.out.println(myArray[loop].getCityNames() + " is a city in the USA.");
			}

		}
	}
	
	/**
	 * method to output the average pop across the array
	 * @param myArray
	 */
	public static void averagePopulation(City[] myArray) {
		
		double total = 0;
		
		for (int loop = 0; loop < myArray.length; loop++) {
			total += myArray[loop].getPopulation();
		}
		System.out.printf("The average population is %.2f", total/myArray.length);
	}

}
