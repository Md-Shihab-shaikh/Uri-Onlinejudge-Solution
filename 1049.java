import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input = new Scanner (System.in);
	    String v1,v2,v3;
       
        v1 = input.nextLine();
        v2 = input.nextLine();
        v3 = input.nextLine();
		  
        if(v1.equalsIgnoreCase("vertebrado")){
            if(v2.equalsIgnoreCase("ave")){
                if(v3.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                }else if(v3.equalsIgnoreCase("onivoro")){
                    System.out.println("pomba");
                }
            }else if(v2.equalsIgnoreCase("mamifero")){
                if(v3.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                }else if(v3.equalsIgnoreCase("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }else if(v1.equalsIgnoreCase("invertebrado")){
            if(v2.equalsIgnoreCase("inseto")){
                if(v3.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                }else if(v3.equalsIgnoreCase("herbivoro")){
                    System.out.println("lagarta");
                }
            }else if(v2.equalsIgnoreCase("anelideo")){
                if(v3.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                }else if(v3.equalsIgnoreCase("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
  }
}
