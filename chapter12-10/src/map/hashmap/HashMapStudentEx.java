package map.hashmap;
import java.util.*;

class Student {
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}

}

public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		map.put("황기태", new Student(1, "010-111-1111"));
		map.put("이재문", new Student(2, "010-222-2222"));
		map.put("김남운", new Student(3, "010-333-3333"));
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름: ");
			String name = scanner.nextLine();
			if(name.equals("exit")) {
				break;
			}
			Student student = map.get(name);
			if(student == null) {
				System.out.println(name + " 은 없는 사람");
			} else { 
				System.out.println(student.id +" : "+ student.tel);
			}
		}
		scanner.close();

	}

}
