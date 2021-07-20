package collection.hashset;

import java.util.HashSet;

import collection.Student;

public class StudentTest {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("100", "홍길동"));
		set.add(new Student("200", "강감찬"));
		set.add(new Student("300", "이순신"));
		Student jung = new Student("400", "정약용");
		set.add(jung);
		set.add(new Student("100", "송중기"));
		
		set.remove(jung);
		
		System.out.println(set);
	}

}
