package chapter07_Q;

public class Q4_Array_DogTest {

	public static void main(String[] args) {
		
		Q4_Array_Dog[] dog = new Q4_Array_Dog[5];
		
		dog[0] = new Q4_Array_Dog("�鱸", "������");
		dog[1] = new Q4_Array_Dog("�汸", "������");
		dog[2] = new Q4_Array_Dog("Ȳ��", "������");
		dog[3] = new Q4_Array_Dog("������", "���찳");
		dog[4] = new Q4_Array_Dog("�ֵ���", "�˰�");
		
		for(int i=0;i<dog.length;i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		System.out.println("#########################");
		
		for(Q4_Array_Dog d : dog) {
			System.out.println(d.showDogInfo());
		}
		
	}

}
