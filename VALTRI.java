import java.util.Scanner;

public class VALTRI {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int busNo = sc.nextInt();
		
		if(busNo % 5 == 0 || busNo % 6 == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
