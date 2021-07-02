package uri;

import java.util.Scanner;
public class Main {
	public static void main(String args[]){

		double r,h,t,y;
		 Scanner sc =new Scanner(System.in);
			  r = sc.nextDouble();
			  t=3.14159;
			  y=4/3.0;
			  h=y*t*(r*r*r);
			  
		System.out.printf("VOLUME = %.3f\n",h);
		
	}
}