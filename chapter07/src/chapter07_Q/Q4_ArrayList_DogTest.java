package chapter07_Q;

import java.util.ArrayList;

public class Q4_ArrayList_DogTest {

	public static void main(String[] args) {
		ArrayList<Q4_Array_Dog> dog = new ArrayList<Q4_Array_Dog>();

		dog.add(new Q4_Array_Dog("�鱸", "������"));
		dog.add(new Q4_Array_Dog("Ȳ��", "������"));
		dog.add(new Q4_Array_Dog("�汸", "������"));
		dog.add(new Q4_Array_Dog("������", "���찳"));
		dog.add(new Q4_Array_Dog("�һ���", "���찳"));

		for (int i = 0; i < dog.size(); i++) {
			System.out.println(dog.get(i).showDogInfo());
		}
		System.out.println("##############################");
		for(Q4_Array_Dog d : dog) {
			System.out.println(d.showDogInfo());
		}

	}

}
