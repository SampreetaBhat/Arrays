import java.util.*;
public class Merge_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[6];
		for(int i=0;i<5;i++) {
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<6;i++) {
			b[i]=s.nextInt();
			
		}
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++)
           System.out.print(c[i]+" ");
		s.close();
		

	}

}
