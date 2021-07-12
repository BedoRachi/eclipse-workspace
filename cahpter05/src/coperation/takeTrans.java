package coperation;

public class takeTrans {
	
	public static void main(String[] args) {
		
		//Student studentJames = new Student("James", 1, 10000);
		//Student studentTomas = new Student("Tomas", 2, 10000);
		//Student studentEdward = new Student("Edward", 3, 20000);
		
		EditStudent lee = new EditStudent("이연준");
		EditStudent you = new EditStudent("유재석");
		
		Bus bus100 = new Bus(100);
		Subway subway2 = new Subway(2);
		Taxi taxy363 = new Taxi(363);
		
		lee.student.takeBus(bus100);
		lee.student.takeSub(subway2);
		you.student.takeTaxi(taxy363);

		System.out.println();
		lee.student.showStuInfo();
		you.student.showStuInfo();
		
		//studentJames.takeBus(bus100);
		//studentTomas.takeSub(subway2);
		//studentJames.takeSub(subway2);
		//studentEdward.takeTaxi(taxy363);
		
		//studentJames.showStuInfo();
		//studentTomas.showStuInfo();
		//studentEdward.showStuInfo();
		System.out.println();
		bus100.showBusInfo();
		subway2.showSubInfo();
		taxy363.showTaxiInfo();
		
		
		
	}

}
