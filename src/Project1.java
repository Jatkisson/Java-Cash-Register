import java.util.Scanner;
public class Project1 {

	public static void main(String[] args) {
		// Cash Register Class
		Scanner input = new Scanner(System.in);
		
		double TAX = .07; 
		int item;
		int[] itemCount = new int[100];
		double[] itemPrice = new double[100];
		double subtotal = 0;
		int counter = 0;
		
		System.out.println("Please enter the number of items being purchased followed by the ");
		System.out.println("price of the items being purchased with a space between the two.");
		System.out.println("Quantity ---- Price");
		item = input.nextInt();
		itemCount[0] = item;
		itemPrice[0] = input.nextDouble();
		subtotal = itemCount[0] * itemPrice[0] + subtotal;
		
		while (item != 0)      
			{ 
			counter++;
			System.out.println("Your current items entered are:");
			for (int i = 0; i < 100; i++)
			{
				if (itemCount[i] != 0)
					System.out.printf("%d  %.2f %n", itemCount[i], itemPrice[i]);
			}
			System.out.printf("%s %.2f %n", "Current total is", subtotal);
			System.out.println("Please enter the number of items being purchased followed by the ");
			System.out.println("price of the items being purchased with a space between the two.");
			System.out.println("Quantity ---- Price");
			item = input.nextInt();
			itemCount[counter] = item;
			itemPrice[counter] = input.nextDouble();
			subtotal = itemCount[counter] * itemPrice[counter] + subtotal;
			}
		
	}

}