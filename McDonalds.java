/**
 * 
 * @author TOON001 Description: McDonalds Application Description: An
 *         application designed to search through items in a McDonalds store
 */
public class McDonalds {

	private boolean hasGoldenArches;
	private int storeNumber;
	private double annualEarnings;
	private String storeManagerName;
	private static int numStores = 0;

	/**
	 * constructor based on earnings
	 * 
	 * @param earnings
	 */
	public McDonalds(double earnings) {
		hasGoldenArches = true;
		storeNumber = ++numStores;
		annualEarnings = earnings;
		storeManagerName = new String("Not Tobe");
	}

	/**
	 * constructor based on store manager name and earnings
	 * 
	 * @param name
	 * @param earnings
	 */
	public McDonalds(String name, double earnings) {
		storeManagerName = name;
		annualEarnings = earnings;
		storeNumber = ++numStores;

	}

	/**
	 * Constructor based on has golden arches, earnings and store manager name
	 * 
	 * @param golden
	 * @param earnings
	 * @param name
	 */
	public McDonalds(boolean golden, double earnings, String name) {
		hasGoldenArches = golden;
		storeNumber = ++numStores;
		annualEarnings = earnings;
		storeManagerName = name;
	}

	/**
	 * equals method to check if two McDonalds are desame based on storeNumber
	 * 
	 * @param other
	 * @return
	 */
	public boolean equals(McDonalds other) {
		return this.storeNumber == other.storeNumber;
	}

	/**
	 * method to addEarnings and return earnings
	 * 
	 * @param amountToAdd
	 * @return
	 */
	public double addEarnings(double amountToAdd) {
		annualEarnings += amountToAdd;
		return annualEarnings;
	}

	/**
	 * method to check is store is the best store return true or false
	 * 
	 * @return
	 */
	public boolean isGoldStore() {
		if (annualEarnings > 100000) {
			return true;
		}
		return false;
	}

	/**
	 * get method for boolean hasGoldenArches
	 * 
	 * @return
	 */
	public boolean getHasGoldenArches() {
		return hasGoldenArches;
	}

	/**
	 * get method for storeNumber
	 * 
	 * @return
	 */
	public int getStoreNumber() {
		return storeNumber;
	}

	/**
	 * get method for annualEarnings
	 * 
	 * @return
	 */
	public double getAnnualEarnings() {
		return annualEarnings;
	}

	public String getManagerName() {
		return storeManagerName;
	}

	/**
	 * set method for hasGoldenArches
	 * 
	 * @param golden
	 */
	public void setHasGoldenarches(boolean golden) {
		hasGoldenArches = golden;
	}

	/**
	 * set method for storeNumber
	 * 
	 * @param golden
	 */
	public void setStoreNumber(int number) {
		storeNumber = number;
	}

	/**
	 * set method for annualEarnings
	 * 
	 * @param golden
	 */
	public void setAnnualEarnings(double earnings) {
		annualEarnings = earnings;
	}

	/**
	 * set method for storeManagerName
	 * 
	 * @param golden
	 */
	public void setManagerName(String name) {
		storeManagerName = name;
	}

	/**
	 * toString method for McDonalds referencing Regions
	 * 
	 * @param golden
	 */
	public String toString() {
		String temp = storeNumber + "\t" + storeManagerName + "\t" + annualEarnings;
		return temp;
	}

}
