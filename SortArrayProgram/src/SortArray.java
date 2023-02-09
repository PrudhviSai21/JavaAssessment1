import java.util.*;
public class SortArray {

	public static void sortMyArray(int[] a) {
		//TODO Add your implementation here
//		System.out.println(s1+" "+s2);
//		ArrayList<Integer> l1=new ArrayList<>();
//		ArrayList<Integer> l2=new ArrayList<>();
		int n=a.length;
		int b[]=new int[n];
		int startmax=0,endmax=0;
		int st=1,en=n-1;
		b[0]=a[n-1];
		b[n-1]=a[n-2];
		startmax=b[0];
		endmax=b[n-1];
		for(int i=n-3;i>=0;i--) {
			if(startmax>endmax) {
				b[--en]=a[i];
				endmax+=a[i];
			}
			else {
				b[st++]=a[i];
				startmax+=a[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}

		
	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		sortMyArray(a);
		sc.close();
	}

}
