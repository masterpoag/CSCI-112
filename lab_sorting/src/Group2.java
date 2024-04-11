import java.util.ArrayList;

public class Group2 {

	private ArrayList<Person> people2 = new ArrayList<Person>();
	private String groupName2;
	
	public Group2 (String name) {
		groupName2 = name;
	}
	
	public void addPerson (String name, int id, int age) {
		people2.add(new Person(name, id, age));	
	}
	
	public void PrintGroup2() {
		System.out.println("Group 2's name is: " + groupName2);
        for (Person person : people2) {
            System.out.println(person.toString());
        }
		
	}

	public void ageSort() {
		int indexOfSmallestCost;
		Person smallestCost;

		for(int outer = 0; outer < people2.size() - 1; outer++) {

			indexOfSmallestCost = outer;
			smallestCost = people2.get(outer);

			for(int inner = outer + 1; inner < people2.size(); inner++) {
				if( people2.get(inner).getAge() < smallestCost.getAge()) {
					smallestCost = people2.get(inner);
					indexOfSmallestCost = inner;
				}
			}
			people2.set(indexOfSmallestCost,people2.get(outer));
			people2.set(outer,smallestCost); // 3.


		}
	}
}
