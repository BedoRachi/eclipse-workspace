package Weakly_Test1;


public class Main{
    public static void main(String[] args) {
		boolean[] selfNum = new boolean[10001];
    	for(int i=1; i<10000; i++) {
    		if(10000>selfCount(i)) {
    			selfNum[selfCount(i)] = true;
    		}
    	}
    	for(int i=1; i<10000;i++) {
    		if(selfNum[i]==false) {
    			System.out.println(i);
    		}
    	}

    }
    
    static int selfCount(int n) {
    	int num = n;
    	int sum = n;
    	while(num !=0) {
    		sum+=(num%10);
    		num/=10;
    	}
    	return sum;
    }
}