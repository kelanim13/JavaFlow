public class AsciiChars {

	public static void main(String[] args) {
		
		printNumbers();
		printLowerCase();
		printUpperCase();

	}
	
	public static void printNumbers() {
		// TODO: print valid numeric input

		System.out.println("printing numbers: ");
		for (int i = 48; i <= 57; i++) {
			System.out.printf("%s", (char)i);
		}

	}

	public static void printLowerCase() {
		// TODO: print valid lowercase alphabetic input

		System.out.println("\nlowercase alphabet: ");
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.printf("%s", (char)i);
		}
	}

	public static void printUpperCase() {
		// TODO: print valid uppercase alphabetic input

		System.out.println("\nprinting uppercase alphabet: ");
		for (int i = 65; i <= 90; i++) {
			System.out.printf("%s", (char)i);
		}
		
	}

}




