package study1118.stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int i = Integer.parseInt(buffr.readLine());
		for (int j = 1; j < i+1; j++) {
			buffw.write(j+"\n");
		}
		buffw.flush();
		buffw.close();
	}
}
