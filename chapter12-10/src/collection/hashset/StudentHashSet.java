package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import collection.Student;

public class StudentHashSet {
	private HashSet<Student> hashSet;
	public StudentHashSet() {
		hashSet = new HashSet<Student>();
	}
	public void add(Student member) {
		hashSet.add(member);
	}
	public boolean remove(int memberId) {
		Iterator<Student> ir = hashSet.iterator();
		
		while(ir.hasNext()) {//�ϳ��� �ݺ��Ͽ� null�� ���Ë� ����
			Student stu = ir.next();
			String tempId = stu.getMemberId();
			if(tempId.equals(memberId)) {
				hashSet.remove(stu);
				return true;
			}
		}
		System.out.println(memberId + " �� �����ϴ�.");
		return false;
	}
}
