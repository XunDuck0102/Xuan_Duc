package test1;

import java.util.Scanner;

public class Duck {
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		int a,b,c;
		do {
			System.out.println("Nhap a : ");
			a = sc.nextInt();
			System.out.println("Nhap b : ");
			b = sc.nextInt();
			System.out.println("Nhap c : ");
			c = sc.nextInt();
		}while(a<=0||b<=0||c<=0);
		if((a+b>c)&&(b+c>a)&&(a+c>b)) {
			System.out.println("3 canh "+a+","+b+","+c+" co the lap thanh 1 tam giac");
			if((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==a*a+b*b)) {
				if((a==b)||(a==c)||(b==c)) {
					System.out.println("Tam giac vuong can");
				}else {
					System.out.println("Tam giac vuong");
				}
			}else if((a==b)||(b==c)||(a==c)) {
				System.out.println("Tam giac can");
			}else if((a==b)&&(b==c)) {
				System.out.println("Tam giac deu");
			}
		}else {
			System.out.println("3 canh "+a+","+b+","+c+" khong  the lap thanh 1 tam giac");
		}
	}

}
