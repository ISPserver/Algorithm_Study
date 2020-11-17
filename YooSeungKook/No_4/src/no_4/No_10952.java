package no_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No_10952 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		while(true) {

			StringTokenizer token = new StringTokenizer(br.readLine(), " ");

			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());

			if(a == 0 || b == 0) {
				break;
			}			
			
			bw.write(a+b+"\n");
		}

		bw.close();
		br.close();

	}//main
}
