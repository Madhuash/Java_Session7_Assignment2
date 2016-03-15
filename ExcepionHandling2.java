
public class ExcepionHandling2 {
	public static void main(String args[])
	{
	try
	{
		String s = "WONDERFUL";
        int i = Integer.parseInt(s);
        // this line of code will never be reached
        System.out.println("int value = " + i);
	} catch(NumberFormatException e) {System.out.println("NumberFormatException " + e); } 
	
	}
}
