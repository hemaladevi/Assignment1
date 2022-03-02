package patternquestions;

import java.util.Scanner;
public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		try
		{
			System.out.println("Start of Code");
			System.out.println("Enter a string : ");
			String str=scanner.next();//"Wrapper" : l-7 in : 0 to 6
			char ch=str.charAt(str.length());
			System.out.println("Character found is : "+ch);
			System.out.println("End of Code");
		}
		
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		catch(NullPointerException ne)
		{
			ne.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			ai.printStackTrace();
		
}
		finally
		{
			System.out.println("Exception Handled!!End Of Program!!");
		}
	}

}