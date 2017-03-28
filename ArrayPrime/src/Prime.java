
import java.util.Scanner;
public class Prime
{
	
	
	public static void main(String args[])
	{
		int i;
		int a[]= new int[10];
		int b[]= new int[10];
		
		a[0]= 2;
		a[1]=3;
		a[2]=5;
		a[3]=7;
		a[4]=11;
		a[5]=13;
		a[6]=17;
		a[7]=19;
		a[8]=23;
		a[9]=29;
		
		
		Check c=new Check();
		c.storeArray(a,b);
		c.displayArray(a);
		c.displayArray(b);
		
		
	}
}

class Check
{
	
	int i;
	
	 void storeArray(int a[], int b[])
	{
		
		int j=9;
		for(i=0;i<10;i++)
		{
				
				b[i]=a[j];
				j--;
			
			
		}
	}

	
	
	void displayArray(int a[])
	{
		System.out.println("  ");
		System.out.println(" array elements --->");
		for(i=0;i<10;i++)
		{
			System.out.print(a[i]+"   ");
		}
	}
}