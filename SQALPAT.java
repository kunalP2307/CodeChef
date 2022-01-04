import java.util.Scanner;

public class SQALPAT {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++) {
				if(i%2 == 0) {
					System.out.print(5*i+(j+1)+" ");
				}
				else {
					System.out.print(5*i +(5-j)+" ");
				}
			}
			System.out.println();
		}		
	}
}
