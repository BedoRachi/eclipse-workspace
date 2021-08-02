package Weakly_Test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] numArray = {0,0,0,0,0,0,0,0,0,0}; 
		int total = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		while(total > 0) {
			numArray[total%10] +=1; 
			total/=10;
		}
		for(int i = 0; i< numArray.length; i++) {
			bw.write(numArray[i] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
}