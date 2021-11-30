import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,p;
		Scanner Sc =new Scanner(System.in);
		n=Sc.nextInt();
		
		for(int i=0; i<n; i++) {
			p=Sc.nextInt();
		
			 if(p==0)
			System.out.println("NULL");
					
			
			
			 else if(p % 2 == 0){
				   if(p > 0){
				    System.out.println("EVEN POSITIVE");
				   }else{
				    System.out.println("EVEN NEGATIVE");
				   }

				  }else{
				   if(p > 0){
				    System.out.println("ODD POSITIVE");
				   }else{
				   System.out.println("ODD NEGATIVE");
				   }
				  }
				
	}		
		
		
	}

}
