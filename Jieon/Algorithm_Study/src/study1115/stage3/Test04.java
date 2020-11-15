package study1115.stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test04 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(buffr.readLine());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(buffr.readLine()," ");
			int x = Integer.parseInt(st.nextToken())+1;
			buffw.write(x);
		}
		buffw.close();
	}
	
}
