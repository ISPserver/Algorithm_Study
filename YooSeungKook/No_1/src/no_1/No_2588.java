package no_1;
import java.util.Scanner;

public class No_2588 {
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		int su1 = sc.nextInt(); 
		int su2 = sc.nextInt();

		sc.close();

		System.out.println(su1*(su2%10));
		System.out.println(su1*((su2/10)%10));
		System.out.println(su1*(su2/100));
		System.out.println(su1*su2);
    }
}