package object_LYJ;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() { // toString ������(hash�� ��� -> id,name ���)
		return id + ", " + name;
	}

	@Override
	public boolean equals(Object obj) {// equals ������(�ּҰ��� �˻� -> id �˻�)
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (this.id == std.id) {
				return true;
			} else {
				return false;
			}
		} else
			return false;
	}
	public int hashCode() { //hashCode ������(�ּҰ� -> id ���)
		return id;
	}

}

public class EqualsTest {
	public static void main(String[] args) {
		Student Lee = new Student(100, "�̻��"); // ��ü ����
		Student Lee2 = Lee; // �ּҰ� ����
		Student Sang = new Student(100, "�̻��"); // ��ü ����

		if (Lee == Lee2) {// �ּҰ� ��
			System.out.println(Lee + ", " + Lee2 + " ���� �ּҰ��� ����"); // �����ǵ� toString���� ��µ�(hash�� ��� ->id,name ���)(hash��
																	// ��� ->id,name ���)
		} else {
			System.out.println(Lee + ", " + Lee2 + " ���� �ּҰ��� �ٸ���."); // �����ǵ� toString���� ��µ�(hash�� ��� ->id,name ���)
		}
		if (Lee == Sang) {// �ּҰ� ��
			System.out.println(Lee + ", " + Sang + " ���� �ּҰ��� ����"); // �����ǵ� toString���� ��µ�(hash�� ��� ->id,name ���)
		} else {
			System.out.println(Lee + ", " + Sang + " ���� �ּҰ��� �ٸ���."); // �����ǵ� toString���� ��µ�(hash�� ��� ->id,name ���)
		}
		if (Lee.equals(Lee2)) { // �����ǵ� equals�� ��(true -> true)
			System.out.println(Lee + ", " + Lee2 + " ���� ���� ����"); // �����ǵ� toString���� ��µ�(hash�� ��� ->id,name ���)
		} else {
			System.out.println(Lee + ", " + Lee2 + " ���� ���� �ٸ���."); // �����ǵ� toString���� ��µ�(hash�� ��� ->id,name ���)
		}
		if (Lee.equals(Sang)) { // �����ǵ� equals�� ��(false -> true)
			System.out.println(Lee + ", " + Sang + " ���� ���� ����"); // �����ǵ� toString���� ��µ�(hash�� ��� ->id,name ���)
		} else {
			System.out.println(Lee + ", " + Sang + " ���� ���� �ٸ���."); // �����ǵ� toString���� ��µ�(hash�� ��� ->id,name ���)
		}
		
		System.out.println("Lee hash Code: "+System.identityHashCode(Lee)+"�� ID�� "+ Lee.hashCode()); //�����ǵ� hashCode�� ��µ�(�ּҰ� -> id ���)
		System.out.println("Lee2 hash Code: "+System.identityHashCode(Lee2)+"�� ID�� "+ Lee2.hashCode()); //�����ǵ� hashCode�� ��µ�(�ּҰ� -> id ���)
		System.out.println("Sang hash Code: "+System.identityHashCode(Sang)+"�� ID�� "+ Sang.hashCode()); //�����ǵ� hashCode�� ��µ�(�ּҰ� -> id ���)

	}

}
