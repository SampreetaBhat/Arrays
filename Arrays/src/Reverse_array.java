import java.util.*;
public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int temp=0;
		 for(int i=0;i<a.length-3;i++) {
			 temp=a[i];
			 a[i]=a[a.length-1-i];
			 a[a.length-1-i]=temp;
		 }
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ");
		 }
		 s.close();

	}

}
