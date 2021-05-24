/**
 * 
 * @author TOON001
 * Description: Region class based on McDonalds Application
 *
 */
public class Regions {

	private String managerName;
	private McDonalds[] stores;
	private int numStores;
	private static int numRegions = 0;

	/**
	 * Constructor based on String and maxStore of the array for a manager
	 * @param name
	 * @param maxStores
	 */
	public Regions(String name, int maxStores) {
		managerName = name;
		stores = new McDonalds[maxStores];
		numStores = 0;
		numRegions++;
	}

	/**
	 * method to addStores based on numStores count
	 * @param storeToAdd
	 */
	public void addStore(McDonalds storeToAdd) {
		stores[numStores++] = storeToAdd;

	}

	/**
	 * method to addStore to array based to earnings
	 * @param earnings
	 */
	public void addStore(double earnings) {
		addStore(new McDonalds(earnings));
	}

	/**
	 * method to find maxEarner
	 * @return
	 */
	public McDonalds findMaxEarner() {
		McDonalds max = stores[0];
		for (int i = 0; i < numStores; i++) {
			if (max.getAnnualEarnings() < stores[i].getAnnualEarnings()) {
				max = stores[i];
			}
		}

		return max;
	}

	/**
	 * method to check is a McDonalds is in a region based on an array items
	 * @param target
	 * @return
	 */
	public boolean contains(McDonalds target) {
		for (int i = 0; i < numStores; i++) {
			if (stores[i].equals(target)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * toString for region class using McDonalds class
	 */
	public String toString() {
		String temp = "";
		temp += "Regional manager: " + managerName + "\n";
		temp += "Store Number  \t Store Manager \t Annual Earnings \n";
		temp += "******************************************************\n";
		for (int i = 0; i < numStores; i++) {
			temp += "\t" + stores[i].getStoreNumber() + "\t " + stores[i].getManagerName() + "\t \t"
					+ stores[i].getAnnualEarnings() + "\n";
		}
		return temp;
	}

}
