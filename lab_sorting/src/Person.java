
public class Person {

	// attributes
	private String name;
	private int id;
	private int age;

	public Person() {
		name = "";
		id = 0;
		age = 0;
	}

	public Person(String name, int Id, int Age){
		this.name = name;
		id = Id;
		age = Age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int Id) {
		id = Id;
	}

	public void setAge(int Age) {
		age = Age;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
	
	public int getId(){
		return id;
	}

	public String toString(){
		return String.format("Name: %-16s ID: %d\t Age: %d", name, id, age);
	}
	
}
