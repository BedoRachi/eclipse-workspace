package singleton;

public class Company {

	private static Company instance = new Company();

	private Company() { // ��ü�� New Ű����� ���� �� ����

	}

	public static Company getCompany(){// ��ü�� �޼ҵ� ȣ���� ���� ����  
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
