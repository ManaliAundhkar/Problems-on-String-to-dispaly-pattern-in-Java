//Write Java program which accept String from user and display below pattern.
//Input : Hello
//Output :         H e l l o
//		   H e l l *
//		   H e l * *
//		   H e * * *
//		   H * * * *


import java.util.*;

class Pattern
{
	public void Display(String str)
	{
		int i=0,j=0;
		char Arr[]=str.toCharArray();
		
		for(i=Arr.length;i>0;i--)
		{
			for(j=0;j<Arr.length;j++)
			{
				if(j<i)
				{
					System.out.print(Arr[j]+"\t");
				}
				else
				{
					System.out.print("*\t");
				}
				
			}
			System.out.println();
		}
	}
}
class New1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sobj.nextLine();
		
		Pattern pobj=new Pattern();
		
		pobj.Display(str);
		
	}
}







