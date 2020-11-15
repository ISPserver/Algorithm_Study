package tjdals.backJun;
import java.util.Scanner;

public class N1110 {
	public static void main(String[] args) {
		int N=0;
		int check_N=0;
		int n1=0;
		int n2=0;
		int sum=0;
		int length=0;
		String zero="";
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		check_N = N;
		
		while(0<=N && N<100) {
			if(N<10) {
				zero = Integer.toString(N);
				zero = "0"+ zero;
				N = Integer.parseInt(zero);
			}
			n1 = N/10;
			n2 = N%10;
			sum = n1+n2;
			if(sum >= 10) {
				sum = sum%10;
			}
			N= (n2*10)+sum;
			length++;
			if(N==check_N) break;
		}
		System.out.println(length);
	}	
}



//1)숫자입력
//2)자릿수 값 나누기
//3)나눈 자리수의 값 더하기 = 결과
//4)종료조건 = 결과값이 맨처음 값이랑 같은지