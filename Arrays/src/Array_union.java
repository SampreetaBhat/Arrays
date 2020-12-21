import java.util.*;
public class Array_union {

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
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		int k=a.length;
		for (int i = 0; i < b.length; i++)
		{
		boolean rs=true;
		for (int j = 0; j < b.length; j++)
		{
		if(b[i]==a[j])
		{
		rs=false;
		break;
		}
		}
		if(rs)
		c[k++]=b[i];
		}
		int n1[]=new int[k];
		for (int i = 0; i < k; i++)
		{
		n1[i]=c[i];
		}
		for (int i = 0; i < n1.length; i++)
		{
		if(i<n1.length-1)
		System.out.print(n1[i]+" ");
		else
		System.out.print(n1[i]);
		}
		s.close();
	}

}
