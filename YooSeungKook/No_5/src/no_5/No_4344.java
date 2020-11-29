package no_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No_4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		int[] test_case = new int[n];
		
		int[] score;
		float[] avg = null;
		int student = 0;
		int total = 0;
		
		//평균이상이 되는 학생들의 비율... 소수점 3번째 자리까지 반올림..
		//각 케이스 별로 평균이 넘는 아이들의 수를 구하고,
		// 평균이 넘는 학생 수 * 100 / 전체 학생 수 => 평균이 넘는 아이들의 비율...
		
		//1. 각 케이스 별로 아이들의 평균 구하기!
		//2. 각 케이스 별로 평균을 넘는 아이들의 수!
		//3. 평균을 넘는 아이들의 평균 비율 구하기!
		
		for(int i = 0; i < test_case.length; i++) {

			StringTokenizer str = new StringTokenizer(br.readLine()," ");
			
			student = Integer.parseInt(str.nextToken());
			
			score = new int[student];

			for(int j = 0; j < score.length; j++) {
				
				score[j] = Integer.parseInt(str.nextToken()); 
				 total+=score[j];
				 System.out.println(score[j]);
				 System.out.println(total);			
			}
			
			avg[i] = Float.parseFloat((float)total/student+"%\n");
			
			if(avg[i] > score[i]) {
				
			}
		
		}
	
		bw.close();
		br.close();
		
	}//main
}
