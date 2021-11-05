 
import java.util.Scanner;
import static java.lang.Math.round;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double n = sc.nextDouble();
       System.out.println("NOTAS:");
       double note;
        if(n > 0 && n < 1000000){
            int values[] = {100,50,20,10,5,2};
            double[] coin = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};

           
            for (int i = 0; i < values.length; i++) {
                System.out.println((int)(n/ values[i])+" nota(s) de R$ "+values[i]+".00");
                n = n % values[i];
            }
           
        System.out.println("MOEDAS:");
        for (int i = 0; i < coin.length-1; i++) {
        	note =  (n / coin[i]);
            System.out.println((int)note + " moeda(s) de R$ "+String.format("%.2f",coin[i]));
            n = (double)(n % coin[i]);
        }
        note = (double) (n / coin[coin.length-1]);
        System.out.println(round(note) + " moeda(s) de R$ "+String.format("%.2f",coin[coin.length-1]));
    
        
        }
        
    }

}
