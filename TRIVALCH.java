import java.util.Scanner;

public class TRIVALCH {
	
	public static void main(String Args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
	
		if(side1+side2 > side3 && side2+side3 > side1 && side1+side3 > side2)
			System.out.println("YES");
		else
			System.out.print("NO");
	}

}
