package codePlus3936;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class N9095 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] dp = new int[11];		
		dp[1] =1; dp[2]=2; dp[3]=4;
		
		for(int i=4; i<dp.length; i++) {
			dp[i] = dp[i-3]+ dp[i-2] + dp[i-1];			
		}
		
		for(int i=0; i<T; i++) {			
			System.out.println(dp[Integer.parseInt(br.readLine())]);
		}
	}
}
// f(1)= 1 / f(2)= 1+1, 2 / f(3) = 1+1+1, 1+2, 2+1, 3 / f(4) = 1+1+1+1, 1+2+1, 1+1+2, 2+1+1, 2+2,3+1,1+3
//	1			2					4						7
//dp[n] = dp[n-1]+dp[n-2]+dp[n-3] 점화식 이용

/* 정수 N을 1,2,3의 합으로 나타내는 방법
 * 그 방법을 count해서 출력;
 * 첫째줄에 테스트 케이스 개수 T가 입력
 * 각 입력 숫자 N을 입력받으며 N은 양수이며 11보다 작음.
 * */
 