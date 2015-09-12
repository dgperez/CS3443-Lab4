import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import length.Foot;
import length.Inch;
import length.Length;
import length.Meter;
import length.Yard;

public class Lab4 {

	public static void main(String[] args) {
		ArrayList<Length> length = new ArrayList<>();
		Scanner in = null;
		try {
			in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException exception) {
			throw new RuntimeException("failed to open data.txt");
		}
		// need more code for other parts of this assignment
		while (in.hasNextDouble()) {
			double value = in.nextDouble();
			String unit = in.next();

			if (unit.startsWith("m"))
				length.add(new Meter(value));
			else if (unit.startsWith("i"))
				length.add(new Inch(value));
			else if (unit.startsWith("f"))
				length.add(new Foot(value));
			else if (unit.startsWith("y"))
				length.add(new Yard(value));
			else
				System.out.println("Invalid Input");

		}
		for (Length i : length) {
			System.out.println(i);
		}
		System.out.println();

		int min = 0;
		int max = 0;
		for (int i = 1; i < length.size(); i++) {
			if (length.get(min).compareTo(length.get(i)) == 1) 
				min = i;
			if (length.get(max).compareTo(length.get(i)) == -1)
				max = i;
			
			
		}

		System.out.printf("Minimum is %s%n", length.get(min));
		System.out.printf("Maximum is %s%n", length.get(max));
		System.out.println();

		Meter meter = new Meter(0);
		Inch inch = new Inch(0);
		Foot foot = new Foot(0);
		Yard yard = new Yard(0);

		for (Length i : length) {
			meter.add(i);
			inch.add(i);
			foot.add(i);
			yard.add(i);
		}
		System.out.println("Sum of Lengths Adding from First to Last");
		System.out.println(meter);
		System.out.println(inch);
		System.out.println(foot);
		System.out.println(yard);
		System.out.println();

		meter = new Meter(0);
		inch = new Inch(0);
		foot = new Foot(0);
		yard = new Yard(0);

		for (int i = length.size() - 1; i >= 0; i--) {
			meter.add(length.get(i));
			inch.add(length.get(i));
			foot.add(length.get(i));
			yard.add(length.get(i));
		}

		System.out.println("Sum of Lengths Adding from Last to First");
		System.out.println(meter);
		System.out.println(inch);
		System.out.println(foot);
		System.out.println(yard);
		System.out.println();

	}

}
