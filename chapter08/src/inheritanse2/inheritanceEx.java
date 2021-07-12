package inheritanse2;

public class inheritanceEx {
	
	public static void main(String[] args) {
		Student s  = new Student();
		s.set();
		
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.height);
		System.out.println(s.getWeight());
	}

}
