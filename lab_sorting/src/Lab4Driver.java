
public class Lab4Driver {

	public static void main(String[] args) {
		
		Group1 group1 = new Group1("Space Cadets");
		
		group1.addPerson("Dan Brown", 2763, 21);
		group1.addPerson("Susan Smith", 8750, 32);
		group1.addPerson("Jennifer Turner", 6523, 26);
		group1.addPerson("John Cooper", 1343, 40);
		group1.addPerson("Bob Donald", 7623, 24);
		
		group1.PrintGroup1();
		
		System.out.println();
		System.out.println("****************    The data for Group 1 is now sorted    ********************");
		System.out.println();
		
		// TODO call the sort method you created in the Group1 class
		group1.ageSort();

		
		group1.PrintGroup1();

				// Part 2


		System.out.println();
		System.out.println("###################    Part 2     #############################");
		System.out.println();
		
		Group2 group2 = new Group2("Nerd Heard");

		group2.addPerson("Bella Donna", 8634, 30);
		group2.addPerson("Ted Johnson", 6354, 19);
		group2.addPerson("Max Underwood", 7233, 50);
		group2.addPerson("Claire Wilson", 2397, 42);
		group2.addPerson("Mike Harmon", 6192, 24);
		
		group2.PrintGroup2();
		
		System.out.println();
		System.out.println("****************    The data for Group 2 is now sorted    ********************");
		System.out.println();
		
		group2.ageSort();
		
		
		group2.PrintGroup2();
	}

}
