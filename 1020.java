import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	int year = 365,mon=30,day=1,y,t,i;
    	
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
               
        System.out.println((y/year)+" ano(s)");
        System.out.println((y%year)/30+" mes(es)");
        
        System.out.println((y%year)%30+" dia(s)");
        	                     
    }
}
