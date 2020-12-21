import java.util.*;
public class Matrix_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		int a[][]=new int[k][k];
		for(int i=0;i<k;i++) {
			for(int j=0;j<k;j++) {
				a[i][j]=s.nextInt();
			}
		}
		int c[][]=new int[k][k];
		for(int i=0;i<k;i++){    
			for(int j=0;j<k;j++){    
			c[i][j]=0;      
			for(int z=0;z<k;z++)      
			{      
			c[i][j]+=a[i][z]*a[z][j];      
			}
			System.out.print(c[i][j]+" ");    
			}
			System.out.println();   
			}  
		s.close();

	}

}
