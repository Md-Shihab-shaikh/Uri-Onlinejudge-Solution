import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int n;
	     int count = 0, i;
	     Scanner sc = new Scanner(System.in);
	    
	     for (i = 0; i < 5; ++i)
	     {
	      n = sc.nextInt();
	    	  if(n%2==0) {
	    		  count++;
	    	  }
	     }
	     System.out.printf(count+" valores pares\n");
	
	}
		

}
