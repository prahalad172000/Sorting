import java.util.Scanner;
public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array: ");
		n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		System.out.println("Sorted array is");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
