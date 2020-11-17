//�ּ� ����� = �ִ� ����� * (a / �ִ� �����) * (b / �ִ� �����)
	//A�� B�� ���� �������� C�� ��, (A�� B�� �ִ� �����) = (B�� C�� �ִ� �����)
	
	//��Ŭ���� ȣ����
	//�ִ�����
	//���⼭ ����� ������ ū �� A�� ������ B�� ���������� ������ �������ٸ� �ִ������� B�� �ȴ�.
	//1) �Է� ���� �� ���� ū ���� A, �������� B�� ���Ѵ�.
	//2) A �� B �� �������� �������� R�� ��Ī�Ѵ�
	//3) R �� 0�̶�� A�� B�� ������ ���� ������ �ִ� ������� B�� �ȴ�.
	//4) ���� R�� 0�� �ƴ϶�� A���� B��, B ���� R�� �����ѵ� 3�� ������ �ݺ��Ѵ�. 
	
	//�ּҰ���� 
	//1) �� ���� �ִ� ������� ��Ŭ���� ȣ������ ���Ͽ� ���Ѵ�.
	//2) �� �� A, B�� ���ѵ� �ִ� ������� ���� ���� �ּ� ������� ����Ѵ�.
package study1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test02 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int d=gcd(a,b);
		int e=lcm(a,b);
		
		System.out.println(d);
		System.out.println(e);
	}
	
	// �ִ����� (Greatest Common Divisor)
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r= a % b;
			a = b;
			b = r;
		}
		return a;
	}
	// �ּҰ���� (Least Common Multiple)
	public static int lcm(int a, int b) {
		return a*b /gcd(a,b);
	}
}
