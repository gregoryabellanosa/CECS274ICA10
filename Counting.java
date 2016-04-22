
public class Counting {

	public static void main(String[] args)
	{
		countForwards(5);
	}
	
	public static void countForwards(int num)
	{
		
		if (num > 0)
		{
			countForwards(num - 1);
		}
		System.out.print(num + " ");
	}
	
}
