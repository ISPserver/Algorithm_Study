package study1115.stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test00 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String a = buffr.readLine();
			buffw.write(String.valueOf(a));

		} catch (IOException e) {
			e.printStackTrace();
		}
		buffr.close();
		buffw.close();
	}
}
