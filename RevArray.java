import java.util.Scanner;

public class RevArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("size of an Array : ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter a Num..");
		
		for (int i = 0; i <= size-1; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Reversing an Array");
		System.out.println("-------------------------");
		printArray(arr,size);
		revArray(arr,0,size-1);
		System.out.println("After Reversing an Array");
		System.out.println("-------------------------");
		printArray(arr,size);
		sc.close();
	}
	static void revArray(int[] arr, int start, int end) 
	{
		int temp;
		if (start>=end)
			return;
		
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			revArray(arr, start+1, end-1);
			/*
			 * start++;
			   end--;
			 */
		
	}

	static void printArray(int[] arr, int size) 
	{
		for (int i = 0; i <= size-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


}



/*
 * a[start] = a[end]
         a[0] = a[5] 1=6, 2=5, 3=4
         a[5] = a[0] 6=1, 5=2, 4=3
         start++
         end--
 */
        