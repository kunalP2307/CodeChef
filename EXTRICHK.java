import java.util.Scanner;

public class EXTRICHK {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
	
		if(!(side1+side2 > side3 && side2+side3 > side1 && side1+side3 > side2))
			System.out.println("-1");
		
		else{
			if(side1 == side2 && side2 == side3)
				System.out.println("1");
			else if(side1 == side2 || side2 == side3 || side1 == side3)
				System.out.println("2");
			else
				System.out.println("3");
		}
		
	}

}
