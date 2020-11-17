package study1118.stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(buffr.readLine());
		
		for(int i=n; i>0; i--) {
			buffw.write(i+"\n");
		}
		buffw.flush();
		buffw.close();
	}
}
