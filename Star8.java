// Star Patterns 
/*
*****
 ****
  ***
   **
    *
*/
class Star8
{
	public static void main(String[] args)
	{
		int row,col;
		for(row=1;row<=5;row++)
		{
			for(col = row;col >= 1;col--)
			{
				System.out.print(" ");
			}
			for(col=5;col>=row ;col--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}