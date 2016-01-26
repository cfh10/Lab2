public class Lab2 {

    public static void main(String[] args) {

	System.out.println("As I was going to St. Ives");
	System.out.println("I met a man with seven wives");
	System.out.println("Each wife had seven sacks");
	System.out.println("Each sack had seven cats");
	System.out.println("Each cat had seven kits");
	System.out.println("Kittens, cats, sacks, wives");
	System.out.println("How many were going to St. Ives?");



	boolean manGoingToStIves = true;

	 int numWives = 7;

	 int numSacksPerWife = 7;

	 int numCatsPerSack = 7;

	 int numKitsPerCat = 7;

	 int total;

	// If the original man is going to St. Ives, then all are going
	// the narrator, original man, kitten, cats, sacks, wives.
	// If the original man is going AWAY from St. Ives, then the only
	// person going is the narrator

	if (manGoingToStIves) {
	    total = 1 + 1 + (numWives * numSacksPerWife * numCatsPerSack * numKitsPerCat);
	} else {
	    // Otherwise, only the narrator is going!
	    total = 1;
	}

	// 3. Right before exiting, the system should print
	// "Number going to St. Ives is " and then, on the same line,
	// the number going to St. Ives (stored in the _total_ variable).
	// Add a statement or statements that will do this.
    System.out.println ("Number going to St. Ives is " + total);
    }

}
