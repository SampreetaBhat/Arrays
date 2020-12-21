import java.util.*;
public class Merge_Zigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<m;i++) {
			b[i]=s.nextInt();
			
		}
		int c[]=new int[a.length+b.length];
		int i=0,j=0;
		while(i<a.length&&i<b.length) {
			c[j++]=a[i];
			c[j++]=b[i++];
			
		}
		while(i<b.length) {
			c[j++]=b[i++];
		}
		while(i<a.length) {
			c[j++]=a[i++];
		}
		for(int x=0;x<c.length;x++) {
				System.out.print(c[x]+",");
				
		}
		
s.close();
	}

}
