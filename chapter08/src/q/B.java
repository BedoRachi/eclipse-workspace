package q;

import p.A;

public class B extends A {
	
	void set() {
		pub =1; // Public�� ����, �ܺ� Package ������� ��밡��
		pro =2; // protected�� ���� Package�� ��� ���� ��� ����, �ܺ� Package�� ��ӽÿ��� ��밡��
		//def =3; Error �߻�, Default�� ���� Package������ ��� ����(�ܺ� Package �Ұ�)
		//pri =4; Error �߻�, Private�� �ܺ� Ŭ�������� ��� �Ұ� 
	}

}
