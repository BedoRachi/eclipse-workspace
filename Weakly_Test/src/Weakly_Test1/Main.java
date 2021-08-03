package Weakly_Test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int C = Integer.parseInt(br.readLine());
    	String[] score = null;
    	for(int i=0;i<C;i++) {
    		int total=0;
    		float avg =0f, percentAVG=0f;
    		score = br.readLine().split(" ");
    		int N = Integer.parseInt(score[0]);
    		for(int j=1;j<=N;j++) {
    			total+=Integer.parseInt(score[j]);
    		}
    		avg=(float)(total/N);
    		for(int j=1;j<=N;j++) {
    			if(Integer.parseInt(score[j]) > avg) {
    				percentAVG++;
    			}
    		}
    		float totalAVG = (percentAVG/N)*100.0f;
    		bw.write(String.format("%.3f",totalAVG) +"%\n");
    	}
    	bw.flush();
    	bw.close();
    	br.close();
    }
}