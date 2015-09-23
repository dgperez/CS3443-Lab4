import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import length.Foot;
import length.Inch;
import length.Length;
import length.Meter;
import length.Yard;

/**
 * Lab4: The task is to read a file data.txt, which consists of one length </br>
 *  on each line. Each length should be stored in an appropriate Length </br>
 *  object. All the Length objects should be stored in an ArrayList&lt;Length>. </br>
 *  Each Length object should be printed out. The minimum and maximum length </br>
 *  should be printed out. Then, the sum of the Lengths should be printed</br>
 *  out in different ways as shown below.
 * @author Daria Perez Alonso
 *
 */
public class Lab4 {

	/**
	 * main entry to program
	 * @param args ignored
	 */
	public static void main(String[] args) {
		ArrayList<Length> lengths = new ArrayList<>();
		
		Scanner in = null;
		try {
			in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException exception) {
			throw new RuntimeException("failed to open data.txt");
		}
		
		// adds objects to length array
		while (in.hasNextDouble()) {
			double value = in.nextDouble();
			String unit = in.next();

			if (unit.startsWith("m"))
				lengths.add(new Meter(value));
			else if (unit.startsWith("i"))
				lengths.add(new Inch(value));
			else if (unit.startsWith("f"))
				lengths.add(new Foot(value));
			else if (unit.startsWith("y"))
				lengths.add(new Yard(value));
			else
				System.out.println("Invalid unit input: " + unit);
		}
		in.close();
		
		// prints objects in length array
		for (Length i : lengths) {
			System.out.println(i);
		}
		System.out.println();

		// Prints Minimum and maximum values of length array
		int min = 0;
		int max = 0;
		for (int i = 1; i < lengths.size(); i++) {
			if (lengths.get(min).compareTo(lengths.get(i)) == 1)
				min = i;
			else if (lengths.get(max).compareTo(lengths.get(i)) == -1)
				max = i;
		}
		System.out.printf("Minimum is %s%n", lengths.get(min));
		System.out.printf("Maximum is %s%n", lengths.get(max));
		System.out.println();

		// Prints Sum of Lengths Adding from First to Last
		Meter meter = new Meter(0);
		Inch inch = new Inch(0);
		Foot foot = new Foot(0);
		Yard yard = new Yard(0);

		for (Length i : lengths) {
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

		// Prints Sum of Lengths Adding from Last to First
		meter = new Meter(0);
		inch = new Inch(0);
		foot = new Foot(0);
		yard = new Yard(0);

		for (int i = lengths.size() - 1; i >= 0; i--) {
			meter.add(lengths.get(i));
			inch.add(lengths.get(i));
			foot.add(lengths.get(i));
			yard.add(lengths.get(i));
		}

		System.out.println("Sum of Lengths Adding from Last to First");
		System.out.println(meter);
		System.out.println(inch);
		System.out.println(foot);
		System.out.println(yard);
		System.out.println();

	}

}
