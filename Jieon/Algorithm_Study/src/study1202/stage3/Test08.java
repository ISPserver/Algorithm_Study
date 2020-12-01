package study1202.stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test08 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(buffr.readLine());
		int A;
		int B;
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(buffr.readLine());
			A=Integer.parseInt(st.nextToken());
			B=Integer.parseInt(st.nextToken());
			buffw.write("Case #"+i+": "+A+" + "+B+" = "+(A+B)+"\n");
		}
		buffw.flush();
		buffw.close();
	}
}
