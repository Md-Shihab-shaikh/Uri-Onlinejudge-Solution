import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 float n;
	     int count = 0, i;
	     float ave =0;
	     Scanner sc = new Scanner(System.in);
	    
	     for (i = 0; i < 6; ++i)
	     {
	      n = sc.nextFloat();
	      if(n > 0){
	       count++;
	       ave=ave+n;
	      }
	     }
	        
	     System.out.printf(count+" valores positivos\n");
	
	     System.out.printf("%.1f\n",ave/count);
	}
		
