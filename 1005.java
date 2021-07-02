package uri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double a,b,c,d;
		 Scanner sc=new Scanner(System.in);
		 a=sc.nextDouble();
		 b=sc.nextDouble();
		 c=a*3.5+b*7.5;
		 d=c/(3.5+7.5);
	        System.out.printf("MEDIA = %.4f\n", d);

	}

}
