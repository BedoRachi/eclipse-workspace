package array;

public class StudentArray {

	public static void main(String[] args) {
		
		Student[] stu = new Student[3];
		stu[0] = new Student("1001", "James");
		stu[1] = new Student("1002", "Tomas");
		stu[2] = new Student("1003", "Edward");
		for(int i=0; i<stu.length;i++) {
			stu[i].showStudentInfo();
		}
		
		
	}
}

/*
 * °á°ú°ª 
 * 1001, James 
 * 1002, Tomas 
 * 1003, Edward
 */