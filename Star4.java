// Star Patterns 
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
class Star4
{
	public static void main(String[] args)
	{
		int row,col,star,space;
		star = 1;
		space = 4; 
		for(row=1;row<=9;row++)
		{
			for(col=1;col<=space;col++)
			{
				System.out.print(" ");
			}
			if(row<5)
			{
				space--;
			}
			else
			{
				space++;
			}
			for(col=1;col<=star;col++)
			{
				System.out.print("*");
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