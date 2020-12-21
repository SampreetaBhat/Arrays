import java.util.*;
public class Array_Intersection {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int a[]=new int[n1];
		int n2=s.nextInt();
		int b[]=new int[n2];
		for(int i=0;i<n1;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n2;i++) {
			b[i]=s.nextInt();
		}
		int count=0;
		int c[]=new int[a.length+b.length];
			
				if(n1>=n2) {
				for(int i=0;i<n1;i++) {
					try{
					if(a[i]==b[i]) {
						count+=1;
						c[i]=a[i];
					}
					}catch(ArrayIndexOutOfBoundsException e) {
						e.printStackTrace();
					}
				}
			}
				else {
					for(int i=0;i<n2;i++) {
						try{
						if(a[i]==b[i]) {
							count+=1;
							c[i]=a[i];
						}
						}catch(ArrayIndexOutOfBoundsException e) {
							e.printStackTrace();
						}
				}
			}
			
			int d[]=new int[count];
			for(int i=0;i<count;i++) {
				d[i]=c[i];
				System.out.print(d[i]+" ");
			}
		s.close();


	}

}
