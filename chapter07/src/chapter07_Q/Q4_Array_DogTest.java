package chapter07_Q;

public class Q4_Array_DogTest {

	public static void main(String[] args) {
		
		Q4_Array_Dog[] dog = new Q4_Array_Dog[5];
		
		dog[0] = new Q4_Array_Dog("¹é±¸", "Áøµ¾°³");
		dog[1] = new Q4_Array_Dog("Èæ±¸", "Áøµ¾°³");
		dog[2] = new Q4_Array_Dog("È²±¸", "Áøµ¾°³");
		dog[3] = new Q4_Array_Dog("Âý»ìÀÌ", "Âý»ì°³");
		dog[4] = new Q4_Array_Dog("ÁÖµÕÀÌ", "¶Ë°³");
		
		for(int i=0;i<dog.length;i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		System.out.println("#########################");
		
		for(Q4_Array_Dog d : dog) {
			System.out.println(d.showDogInfo());
		}
		
	}

}
