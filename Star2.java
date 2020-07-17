// Star Patterns 
/*
*********
 *******
  *****
   ***
    *

*/
class Star2
{
	public static void main(String[] args)
	{
		int row,col;
		for( row = 5; row >= 1; row-- )
		{
			for( col = 5 - row ; col >= 0 ; col-- )
			{
				System.out.print(" ");
			}
			for( col = 1; col <= 2 * row - 1 ; col ++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}