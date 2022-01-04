import java.util.Scanner;

public class FINDMELI {
	
	public static void main(String Args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int key = sc.nextInt();
		
		int[] array = new int[n];
		
		for(int i=0; i<n; i++) 
			array[i] = sc.nextInt();
		
		boolean found = false;
		
		
		for(int i=0; i<n; i++)
			if(array[i] == key) 
				found = true;
				
		if(found)
			System.out.println(1);
		
		else
			System.out.println(-1);
		
	
	}

}
