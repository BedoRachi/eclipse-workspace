package interfaceex;

public interface Calc {
//상수와 추상메소드의 집합 = Interface
	double PI = 3.14; // public static final이 생략됨
	int ERROR = -9999999;
	
	int add(int num1, int num2); //public abstract이 생략됨
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
