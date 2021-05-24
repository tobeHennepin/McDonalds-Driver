import java.util.Scanner;

public class McDonaldsDriver {

	public static void main(String[] args) {

		McDonalds store1 = new McDonalds(true, 2000, "Tobe1");
		McDonalds store2 = new McDonalds(false, 4800, "Tobe2");
		McDonalds store3 = new McDonalds("Tobe3", 3200);
		McDonalds store4 = new McDonalds(false, 1000, "Jessica");

		// System.out.println(store1.equals(store2));
		// System.out.println(store1.equals(store1));

		Regions world = new Regions("Tobe4", 10);

		world.addStore(store1);
		world.addStore(store2);
		world.addStore(store3);
		world.addStore(store4);

		System.out.println(world + "\n");

		// Scanner input = new Scanner(System.in);
		// System.out.println("Enter the annual sales: ");
		// double earnings = input.nextDouble();
		// store1.setAnnualEarnings(earnings);
		//
		// System.out.println("The annual sale for store" + store1.getStoreNumber() + "
		// is $" + store1.getAnnualEarnings());

		// System.out.println(store1);
		// System.out.println(store4);

	}

}
