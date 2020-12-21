import java.util.*;
public class Insert_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			
		}
		int e=s.nextInt();
		int pos=s.nextInt();
		int n1[]=new int[a.length+1];
		if(pos<0||pos>a.length) {
			System.out.println("index out of range");
		}
	    n1[pos]=e;
	    for(int i=0;i<a.length;i++) {
	    	if(i<pos) {
	    		n1[i]=a[i];
	    	}
	    	else
	    		n1[i+1]=a[i];
	    }
	    for(int i=0;i<n1.length;i++) {
	    	System.out.print(n1[i]);
	    }
		
		s.close();
	}

}
