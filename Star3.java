// Star Patterns 
/*
**********
****  ****
***    ***
**      **
*        * 
**      **
***    ***
****  ****
**********

*/
class Star3
{
	public static void main(String[] args)
	{
		int row,col,star,space;
		space = 0;
		star = 5;
		for(row=1;row<=9;row++)
		{
			for(col=1;col<=star;col++)
			{
				System.out.print("*");
			}
			for(col=1;col<=space;col++)
			{
				System.out.print(" ");
			}
			for(col=1;col<=star;col++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(row<5)
			{
				star--;
				space +=2;
			}
			else
			{
				star++;
				space -=2;
			}	
		}
	}
}