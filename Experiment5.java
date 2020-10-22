
import java.util.Arrays;
import java.util.Scanner;

public class Experiment5
{
	public static void main(String args[])
	{
		String a[] = {"head","here","when","where"};
		Arrays.sort(a);
		int position;
		Scanner sai = new Scanner(System.in);
		String key = sai.next(); // search key from command line
		
		position = binarySearch(a,a.length,key);

		if(position == -1)
			System.out.println("Sorry...No key found...");
		else
			System.out.println("Key found at "+(position+1)+ "location...");
	}

	public static int binarySearch(String b[],int n,String key)
	{
		int lb, ub, mid;
		
		lb = 0; 
		ub = n-1;

		while(lb<=ub)   // fail means (lb>ub)
		{	
			mid = (lb+ub)/2;
			String val = b[mid];
			if(val.equals(key))
				return mid;
			else
			if(val.compareToIgnoreCase(key)<0)	
				lb = mid+1;
			else
				ub = mid-1;
		}
		return -1;
	}
}
