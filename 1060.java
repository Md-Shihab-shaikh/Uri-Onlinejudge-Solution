import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double X;
		int totalPositive = 0;
		Scanner input =new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			X = input.nextDouble();
			if (X > 0) {
				totalPositive += 1;
			}
		}
		System.out.print(totalPositive+" valores positivos\n");
	}

}
