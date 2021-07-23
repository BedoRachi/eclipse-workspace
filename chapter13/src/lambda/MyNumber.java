package lambda;

@FunctionalInterface // Lambda interface임을 표시+검사
public interface MyNumber {
	int getMax(int num1, int num2); //2개 이상의 Method를 넣을 수 없다(Lambda interface = Anonymouse Method 이기 때문이다.)
}
