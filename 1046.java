import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

		 int a,b,time;
		   Scanner Sc = new Scanner(System.in);
		   a=Sc.nextInt();
		   b=Sc.nextInt();

		    if(a<b)
			{
		        time=b-a;
			}
		    else
			{
		        time=b+24-a;
			}
		    
		    System.out.println("O JOGO DUROU "+ time +" HORA(S)");
		    	        	        	             	     	        
	    }
	}
