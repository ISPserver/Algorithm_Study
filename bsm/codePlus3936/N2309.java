package codePlus3936;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N2309 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int[] N = new int[9];		
		int sum=0;
		
		for(int i=0; i<N.length; i++) { //배열 요소 입력
			N[i] = Integer.parseInt(br.readLine());
			sum += N[i];
		}
	
		Arrays.sort(N); //배열 오름차순 정렬
		boolean check =false;
		for(int i=0; i<N.length; i++) { //기준 판별
			if(check) break;
			for(int j=i+1; j<N.length; j++) {
				if(i==j) continue;
				if((sum-(N[i]+N[j]))==100) {
					N[i]=-1; N[j]=-1;
					check=true;
					break;
				}
			}
		}
		
		for(int i=0; i<N.length; i++) { //출력
			if(N[i] != -1) { 
				System.out.println(N[i]);
			}
		}		
		br.close();
	}
}

/*
 * 1. 버퍼드리더로 9개 줄 숫자 입력받음
 * 2. 예외조건 없음(일곱난쟁이를 찾을 수 없는 경우는 없다)
 * 3. 각 줄의 숫자는 100을 넘지않는 자연수, 키는 모두 다름* 
 * 4. 9개 중 7개 숫자 합이 100이면
 * 5. 7개의 숫자를 오름차순으로 출력
 *    ★ 9개 숫자합 더해서 [i]+[j]번을 뺐을때 100이 되면 i,j번째 뺀 나머지 출력 
 */
 