package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person();
		
		personLee.name = "ภฬฟฌมุ";
		personLee.height = 170F;
		personLee.weight = 80.3F;
		
		System.out.println(personLee.name);
		System.out.println(personLee.height);
		System.out.println(personLee.weight);
		
	}
}
