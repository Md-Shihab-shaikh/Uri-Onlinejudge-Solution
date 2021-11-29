import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner Sc =new Scanner(System.in);
		n=Sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%2!=0) {
			System.out.println(i);
		}
		}
				
	}		

}
