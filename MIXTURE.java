import java.util.Scanner;

public class MIXTURE {
	public static void main(String Args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int array[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(array[i][0] > 0 && array[i][1] > 0)
				System.out.println("Solution");
			else if(array[i][1] == 0)
				System.out.println("Solid");
			else if(array[i][0] == 0)
				System.out.println("Liquid");
		}
		
		
	}

}
