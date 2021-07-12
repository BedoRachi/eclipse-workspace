package chapter07_Q;

import java.util.ArrayList;

public class Q4_ArrayList_DogTest {

	public static void main(String[] args) {
		ArrayList<Q4_Array_Dog> dog = new ArrayList<Q4_Array_Dog>();

		dog.add(new Q4_Array_Dog("¹é±¸", "Áøµ¾°³"));
		dog.add(new Q4_Array_Dog("È²±¸", "Áøµ¾°³"));
		dog.add(new Q4_Array_Dog("Èæ±¸", "Áøµ¾°³"));
		dog.add(new Q4_Array_Dog("Âı»ìÀÌ", "Âı»ì°³"));
		dog.add(new Q4_Array_Dog("½Ò»ìÀÌ", "Âı»ì°³"));

		for (int i = 0; i < dog.size(); i++) {
			System.out.println(dog.get(i).showDogInfo());
		}
		System.out.println("##############################");
		for(Q4_Array_Dog d : dog) {
			System.out.println(d.showDogInfo());
		}

	}

}
