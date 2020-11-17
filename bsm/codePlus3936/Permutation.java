package codePlus3936;

import java.util.Scanner;

public class Permutation {
	//main 함수
	public static void main(String[] args) {
		int arr[] = {1,2,3};// 순열 배열
		int n = arr.length; //배열 길이
		int[] result = new int[n];//출력 배열
		boolean[] visited = new boolean[n];//방문 체크리스트 배열
		
		permutation(arr,result,visited,0,n,n);
	}
	
	//순열 출력 함수
	private static void permutation(int[] arr, int[] result, boolean[] visited, int depth, int n, int r) {
		if(depth == r) {
			print(result, r);
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(visited[i] != true) {
				visited[i] = true;
				result[depth] = arr[i];
				permutation(arr,result, visited, depth+1, n, r); //재귀 함수 but, depth+1 시켜서 
				visited[i]= false;
			}
		}
	}
	
	//print 함수
	public static void print(int[] arr, int r) {
		for(int i=0; i<r; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	
}

/* 
//전체순열 알고리즘
 * 1.입력받은 순열  2. 결과를 출력할 순열  3.방문체크리스트 배열   4.DEPTH(깊이LV)   5.전체n개   6.n개중에 몇개를 뽑을지 정하는 r
 * 대표적인 DFS 방법(체크리스트를 통해 백트래킹까지 가능하다 봄)
 * function에서의 조건
 * DFS는 반드시 종료조건이 있어야 하기 때문에 if문 선언( depth가 r과 같을때 결과 출력하는 배열을 출력 ) 
 * for문을 돌면서 visited가 true가 아니라면 지나가지 않은 인덱스로 판단 후, true로 초기화 , 결과출력베열[i]에 입력받은 배열[i]를 넣어 초기화 시켜줌
 * 재귀함수를 사용 -> 나머진 그대로 depth만 +1 를 증가 시켜준다.
 * 그리고 제귀함수 뒤에 true된 visited를 전부 false로 초기화 시켜주어야 한다.
 * 배열을 출력하는 문제는 print 함수를 따로 선언해주는게 편하다.
 */
