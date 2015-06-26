import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		// Set is a collection that stores only unique elements
		// HashSet does not maintain order
		// Set<String> set1 = new HashSet<String>();

		// LinkedHashSet remembers the order you added items in
		// Uses a doubly linked list to do this
		// Set<String> set1 = new LinkedHashSet<String>();

		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<String>();

		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");

		// Adding duplicate items does nothing, only 1 of each item allowed
		set1.add("mouse");

		System.out.println(set1);

		/**** COMMON SET OPERATIONS *****/
		// Iteration //////////
		for (String element : set1) {
			System.out.println(element);
		}

		// Does set contain a given item? ////////
		if (set1.contains("aardvark")) {
			System.out.println("Contains aardvark.");
		}

		if (set1.contains("cat")) {
			System.out.println("Contains cat.");
		}

		// Check if set is empty ///////////
		if (set1.isEmpty()) {
			System.out.println("Set is empty.");
		}

		// set contains some common elements with set1, and some new ones
		Set<String> set2 = new TreeSet<String>();

		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");

		// Intersection ////////
		// intersection is a copy of set 1
		Set<String> intersection = new HashSet<String>(set1);
		System.out.println(intersection);

		intersection.retainAll(set2);
		System.out.println(intersection);
		
		// Difference /////////////////////////////////////
		Set<String> difference = new HashSet<String>(set2);
		difference.removeAll(set1);
		System.out.println(difference);
	}
}
