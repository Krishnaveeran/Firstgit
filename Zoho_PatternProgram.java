package practice;

public class Zoho_PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int row=1; int n=4; int k=0;
		for( row=1; row<=4; row++)
		{
			for(int col=1; col<=(2*n)-row; col++)
			{
				if(col<=n-row)
				{
				System.out.print("  ");
				}
				else if(row%2==1)
				{
					k++;
					System.out.print(k+" ");
				}
				else 
				{
					System.out.print(k+" ");
					k--;
				}
			}k+=n;
			System.out.println();
		}
		}
			
	}


