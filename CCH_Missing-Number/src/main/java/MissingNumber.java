import java.util.*;
public class MissingNumber {
	public static int[] sorting (int arr[]){
		int temp;
		for(int i = 0;i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void findNumber(int arr[])
	{
		int count = 0;
		int start = arr[0];
		int missingNumbr = 0;
		for(int i = 1; i < arr.length; i++)
		{
			System.out.println(start+" "+arr[i]);
			if(start + 1 == arr[i])
			{
					start = arr[i];
			}
			else
			{
				start = start+2;
				missingNumbr = start-1;
				count++;
			}
		}
		if(count > 1)
		{
			System.out.println("Your input is wrong"+count);
		}
		else
		{
			System.out.println("Missing number is:"+ missingNumbr);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number with , separator");
		String  s= sc.nextLine();
		String[] getNumber = s.split(",");
		int[] arr = new int[getNumber.length];
		
		for(int i=0;i<getNumber.length;i++) {
		arr[i] = Integer.parseInt(getNumber[i]); 			
		}
		findNumber(sorting(arr));
	}

}
