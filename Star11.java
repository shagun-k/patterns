// Star Pattern
/*
*****
*   *
*   *
*   *
*****
*/
class Star11
{
	public static void main(String[] args)
	{
		int row,col;
		for(row=1;row<=5;row++)
		{
			for(col=1;col<=5;col++)
			{
				if(row == 1 || row == 5)
				{
					System.out.print("*");
				}
				else
				{
					if(col == 1 || col == 5 )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}