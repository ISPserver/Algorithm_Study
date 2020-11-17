package codePlus3936;
import java.util.*;
import java.io.*;

class Main {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int max = 0;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
     
    static int stoi(String s) {
        return Integer.parseInt(s);
    }
    
    public static void main(String[] args) {
       
    }
}


/* DFS문제 ( ㅜ 모양은 예외처리)
 * 첫째줄 세로N 가로M (4 <ㅡ N,M <ㅡ 500)
 * 입력은 1000을 넘지않는 자연수
 * 깊이우선탐색(DFS)특징: 자기 자신호출하는 순환 알고리즘형태,
 * 그래프 탐색의 경우 어떤 노드를 방문했었는지 여부를 반드시 검사 해야 한다는 것이다.
 */
 