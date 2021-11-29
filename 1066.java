 
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=0,h;
		int num=0,nu=0,g=0,f=0;
		   Scanner sc =new Scanner(System.in);
			  for(int i=0; i<5; ++i)
			  {
				  a = sc.nextInt();
				  if(a>0) {
					  num++;
					 
				  }
				  if(a<0) {
					  nu++;
					 
				  }
				  if(a%2==0) {
					 g++;
				  }
				  else if(a%2!=0) {
					  f++;
				  }
					 
			  }
			  
			  System.out.printf("%d valor(es) par(es)\n",g);
			  System.out.printf("%d valor(es) impar(es)\n", f);
			  System.out.printf("%d valor(es) positivo(s)\n", num);
			  System.out.printf("%d valor(es) negativo(s)\n", nu);
		
}
}
