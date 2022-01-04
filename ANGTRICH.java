
import java.util.Scanner;

public class ANGTRICH {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int angle1,angle2,angle3;
		
		angle1 = sc.nextInt();
		angle2 = sc.nextInt();
		angle3 = sc.nextInt();
		
		if( angle1 >= 180 || angle1 <=0 || angle2>=180 || angle2 <=0 || angle3 >=180 || angle3 <= 0)
			System.out.println("NO");
		
		else if( angle1+angle2+angle3 == 180)
			System.out.print("YES");
		else
			System.out.print("NO");
		
	}

}
