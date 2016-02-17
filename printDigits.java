
public class printDigits
{
	   public static void main(String[] args)
    {
    	printDigits.printDigits("Hello@ 1%");
    }
    static void printVowels(String s)
    {
    	 String vowels="aeiouAEIOU";
    	 for(int i=0;i<s.length();i++)
    	 {
    		   if(vowels.indexOf(s.charAt(i))!=-1)
    		   {
    			   System.out.println(s.charAt(i));
    		   }
          }
    }
    static void printDigits(String s)
    {
    	String digits="0123456789";
    	for(int i=0;i<s.length();i++)
    	{
    		if(digits.indexOf(s.charAt(i))!=-1)
    		{
    			System.out.println(s.charAt(i));}
    	    }
        }
}    
    	 
