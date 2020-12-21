import java.util.*;
public class Delete_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++) {
    	   a[i]=s.nextInt();
       }
       int d=s.nextInt();
       int pos=0,flag=0;
       for(int i=0;i<a.length;i++) {
    	   if(a[i]==d) {
    		   pos=i;
    		   flag=1;
    		   break;
    	   }	
    	   else {
    		   flag=0;
    	   }
       }
       
       if(flag == 1)
       {
           for(int i = pos+1; i < n; i++)
           {
               a[i-1] = a[i];
           }
           System.out.print("After Deleting:");
           for (int i = 0; i < n-1; i++) 
           {
               System.out.print(a[i]+" ");
           }
           
       }
       else
       {
           System.out.println("Element not found");
       }
       s.close();
       
	}
}
