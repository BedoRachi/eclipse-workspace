package Weakly_Test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count =0;
		int tmp=0;
		int total=0;
		while(true) {
			if(n<10) {
				tmp = n*10;
			}else {
				total=((tmp/10) + (tmp%10));
			}
			count++;
			if(total == n) {
				break;
			} else {
				tmp = (total%10)+((tmp%10)*10);
			}	
		}
		bw.write(count);
		bw.flush();

		
	}
}