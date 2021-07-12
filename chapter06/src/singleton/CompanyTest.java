package singleton;

public class CompanyTest {

	static Company myCompany1 = Company.getCompany();
	static Company myCompany2 = Company.getCompany();

	public static void main(String[] args) {
		System.out.println(myCompany1 == myCompany2);

	}

}
