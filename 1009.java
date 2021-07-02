package uri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String A;
		 double B,C,D;
		 Scanner sc=new Scanner(System.in);
		 A=sc.next();
		 B=sc.nextDouble();
		 C=sc.nextDouble();
		 
		 D=B+C*.15;
	   
	     System.out.printf("TOTAL = R$ %.2f\n",D);

	}
}
