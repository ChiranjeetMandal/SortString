import java.util.Scanner;
class SortString
{
	
	public static void main(String args[])
	{
		String temp;


		//Scanner class for taking inpute values from the user
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of string would you like to enter :");
		int count=scan.nextInt();//taking numper o string input

		//creating a array where we store our input string values
		String[] st = new String[count];

		//we create another object of Scanner class for String because scan Object already 
		//taken a space so if we continue previous scan Object then user can give input
		//less then one i.e. if count=5 then user can give input 4. If any other reason
		// then please mention
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<count;i++)
		{
			st[i]=sc.nextLine();//storing string input into the array
		}

		for(int i=0;i<count;i++)
			for(int j=i+1;j<count;j++)
		     {
				if(st[i].compareTo(st[j])>0)//The Java String compareTo() method is used for 
				//comparing two strings lexicographically.
				 {
					temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
		     }
		System.out.println("Shorted Strings are: ");
		for(int i=0;i<count;i++)
		{
			System.out.print(st[i]+", ");
		}
		System.out.println();


	}
}