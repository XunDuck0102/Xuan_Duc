package test1;

import java.util.Scanner;

public class duc {
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		int ngay,nam,thang;
		do {
			System.out.println("Nhap ngay : ");
			ngay = sc.nextInt();
			System.out.println("Nhap thang : ");
			thang = sc.nextInt();
			System.out.println("Nhap nam : ");
			nam = sc.nextInt();
		}while((ngay<=0||ngay>31)||nam<1||(thang<1||thang>12));
		if((ngay>=20&&thang==1)||(ngay<=18&&thang==2)) {
			System.out.println("Ban thuoc cung Bao Binh");
		}else if((ngay>=19&&thang==2)||(ngay<=20&&thang==3)) {
			System.out.println("Ban thuoc cung Song Ngu");
		}else if((ngay>=21&&thang==3)||(ngay<=20&&thang==4)) {
			System.out.println("Ban thuoc cung Bach Duong");
		}else if((ngay>=21&&thang==4)||(ngay<=20&&thang==5)) {
			System.out.println("Ban thuoc cung Kim Nguu");
		}else if((ngay>=21&&thang==5)||(ngay<=21&&thang==6)) {
			System.out.println("Ban thuoc cung Song Tu");
		}else if((ngay>=22&&thang==6)||(ngay<=22&&thang==7)) {
			System.out.println("Ban thuoc cung Cu Giai");
		}else if((ngay>=23&&thang==7)||(ngay<=22&&thang==8)) {
			System.out.println("Ban thuoc cung Su Tu");
		}else if((ngay>=23&&thang==8)||(ngay<=22&&thang==9)) {
			System.out.println("Ban thuoc cung Xu Nu");
		}else if((ngay>=23&&thang==9)||(ngay<=23&&thang==10)) {
			System.out.println("Ban thuoc cung Thien Binh");
		}else if((ngay>=24&&thang==10)||(ngay<=22&&thang==11)) {
			System.out.println("Ban thuoc cung Bo Cap");
		}else if((ngay>=23&&thang==11)||(ngay<=21&&thang==12)) {
			System.out.println("Ban thuoc cung Nhan Ma");
		}else {
			System.out.println("Ban thuoc cung Ma Ket ");
		}
		
	}

}
