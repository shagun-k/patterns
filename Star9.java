// Star Pattern
/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/
class Star9
{
	public static void main(String[] args)
	{
		int row,col,space,star;
		star = 1;
		space = 4;
		for( row = 1; row <= 9; row++ )
		{
			for(col=1;col<=space;col++)
			{
				System.out.print(" ");
			}
			if(row < 5 )
			{
				space--;
			}
			else 
			{
				space++;
			}
			for(col=1;col<=star;col++)
			{
				if(col==1 || col== star)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(row<5)
			{
				star +=2;
			}
			else
			{
				star -=2;
			}
			System.out.println();
		}
	}
}