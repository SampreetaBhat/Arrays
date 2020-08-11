import java.util.*;
public class MaxMin {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a[]=new int[100];
	int n=s.nextInt();
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
	}
	s.close();
	int min=a[0];
	for(int i=0;i<n;i++) {
		
		if(a[i]<min) {
			min=a[i];
		}
		
	}
	System.out.println("minimum is"+min);
	
	int max=a[0];
	for(int i=0;i<n;i++) {
		
		if(a[i]>max) {
			max=a[i];
		}
		
	}
	System.out.println("maximum is"+max);
	
	}

}
