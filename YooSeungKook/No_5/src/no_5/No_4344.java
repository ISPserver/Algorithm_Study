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
		
		//����̻��� �Ǵ� �л����� ����... �Ҽ��� 3��° �ڸ����� �ݿø�..
		//�� ���̽� ���� ����� �Ѵ� ���̵��� ���� ���ϰ�,
		// ����� �Ѵ� �л� �� * 100 / ��ü �л� �� => ����� �Ѵ� ���̵��� ����...
		
		//1. �� ���̽� ���� ���̵��� ��� ���ϱ�!
		//2. �� ���̽� ���� ����� �Ѵ� ���̵��� ��!
		//3. ����� �Ѵ� ���̵��� ��� ���� ���ϱ�!
		
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
