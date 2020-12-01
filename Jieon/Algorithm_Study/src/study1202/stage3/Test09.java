package study1202.stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Test09 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n=Integer.parseInt(buffr.readLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				buffw.write("*");				
			}
			buffw.newLine();
		}
		buffw.flush();
		buffw.close();
	}
}
