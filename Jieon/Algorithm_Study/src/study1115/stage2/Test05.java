package study1115.stage2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); 
		int M = sc.nextInt();
		
		//10½Ã 10ºÐ     --> 60-(45-10)   
		if(M<45) {
			H--;
			M = 60-(45-M);
			if(H<0) {
				H=23;
			}
			System.out.println(H+" "+M);
		} else {System.out.println(H+" "+(M-45));}
	}
}
