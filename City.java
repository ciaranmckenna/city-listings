/**
 * 
 */
package practicalTen;

/**
 * @author Ciaran
 *
 */
public class City {
	/*
	 * Instance Vars
	 */
	private String cityNames; 
	private int population;
	private boolean countryCapital;
	private String country; 

	/**
	 * Default constructor 
	 */
	public City() {
	}

	/**
	 * Constructor with arguments
	 * @param cityNames
	 * @param population
	 * @param countryCapital
	 * @param country
	 */
	public City(String cityNames, int population, boolean countryCapital, String country) {
		super();
		this.setCityNames(cityNames);
		this.setPopulation(population);
		this.setCountryCapital(countryCapital);
		this.setCountry(country);
	}

	/**
	 * @return the cityNames
	 */
	public String getCityNames() {
		return cityNames;
	}

	/**
	 * @param cityNames the cityNames to set
	 */
	public void setCityNames(String cityNames) {
		this.cityNames = cityNames;
	}

	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		if(population <= 0 || population > 50) {
			population = 0;
			System.out.println("Error, population can't be set to less than 0 or over 50 mill");
		}else {
			this.population = population;
		}
		
	}

	/**
	 * @return the countryCapital
	 */
	public boolean isCountryCapital() {
		return countryCapital;
	}

	/**
	 * @param countryCapital the countryCapital to set
	 */
	public void setCountryCapital(boolean countryCapital) {
		this.countryCapital = countryCapital;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "City [cityNames=" + this.cityNames + ", population=" + this.population + ", countryCapital="
				+ this.countryCapital + ", country=" + this.country + "]";
	}

	
}
