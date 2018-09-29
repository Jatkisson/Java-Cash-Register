import java.util.Scanner;
import java.security.SecureRandom;
public class Project1 {

	public static void main(String[] args) {
		// Cash Register Class
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		
		double TAX = .07; 
		int items, coupons;
		int[] itemCount = new int[100];
		int[] couponCount = new int[100];
		double[] itemPrice = new double[100];
		double[] couponAmount = new double[100];
		double itemTotal = 0;
		double couponTotal = 0;
		double taxAmount = 0;
		double subtotal = 0;
		double total = 0;
		double paid;
		int amountOfChange;
		int counter = 0, count20 = 0, count10 = 0, count5 = 0, count1 = 0;
		int countQuarter = 0, countDime = 0, countNickel = 0, countPenny = 0;
		   
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
			} while (items != 0); //End of item do while loop
		
		itemTotal = subtotal;
		counter = 0;
		
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
			couponTotal += (couponCount[counter] * couponAmount[counter]);
			
			if (coupons != 0)
				System.out.printf("%s %.2f %n%n", "Current total is", subtotal);
				
			counter++;
			} while (coupons != 0); //End of coupon do while loop
		
		taxAmount = subtotal * TAX;
		total = subtotal + taxAmount;
		
		System.out.println();
		
		System.out.printf("%s %.2f %n", "Current item total is", itemTotal);
		System.out.printf("%s %.2f %n", "Current coupon total is", couponTotal);
		System.out.printf("%s %.2f %n", "Current total is", subtotal);
		System.out.printf("%s %.2f%s%n", "The tax rate is ", TAX * 100, "%");
		System.out.printf("%s %.2f%n", "The tax amount is ", taxAmount);
		System.out.printf("%s %.2f %n%n", "The total to be paid is", total);
		
		//Making purchase
		 
		System.out.println("Please enter the amount paid to satisfy this total");
		paid = input.nextInt();
		amountOfChange = (int) ((paid - total) * 100);
		while (amountOfChange != 0)
			{
				if (amountOfChange >= 2000)
				{	
					count20++;
					amountOfChange -= 2000;
				}
				else if (amountOfChange >= 1000)
				{
					count10++;
					amountOfChange -= 1000;
				}
				else if (amountOfChange >= 500)
				{
					count5++;
					amountOfChange -= 500;
				}
				else if (amountOfChange >= 100)
				{
					count1++;
					amountOfChange -= 100;
				}
				else if (amountOfChange >= 25)
				{
					countQuarter++;
					amountOfChange -= 25;
				}
				else if (amountOfChange >= 10)
				{
					countDime++;
					amountOfChange -= 10;
				}
				else if (amountOfChange >= 5)
				{
					countNickel++;
					amountOfChange -= 5;
				}
				else
				{
					countPenny++;
					amountOfChange -= 1;
				}
			}
		System.out.println("Change due is as follows: ");
		if (count20 != 0)
			System.out.printf("%s %d %n", "$20.00 - ", count20);
		if (count10 != 0)
			System.out.printf("%s %d %n", "$10.00 - ", count10);
		if (count5 != 0)
			System.out.printf("%s %d %n", " $5.00 - ", count5);
		if (count1 != 0)
			System.out.printf("%s %d %n", " $1.00 - ", count1);
		if (countQuarter != 0)
			System.out.printf("%s %d %n", " $0.25 - ", countQuarter);
		if (countDime != 0)
			System.out.printf("%s %d %n", " $0.10 - ", countDime);
		if (countNickel != 0)
			System.out.printf("%s %d %n", " $0.05 - ", countNickel);
		if (countPenny != 0)
			System.out.printf("%s %d %n%n", " $0.01 - ", countPenny);
		
		
		int lotteryNumber = random.nextInt(19) + 1;
		int guestPick = 0;
		counter = 0;
		
		do {
			//Output for the first lottery guess
			if (counter == 0)
			{
				System.out.println("Thank you for your purchase!");
				System.out.println("To show our appreciation, we would like");
				System.out.println("to offer you a chance to win a $25 gift card!");
				System.out.println("We have generated a random number between 1 & 20.");
				System.out.println("If you can correctly guess the number, then you win!");
				System.out.println("We will give you three chances to guess!");
				System.out.println("What is your first guess?");
			}
			//Output for follow up guesses
			else if (counter < 3)
				System.out.println("What is your next guess?");
			

		if (counter < 3)
		{
			//Guest input for lottery guess
			guestPick = input.nextInt();
			
			if (guestPick > lotteryNumber)
			{
				if (counter != 2)
				System.out.printf("%s %d%s%n", "The correct answer is less than", guestPick, ".");
			}
			else if (guestPick < lotteryNumber)
			{
				if (counter != 2)
				System.out.printf("%s %d%s%n", "The correct answer is greater than", guestPick, ".");
			}
			else
			{
				if (counter != 3)
				System.out.println("You guessed correctly!");
			}
		}
		else
		{
			System.out.printf("%s %d%n", "Sorry, the correct answer was", lotteryNumber + 1);
			break;
		}
			counter++;
		} while (guestPick != lotteryNumber);
		
		if (guestPick == lotteryNumber)
		{
			System.out.println("Congratulations! You won!");
			System.out.println("You may collect your gift card from the cashier!");
		}
		else
			System.out.printf("%s%n%n", "Please come back  soon and try again!");

		System.out.println("------------------------------------------");
		System.out.println("*******       END OF PROGRAM       *******");
		}
	}
