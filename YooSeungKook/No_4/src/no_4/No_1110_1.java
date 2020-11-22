package no_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_1110_1 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int cnt = 0;
		int copy = n;

		while (true) {
			
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			cnt++;

			if (copy == n) {
				break;
			}
		}
		bw.write(cnt+"");

		br.close();
		bw.close();
	}//main
}
