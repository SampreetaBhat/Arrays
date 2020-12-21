import java.util.*;
public class Sum_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]+a[j]==n) {
					System.out.println(a[i]+"+"+a[j]);
				}
				else {
					System.out.println("no pairs");
				}
			}
			s.close();
		}
		

	}

}
