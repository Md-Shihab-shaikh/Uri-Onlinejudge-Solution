package uri_online;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int a, b, s;
		   int Max;
		   Scanner sc =new Scanner(System.in);
			  a = sc.nextInt();
			  b = sc.nextInt();
			  s = sc.nextInt();
			  
			    Max = a;
			    if(Max < b)
			        Max = b;
			    if(Max < s)
			        Max = s;

			System.out.println(Max+" eh o maior");

		
	}

}

