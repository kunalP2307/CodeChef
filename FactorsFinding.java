
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FactorsFinding {
	public static void main(String argp[]) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		int n = sc.nextInt();
		
		for(int i=2; i<=n/2; i++) 
			if(n%i == 0)
				list.add(i);
		
		System.out.println(list.size()+2+" ");
		
		
		System.out.print("1"+" ");
		
		
		for(int i:list) 
			System.out.print(i+" ");
		
		System.out.println(n);
		
		
	}

}
