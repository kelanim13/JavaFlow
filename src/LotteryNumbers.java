import java.util.Random;
import java.util.Scanner;

public class LotteryNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("\nPlease enter your name: ");

		String name = input.nextLine();

		System.out.printf("Hello %s", name);

		System.out.println("\nDo you wish to continue this interactive portion?");
		String answer = input.nextLine();

		do {
			if (answer.equals("yes")) {
				System.out.println("continue");
			} else {
				System.out.println("please return later to complete the survey");
			}

			System.out.println("What is the name of your favorite pet?");
			String petName = input.nextLine();

			System.out.println("How old is your pet?");
			int petAge = Integer.parseInt(input.nextLine());

			System.out.println("What is your lucky number?");
			int luckyNum = Integer.parseInt(input.nextLine());

			System.out.println("Do they have a favorite quarterback?  If so what is their jersey number?");
			int jerseyNum = Integer.parseInt(input.nextLine());

			System.out.println("What is two-digit model year of their car?");
			int modelYear = Integer.parseInt(input.nextLine());

			System.out.println("What is the first name of the your favorite actor or actress?");
			String firstName = input.nextLine();

			System.out.println("Enter a random number between 1 and 50");
			int randNum = Integer.parseInt(input.nextLine());

			// generating magic ball 

			Random rand = new Random();

			int min = 0;
			int max = 75;
			int value = rand.nextInt(76);

			while (value <= 0) {

				value -= max;
			}

			while (value >= 75) {
				value += max;
			}

			System.out.println("Magic ball: " + value);

			// 5 non-magic numbers
			
			int lottNum1 = jerseyNum + petAge + luckyNum;

			int lottNum2 = petAge + modelYear;

			int lottNum3 = 42 / luckyNum;

			int lottNum4 = modelYear + luckyNum;

			int lottNum5 = firstName.charAt(0);

			int min1 = 0;
			int max1 = 76;
			int value1 = rand.nextInt();

			while (value <= 0) {
				value -= max1;
			}

			while (value >= 65) {
				value += max1;
			}

			System.out.print(
					"Lottery numbers: " + lottNum1 + "," + lottNum2 + "," + lottNum3 + "," + lottNum4 + "," + lottNum5);

			System.out.println("\nWould you like to play again?");
			answer = input.nextLine();

		} while (answer.equals("yes"));
		{
			System.out.print("here are the questions");
			return;
		}
	}
}
