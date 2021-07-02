package uri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int R;
		 float A,M,Y;
		 Scanner sc=new Scanner(System.in);
		 R=sc.nextInt();
		 A=sc.nextFloat();
		 M=sc.nextFloat();
		 
		 
		 Y=A*M;
	        
	     System.out.printf("NUMBER = %d\n",R);
	     System.out.printf("SALARY = U$ %.2f\n",Y);

	}
}