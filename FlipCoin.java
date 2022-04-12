import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();   // number of times to flip coin
		int tails = 0;
		int heads = 0;
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Flipping coin.....");
			int flipCoin = rand.nextInt(2);
				if(flipCoin == 0) {
					System.out.println("tails");
					tails++;
				} else {
					System.out.println("heads");
					heads++;
				}
		}
		
		double percentTails = (tails/n) * 100;
		double percentHeads = (heads/n) * 100;
		
		System.out.println("percentage of Heads is : "  + percentHeads);
		System.out.println("percentage of Tails is : "  + percentTails);

	}
}
