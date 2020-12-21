import java.util.*;
public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		 boolean flag = true;  
         int temp =0; 
         for (int i=0; i<=a.length-2; i++)  
         {  
             if (flag) {
            	 if (a[i] > a[i+1])  
                 {  
                     
                     temp = a[i];  
                     a[i] = a[i+1];  
                     a[i+1] = temp;  
                 }  
             }
             else {
                 if (a[i] < a[i+1])  
                 {  
                      
                     temp = a[i];  
                     a[i] = a[i+1];  
                     a[i+1] = temp;  
                 }  
             }  
             flag = !flag;
            
         } 
//         System.out.println(Arrays.toString(a));
         for(int i=0;i<a.length;i++) {
        	 System.out.print(a[i]+" ");
         }
         s.close();
	}
}


