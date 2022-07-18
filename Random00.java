import java.util.ArrayList;
import java.util.Collections;

public class Random00 {
	public static void main(String args[]) {


		System.out.print("\nTrying someting new\n");

		ArrayList<String> alf = new ArrayList<>();
		
		alf.add("A");
		alf.add("C");
		alf.add("B");
		alf.add("E");
		alf.add("D");
		alf.add("G");
		alf.add("F");

		System.out.println(" *** ");

		for(int i=0; i<alf.size(); i++) //for loop
		System.out.println(alf.get(i));

		System.out.println(" *** ");
		
		for (String str : alf) // for each loop
		System.out.println(str);
		
		System.out.println(" *** ");
		
		Collections.sort(alf); // sorting
		System.out.println("sorting...");
		
		System.out.println(" *** ");

		for(int i=0; i<alf.size(); i++) //for loop
		System.out.println(alf.get(i));

		System.out.println(" *** ");
		
		for (String str : alf) // for each loop
		System.out.println(str);
		
		System.out.println(" *** ");

		

	



	}
}