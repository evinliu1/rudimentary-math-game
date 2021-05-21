package lottery;
import java.util.*;

public class addinggameRAND {
	
	public static void main(String[] arg) {
		Scanner inputDevice = new Scanner(System.in);
		password(inputDevice);
		Random rand = new Random();
		int points = 0;
		int wrong = 0;
		while (wrong < 3) {
			int result = play(inputDevice, rand);
			if (result > 0) {
				points++;
			} else {
				wrong++;
			}
		}
		
		System.out.println("You earned " + points + " points.");
	}

	
	public static int play(Scanner inputDevice, Random rand) {
		int operands = rand.nextInt(4) + 2;
		int sum = rand.nextInt(10)+1;
		System.out.print(sum);
		for (int i = 2; i<= operands; i ++) {
			int n = rand.nextInt(10) + 1;
			sum += n;
			System.out.print(" + " + n);
			
		}
		System.out.print(" = ");
		int guess = inputDevice.nextInt();
		if (guess == sum) {
			return 1;
		} else {
			System.out.println("Wrong! The total was " + sum);
			return 0;
		}
	}

	
	public static void password(Scanner inputDevice) {
		String phrase;
		do {
			System.out.println("type password : \n hint: password is 'math_game'");
			phrase = inputDevice.next();
		} while (!phrase.equals("math_game"));
		System.out.println("Welcome to the math game");
		System.out.println("Every question you answer correctly gives you a point. If you answer three questions incorrectly, the game ends and your points are recorded");
	}
}
