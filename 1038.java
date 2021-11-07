import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p = 0;
		Scanner Sc =new Scanner(System.in);
		int x=Sc.nextInt();
		int y=Sc.nextInt();


		 if(x==1){
		     p=4.00*y;
		 }else if(x==2){
		     p=4.50*y;
		 }
		 else if(x==3){
		     p=5.00*y;
		 }
		 else if(x==4){
		     p=2.00*y;
		 }
		 else if(x==5){
		     p=1.50*y;
		 }
		 System.out.printf("Total: R$ %.2f\n",p);
		 
		
	}

}
