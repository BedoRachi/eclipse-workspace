package abstractEx;

public class ComputerTest {

	public static void main(String[] args) {
		
		//Computer c1 = new Computer(); Error 발생, 추상 클래스는 New 사용불가
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook(); Error 발생, 추상 클래스는 New 사용불가
		Computer c4 = new MyNoteBook();
		
		c2.display();
		c2.typing();
		c2.turnOn();
		c2.turnOff();
		c4.display();
		c4.typing();
		c4.turnOn();
		c4.turnOff();
		
	}
}
