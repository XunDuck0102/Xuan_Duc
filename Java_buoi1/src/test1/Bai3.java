package test1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Nhap n : ");
		int n;
		int S=0;
		n = sc.nextInt();
		int i;
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				S+=i;
			}
		}
		System.out.println("Tong uoc n = " + S);
		
	}

}
