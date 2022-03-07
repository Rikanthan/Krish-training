import java.util.*;
public class CheckOccurrance{
	public static void sortChar(String word)
	{
		String t="";
		char arr[] = new char [word.length()];
		word = word.toLowerCase();
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] =	word.charAt(i);
		}
		
		for(int i = 0; i < word.length(); i++)
		{
			for(int j = i + 1; j < word.length() ; j++)
			{
				if(arr[i] > arr[j])// e >= d
				{
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		char start = arr[0];
		int count = 1;
		for(int i = 1; i < arr.length; i++)
		{
			if((int) start == (int) arr[i])
			{
			 count++;	
			}
			else 
			{
				System.out.println(start+"-"+count);
				start = arr[i];
				count = 1;
			}
		}
		System.out.println(arr[arr.length-1]+"-"+1);
	}
	public static void main(String args[])
	{
		sortChar("Hello");
	}
}
		