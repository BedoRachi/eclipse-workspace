package singleton;

public class Company {

	private static Company instance = new Company();

	private Company() { // 객체를 New 키워드로 만들 수 없음

	}

	public static Company getCompany(){// 객체를 메소드 호출을 통해 만듬  
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
