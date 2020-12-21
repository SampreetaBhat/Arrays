import java.util.*;
public class Count_evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int even_count=0,odd_count=0;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			if(a[i]%2==0) {
				even_count+=1;
			}
			else
				odd_count+=1;
		}
		System.out.println("even numbers are"+even_count+" "+"odd numbers are"+odd_count);
		s.close();
		

	}

}

