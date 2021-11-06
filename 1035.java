import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
		  int a, b, c, d;
		  Scanner Sc =new Scanner(System.in);
				  a=Sc.nextInt();
				  b=Sc.nextInt();
				  c=Sc.nextInt();
				  d=Sc.nextInt();
		  if((b > c) && (d > a) && (c + d > a + b) && c > 0 && (a % 2 == 0))
		      System.out.println("Valores aceitos");
		  else
			  System.out.println("Valores nao aceitos");
	}

}
