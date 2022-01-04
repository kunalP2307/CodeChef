import java.util.Scanner;

public class RNGEODD {
	
	public static void main(String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rightLimit = sc.nextInt();
		int leftLimit = sc.nextInt();
		
		if( (rightLimit % 2) == 0) 
			rightLimit++;
		
		for(int i=rightLimit ; i<=leftLimit; i+=2) {
			System.out.print(i+" ");
		}
			
	}

}
