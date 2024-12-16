// Anna Joh
// 12/5/24
// StringMethodsTester.java
// We are writing some of the String Methods.  This class runs StringMethods.java
// Here are examples of using at least three methods - charAt, ...., trim

public class StringMethodsTester
{
      private char a;
      private StringMethods sm;
  
  public StringMethodsTester()
	{
    	a = 'e';
      sm = new StringMethods();
	}

	public static void main(String[] args)
	{
    	StringMethodsTester smt = new StringMethodsTester();
    	smt.runIt();
	}

	public void runIt()
	{
    	System.out.println("\n\n\n");
   	 
    	String str = "Java is awesome";
    	String strCap = "JaVa Is aWeSOME";
    	System.out.println("\"Java is awesome\"");
   	 
    	String strWithTab = "\t  Hello World!  \t";
    	System.out.println("The string is \\t Hello World!   \\t");

    	System.out.println("\nExample using the charAt() in my StringMethods.java class.");
    	for (int i = 0; i < strWithTab.length(); i++)
        	System.out.print("\nStringMethods.charAt(strWithTab, " + i + ") = " +
            sm.charAt(strWithTab, i) + " " );
     	System.out.println(sm.charAt(strWithTab, strWithTab.length()-1)); // after it works, try this.  Record the response.
   	 
    	System.out.println("\nExample using the ...write your method... in my StringMethods.java class.");
     	System.out.println("\nStringMethods.lastIndexOf with parameters used = " +
         	sm.lastIndexOf(strWithTab, a));
       	 
    	System.out.println("\n\nExample using trim(strWithTab), in my StringMethods.java class.");
    	System.out.println("The string is \"\t Hello World!   \t\"");
    	// Un-comment the following lines out after you write the trim method.
     	System.out.println("\nStringMethods.trim(strWithTab) = |" +
         	sm.trim(strWithTab) + "|\n\n" );
   	 
    	System.out.println("\n\n\n");
	}

} 
