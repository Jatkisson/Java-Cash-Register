import java.util.Scanner;
public class Project1 {

	public static void main(String[] args) {
		// Cash Register Class
		Scanner input = new Scanner(System.in);
		
		double TAX = .07; 
		int items;
		int coupons;
		int[] itemCount = new int[100];
		int[] couponCount = new int[100];
		double[] itemPrice = new double[100];
		double[] couponAmount = new double[100];
		double subtotal = 0;
		int counter = 0;
		
		/*
		System.out.println("Please enter the number of items being purchased followed by the ");
		System.out.println("price of the items being purchased with a space between the two.");
		System.out.println("Quantity ---- Price");
		items = input.nextInt();
		itemCount[0] = items;
		itemPrice[0] = input.nextDouble();
		subtotal = itemCount[0] * itemPrice[0] + subtotal;
		*/
		   
		//Entering Items
		do { 
			System.out.println("Please enter the number of items being purchased followed by the ");
			System.out.println("price of the items being purchased with a space between the two.");
			System.out.println("Quantity ---- Price");
			items = input.nextInt();
			itemCount[counter] = items;
			if (items != 0)
			{
				itemPrice[counter] = input.nextDouble();
				subtotal = itemCount[counter] * itemPrice[counter] + subtotal;
			
			//Print the items being purchased
			System.out.println("Your current items entered are:");
			for (int i = 0; i < 100; i++)
			{
				if (itemCount[i] != 0)
					System.out.printf("%d%s %d  %.2f %n", i + 1, ".)", itemCount[i], itemPrice[i]);
			}
			}
			System.out.printf("%s %.2f %n%n", "Current total is", subtotal);
			
			counter++;
			} while (items != 0);
		
		//Entering Coupons
		do { 
			System.out.println("Please enter the number of coupon(s) being purchased followed by the ");
			System.out.println("price of the coupon being purchased with a space between the two.");
			System.out.println("Quantity ---- Price");
			coupons = input.nextInt();
			couponCount[counter] = coupons;
			if (coupons != 0)
			{
				couponAmount[counter] = input.nextDouble();
				//Print the items being purchased
				System.out.println("Your current items entered are:");
				for (int i = 0; i < 100; i++)
				{
					if (itemCount[i] != 0)
						System.out.printf("%d%s %d  %.2f %n", i + 1, ".)", itemCount[i], itemPrice[i]);
				}
				
				//Print the coupons being purchased
				System.out.println("Your current coupons entered are:");
				for (int i = 0; i < 100; i++)
				{
					if (couponCount[i] != 0)
						System.out.printf("%d%s %d  %.2f %n", i + 1, ".)", couponCount[i], couponAmount[i]);
				}
			}
			subtotal = subtotal - (couponCount[counter] * couponAmount[counter]);
			
			/*
			System.out.println("Your current items entered are:");
			for (int i = 0; i < 100; i++)
			{
				if (couponCount[i] != 0)
					System.out.printf("%d  %.2f %n", couponCount[i], couponAmount[i]);
			}
			*/
			
			System.out.printf("%s %.2f %n%n", "Current total is", subtotal);
			
			counter++;
			} while (coupons != 0);
		
		System.out.printf("%s %.2f %n", "Current total is", subtotal);
	}
}