import java.util.Scanner;

public class SUMEVOD {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long oddSum = 0;
		long evenSum = 0;
		
		for(int i=1; i<=n*2; i++) {
			if(i%2 == 0)
				evenSum += i;
			else 
				oddSum += i;
		}
		
		System.out.println(oddSum+" "+evenSum);
			
		
	}

}
