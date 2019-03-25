import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n,temp;
			System.out.println("Enter the size: ");
			n=s.nextInt();
			int[] a=new int[n];
			System.out.println("Enter the elements: ");
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						temp=a[j+1];
						a[j+1]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Array after Sorting is: ");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}

	}

}
