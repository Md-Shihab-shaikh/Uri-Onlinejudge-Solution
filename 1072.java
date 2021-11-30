import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,p;
		int in=0,out=0;
		Scanner Sc =new Scanner(System.in);
		p=Sc.nextInt();
		
		for(int i=0; i<p; i++) {
			n=Sc.nextInt();
            if(10<=n && n<=20 )         
            	in++;            
            else 
            	out++;
		}
		System.out.println(in+" in");
		System.out.println(out+" out");
				
	}		

}
