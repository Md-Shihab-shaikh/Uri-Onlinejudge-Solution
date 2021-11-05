 import java.util.Scanner;
 
 public class Main {
    public static void main(String[] args) {
    	int hour,min,sec,y;
        Scanner sc = new Scanner(System.in);
        sec = sc.nextInt();
        
        hour=sec/3600;
        sec=sec-(hour*3600);
        min=sec/60;
        y=sec-(min*60);
        System.out.printf("%d:%d:%d\n",hour,min,y);         
        
    }
}
