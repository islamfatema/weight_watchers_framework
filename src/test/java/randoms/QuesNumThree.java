package randoms;

import java.util.Random;

/**
 * @author fatemaislam
 *
 */
public class QuesNumThree {

	public static void main(String[] args) {
	
		int counter;
		int numbers[] = new int[500];
		Random rnum = new Random();

		for (counter = 0; counter < 500; counter++) {
			numbers[counter] = rnum.nextInt(1000);
		}

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Smallest number is : " + smallest);
	}

}
