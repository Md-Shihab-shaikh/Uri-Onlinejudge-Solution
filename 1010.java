package uri;

import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		 int r,s,g, p,q;
		 float h,t,d,o,l;
			
		 Scanner sc =new Scanner(System.in);
			  r = sc.nextInt();
		      s = sc.nextInt();
		      t= sc.nextFloat();
		      p = sc.nextInt();	
		      q= sc.nextInt();
		      o = sc.nextFloat();	
		d=s*t;
		l=q*o;
		
		 h=d+l;
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",h);
		
	}
}