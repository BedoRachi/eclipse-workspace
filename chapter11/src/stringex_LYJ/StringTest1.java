package stringex_LYJ;

public class StringTest1 {
	//String�� ���� new, ������ �޸� ��� Ȯ��
	
	public static void main(String[] args) {
		String str1 = new String("abc"); //�޸� ���� �Ҵ�(new) �� �ش� �޸��� �ּҰ��� str1�� ����
		String str2 = new String("abc"); //�޸� ���� �Ҵ�(new) �� �ش� �޸��� �ּҰ��� str1�� ����
		
		System.out.println(str1==str2); //�޸� ��ġ�� �ٸ����� false ���
		System.out.println(str1.equals(str2)); //���� �����Ƿ� true ���
		
		String i1 = "abc"; // abc�� ���Ǯ�� ����ǰ� �ش� �ּҰ��� i1�� ����
		String i2 = "abc"; // abc�� ���Ǯ�� ����ǰ� �ش� �ּҰ��� i2�� ����
		
		System.out.println(i1==i2); //���Ǯ���� abc�� �����ϰ� �ٶ󺸱� ������ true
		System.out.println(i1.equals(i2)); // ���� �����Ƿ� true
	}

}
