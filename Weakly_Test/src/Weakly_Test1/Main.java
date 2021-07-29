package Weakly_Test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A=0, B=0;
        int T = Integer.parseInt(br.readLine());
        for(int i=1; i<=T ;i++ ){
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write("Case #" + i +": " + A +" + "+B+" = "+(A+B)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}