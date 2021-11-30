import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,count=0,max=0,i,j=0;
		Scanner Sc=new Scanner(System.in);
		
		for(i=0; i<100; i++)
		{
			n=Sc.nextInt();
			count++;
			if(n>max)
			{
				max=n;
				j=count;
			}
		}
		System.out.println(max);
		System.out.println(j);
				
	}

}
