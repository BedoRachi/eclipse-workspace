package abstractEx;

public abstract class Computer { //�߻� Ŭ����

	abstract public void display(); // �߻�޼ҵ� (����O/����X)
	public abstract void typing(); // �߻�޼ҵ� (����O/����X)
	public void turnOn() {// �Ϲݸ޼ҵ�(����O/����O)
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {// �Ϲݸ޼ҵ�(����O/����O)
		System.out.println("������ ���ϴ�.");
	}
}
