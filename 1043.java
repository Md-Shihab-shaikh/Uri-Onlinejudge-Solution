import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 float a , b , c , t;
	        a = sc.nextFloat();
	        b = sc.nextFloat();
	        c = sc.nextFloat();
	   
	        if((a+b)>c && (b+c)>a && (a+c)>b)
	        {
	        	t=a+b+c;
	        	//
	        	System.out.println("Perimetro = "+t);
	        }
	        else
	        {
	        	t=((a+b)*c)/2;
	        	System.out.println("Area = "+t);
	        }
	        	       	        	        	        
	        	     	        
	    }
	}
