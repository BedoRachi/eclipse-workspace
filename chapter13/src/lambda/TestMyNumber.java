package lambda;

public class TestMyNumber{
	public static void main(String[] args) {
		MyNumber max = (x,y) -> (x>=y) ? x : y; //Lambda Interface Override
		//(매개변수) -> {실행문;};
		//@Override
		// getMax(int x, int y){
		//  if(x>=y) {
		//    x
		//  } else {
		//  y
		//  
		System.out.println(max.getMax(10, 20)); //Lmabda Interface 실행
	}
}
