import java.util.Scanner;
public class Vikki
{
	public static int calculate(int distance)
	{
		int n = 0;
		int t = 0;
		while( n<= distance)
		{
			n= n+5;
			if(n >= distance)
			{
				break;
			}
			t = t+1;
			n = n+3;
			if(n >= distance)
			{
				break;
			}
			t = t + 2;
			n = n+ 1;
			if(n >= distance)
			{
				break;
			}
			t = t + 3;
		}
		return t;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance");
		int distance = sc.nextInt();
		System.out.println("Time taken to this distance\n"+ calculate(distance));
	}
}