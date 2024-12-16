// Anna Joh
// 12/5/24
// StringMethods.java
// We are writing some of the String Methods.  This class stays the same and will get runned. 
// Here are examples of using at least three methods - charAt, ...., trim

public class StringMethods 
{
	private String str; // declare field variables 
	private int index;
    
	public StringMethods()
	{
    	str = new String("");
    	index = 0;
	}

	public static char charAt(String str, int index)
	{
    	String aChar = new String("");         // D&I variables, aChar as new String, subtract as int, 
    	int subtract = -1;
    	char sbt = '!';                        // sbt as char 
   	 
    	aChar = str.substring(index, index+1); // it plugs in the string from the index of the 
    	                                       // variable of index and index+1 into aChar
    	subtract = aChar.compareTo("!");       // compares aChar to the ascii code of ! and plugs it into subtract
    	subtract+=33;                          // add subtract's value to 33 and become subtract again
    	sbt = (char)(subtract);                // convert subtract to char
    	return sbt;                            // return the sbt
	}
 
	public static int lastIndexOf(String str, char a)
	{
    	int theLength = -1;                   // D&I variables, theLength as int, compared as char, 
    	char compared = '?';
    	int index = 1;                        // index as int
    	theLength = str.length();             // the value of the length of the str is theLength
    	index = theLength-1;                  // index number of the last letter is one less than the length
   	 
    	while (index >= 0)                    // While index is greater than and equal to 0 loop
    	{
        	if (str.charAt(index) == a)       // if statement if the character at the index is equal to a
        	{
            	return index;
        	}
       	 
        	else
        	{
            	index--;
        	}
    	}
    	return index;
	}
    
	public static String trim(String str)
	{
    	int startIndex = 0;                         // D&I variables, startIndex as int, endIndex as int,  
    	int endIndex = str.length()-1;
    	String afterTrimming = new String("");      // afterTrimming as new String
   	 
    	while(str.charAt(startIndex)==' ' || str.charAt(startIndex)=='\t')  // checks if the find char is space or tab
    	{
        	startIndex++;
    	}
   	 
    	while (str.charAt(endIndex)==' ' || str.charAt(endIndex)=='\t')     // checks if the last char is space or tab
    	{
        	endIndex--;
    	}
   	 
    	afterTrimming = str.substring(startIndex, endIndex);                // The trimmed version would be the string 
    	                                                                    // from the value of the startIndex to value of 
    	                                                                    // endIndex
    	return afterTrimming;                                               // return the value of afterTrimming
	}

}
