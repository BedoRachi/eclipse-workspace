package collection.hashset;

import java.util.HashSet;

import collection.Student;

public class StudentTest {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("100", "ȫ�浿"));
		set.add(new Student("200", "������"));
		set.add(new Student("300", "�̼���"));
		Student jung = new Student("400", "�����");
		set.add(jung);
		set.add(new Student("100", "���߱�"));
		
		set.remove(jung);
		
		System.out.println(set);
	}

}
