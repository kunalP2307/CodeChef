import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class BucketID {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0;
		int digit;
		int temp = n;
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(n > 0) {
			n = n/10;
			count++;		
		}
		
		while(temp > 0) {
			
			digit = temp%10;
			list.add(digit);
			temp = temp/10;
			count--;
		
		}
		
		Collections.sort(list);
		
		String asc = "";
		String desc = "";
		
		for(int i=0; i<list.size(); i++) {
			asc = asc + list.get(i).toString();
		}
		
		
		for(int i=(list.size()-1); i>=0; i--) {
			desc = desc + list.get(i).toString();
		}
		
		System.out.println("Bucket Id is :"+(Integer.parseInt(asc)+Integer.parseInt(desc)));
		
	}

}
