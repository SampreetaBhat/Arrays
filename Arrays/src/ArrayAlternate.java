import java.util.*;
public class ArrayAlternate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter the array Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		s.close();
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				System.out.print(a[i]+" ");
			}
		}

	}

}
