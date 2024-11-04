import java.util.Scanner;

public class loops {

	public static void main(String[] args) {

		// 32
//		int first = 25;
//		int second = 39;
//		
//		if (first == second) {
//            System.out.println(first + " == " + second);
//        } else {
//            System.out.println(first + " != " + second);
//        }
// 
//        if (first <= second) {
//                System.out.println(first + " < " + second);
//        }
//        
//        if(first >= second) {
//                    System.out.println(first + " >= " + second);
//        } else {
//        	System.out.println(first + " <= " + second);
//        }

		// 33

//		int num = 25;
//		int rem = 0;
//		int sum = 0;
//		
//		//num = 2
//		while (num > 0) {
//			rem = num % 10; // 2
//			sum = sum + rem; //	11 + 2 
//			num = num / 10; // 0
//		}
//		
//		System.out.println(sum);

//		String filled = "X";
//		String empty = "O";
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Vul een percentage (0.0 to 1.0): ");
//		double percentage = sc.nextDouble();
//
//		
//		percentage = Math.max(0, Math.min(1, percentage));
//
//		
//		int filledCount = (int) (percentage * 10);
//		int emptyCount = 10 - filledCount;
//
//		
//		StringBuilder result = new StringBuilder();
//
//		for (int i = 0; i < filledCount; i++) {
//			result.append(filled);
//		}
//		for (int i = 0; i < emptyCount; i++) {
//			result.append(empty);
//		}
//
//		System.out.println(result.toString());
//
//		sc.close();

		// 36

		// 37

//		String tqbf = "The quick brown fox";
//		String uitkomst =" ";
//		char ch;
//		
//		 for(int i = 0; i<tqbf.length();i++) {
//			 ch = tqbf.charAt(i);
//			 uitkomst = ch + uitkomst;
//		 }
//		System.out.println("reverse string = " + uitkomst);

		// 38

//		Scanner sc = new Scanner(System.in);
//		String zin;
//		System.out.print("Aa kiu, I swd skieo 236587. GH kiu: sieo??");
//		zin = sc.nextLine();
//
//		char ch[] = zin.toCharArray();
//		int letters = 0, spaces = 0, numbers = 0, others = 0;
//
//		for (int i = 0; i < zin.length(); i++)
//		{
//			if (Character.isLetter(ch[i]))
//			{
//				letters++;
//			}
//			else if (Character.isSpaceChar(i))
//				
//			{
//				spaces++;
//			}
//			else if(Character.isDigit(i))
//			{
//				numbers++;
//			}
//			else
//			{
//				others++;
//			}
//			
//			System.out.println("string are :- " +zin);
//			System.out.println("letters are :- "+letters);
//			System.out.println("spaces are :- " +spaces);
//			System.out.println("numbers are :-" +numbers);
//			System.out.println("others are :- " +others);
//		}

		// 39

//		int count = 0;
//
//		for (int i = 1; i <= 4; i++) {
//
//			for (int j = 1; j <= 4; j++) {
//
//				for (int k = 1; k <= 4; k++) {
//
//					if (i != j && i != k && j != k) {
//						System.out.println("" + i + j + k);
//						count++;
//					}
//				}
//			}
//		}
//
//		System.out.println("Total number of unique three-digit numbers is " + count);

		
		
		//42
		
	
//	            Scanner scanner = new Scanner(System.in);
//
//	            System.out.print("Input your Password: ");
//	            String password = scanner.nextLine();
//
//	            System.out.println("Your password was: " + password);
//
//	            scanner.close();
//	        
	    
		//43
		
//	    System.out.println("Twinkle, twinkle, little star,");
//        System.out.println("How I wonder what you are!");
//        System.out.println("Up above the world so high,");
//        System.out.println("Like a diamond in the sky.");
//        System.out.println("Twinkle, twinkle, little star,");
//        System.out.println("How I wonder what you are");
		
		
		
		//50
		
		
		
//		StringBuilder dividedBy3 = new StringBuilder();
//        StringBuilder dividedBy5 = new StringBuilder();
//        StringBuilder dividedBy3And5 = new StringBuilder();
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                dividedBy3And5.append(i).append(", ");
//            } else if (i % 3 == 0) {
//                dividedBy3.append(i).append(", ");
//            } else if (i % 5 == 0) {
//                dividedBy5.append(i).append(", ");
//            }
//        }
//
//        System.out.println("Divided by 3:");
//        System.out.println(dividedBy3.toString());
//        System.out.println("Divided by 5:");
//        System.out.println(dividedBy5.toString());
//        System.out.println("Divided by 3 & 5:");
//        System.out.println(dividedBy3And5.toString());
		
		
		//69
		
		
		String input = "Python";

        if (input.length() % 2 == 0) {
            String firstHalf = input.substring(0, input.length() / 2);
            System.out.println(firstHalf);
        } else {
            System.out.println("The length of the string is not even.");
        }
		
		
		

	
		
	}

}
