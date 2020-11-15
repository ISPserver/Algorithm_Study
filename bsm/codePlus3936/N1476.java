package codePlus3936;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1476 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());								
		
		int[] N = new int[3];
		N[0] = Integer.parseInt(st.nextToken());
		N[1] = Integer.parseInt(st.nextToken());
		N[2] = Integer.parseInt(st.nextToken());
		
		
		int cnt=1;
		int E = 1;
		int S = 1;
		int M = 1;
		boolean d = true;
		while(d) {
			if( N[0]==E && N[1]==S && N[2]==M ) {
				d = false; 
				
			}else {
				cnt++; E++; S++; M++;
				if(E==16) E=1;
				if(S==29) S=1;
				if(M==20) M=1;	
			}
		}
		
		System.out.println(cnt);
		br.close();
	}
}

//E ( 1<= E <=15) ,,, ( 1<= S <=28) ,,, (1<= M <=19)
// ex) 16 16 16 => 16년
//while문 돌리면서 cnt 증가
//입력과 같은 숫자가 됬을때 break 후, count 출력