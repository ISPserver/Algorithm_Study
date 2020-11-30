package work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class No_4344_1 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int[] student = new int[n];

		int[] score = null;
		int total = 0;
		int count = 0;
		float avg_total = 0;
		float avg = 0;
		
		for(int i = 0; i < student.length; i++) {
			
			count = 0;
			total = 0;
			StringTokenizer str = new StringTokenizer(br.readLine()," ");
			
			student[i] = Integer.parseInt(str.nextToken());
			score = new int[student[i]];
			
			for(int j = 0; j < student[i]; j++) {
				
				score[j] = Integer.parseInt(str.nextToken());
				total+=score[j];
			}//inner1
			
			avg_total = (float)total/student[i];
			
			for(int j = 0; j < student[i]; j++) {
				
				if(avg_total < score[j]) {
					count++;
				}
			}//inner2
			
			//System.out.println(count);
			avg = count * 100 / (float)student[i];
			bw.write(String.format("%.3f",avg)+"%\n");
		}//out

		br.close();
		bw.close();
	}//main
}
