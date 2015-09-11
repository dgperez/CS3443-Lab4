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
		    
		    // code here to use the value of unit to create the
		    // right type of Length object and store it in length.
		   
		    // need more code for other parts of this assignment
		}
		for (Length i: length){
			System.out.println(i);
		}
		// System.out.println(length);
		// need more code for other parts of this assignment
	}
	
//	public Length objectType(double v, String m){
	//	//if (m.startsWith(m))
		//	return Meter(v);
	//}

}
