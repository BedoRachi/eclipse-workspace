package chapter6;

class PlayingCard{
	int kind, num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n){
		kind = k;
		num = n;
	}
}
public class Exercise6_9 {
	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1,1);
	}
}
