import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		float a,b,c,p;
		
		Scanner Sc =new Scanner(System.in);
		n=Sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			a=Sc.nextFloat();
			b=Sc.nextFloat(); 
			c=Sc.nextFloat(); 
		
			p=((a*2)+(b*3)+(c*5))/10;
			 System.out.printf("%.1f\n", p);
		}
				
	}

}
