package interfaceex;

public interface Calc {
//����� �߻�޼ҵ��� ���� = Interface
	double PI = 3.14; // public static final�� ������
	int ERROR = -9999999;
	
	int add(int num1, int num2); //public abstract�� ������
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
