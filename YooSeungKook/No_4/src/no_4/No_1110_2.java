package no_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_1110_2 {
	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		String str = "";
		
		int count = 0; 
		int m = n;
		
		
		while(true) {

		int	a = n / 10;
		int	b = n % 10;

			if( a + b < 10) {

				n = a + b;

			str= b + "" + n; 

			n = Integer.parseInt(str);	
			
			}else{
				
				n = a + b;
				
				n %= 10;
				
			str= b + "" + n; 
				
			n = Integer.parseInt(str);	
				
			}
				count++;
			if(n == m) {
				
				bw.write(count+"");
				
				break;
			}


		}//while
			br.close();
			bw.close();

	}//main
}
