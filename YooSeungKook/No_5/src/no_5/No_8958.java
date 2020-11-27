package work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class No_8958_2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		//ox를 나누려고 하지말고 문자열로 생각.. 즉, 굳이StringTokenizer으로 나누지 않아도 됨..
		//readline으로 한 줄의 문자열을 N만큼만 만들고 charAt(o)으로  0의 갯수를 파악.. 
		String str_ox = "";
		
		int check = 0;
		int count_n = 0;
		int result = 0;
		
		int[] count = new int[n];
		
		for(int i = 0 ; i < n; i++ ) {
			
			str_ox = str.nextToken();
			
		if(str_ox.equalsIgnoreCase("o")) {
				check = 1;
				count_n++;
				count[i]+=count_n;
		}else {
				check=0;
				count_n=0;
			}
		}
		
		for(int i = 0; i < n; i++) {
			
			bw.write(count[i] +"\n");
		}
		
		
		br.close();
		bw.close();
		
	}//main
}
