import java.util.Scanner;
public class bubblesortboth
{
	public static void main(String[] args)
	{
		int n,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter total number");
		n=in.nextInt();
		System.out.println("Enter the number");
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=in.nextInt();
		}
		
		for(int i=0;i<(n-1);i++)
		{
			int d=0;
	 while(d<n-i-1)
			{
				if(array[d]>array[d+1])
				{
					b=array[d];
					array[d]=array[d+1];
					array[d+1]=b;
				}
				d++;
			}
		}
		System.out.println("Ascending number list");
		for(int k=0;k<n;k++)
			System.out.println(array[k]);
		for(int i=0;i<(n-1);i++)
		{
			int d=0;
	 while(d<n-i-1)
			{
				if(array[d]<array[d+1])
				{
					b=array[d];
					array[d]=array[d+1];
					array[d+1]=b;
				}
				d++;
			}
		}
		System.out.println("Descending number list");
		for(int k=0;k<n;k++)
			System.out.println(array[k]);
	}
}