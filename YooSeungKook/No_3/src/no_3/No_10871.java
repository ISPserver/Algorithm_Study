package no_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No_10871 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");

		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());

		
		token = new StringTokenizer(br.readLine(), " ");

		for(int i = 0; i < a; i++) {
			
			 int n = Integer.parseInt(token.nextToken());

			if(b > n) {			
				bw.write(n +" ");
			}
		}

		bw.close();
		br.close();
	}//main
}
