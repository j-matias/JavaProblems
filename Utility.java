/*
This class

*/


import java.util.Scanner;

  public class Utility {
    static Scanner   keyboard      =   null ;
    
  public static double queryForDouble (String prompt) throws IllegalArgumentException {  
  double answer     =   0    ;
	
      if ( (prompt != null) && (prompt.length()) > 0 ) {
         System.out.println(prompt) ;
         keyboard   =   new Scanner(System.in) ;
         answer     =   keyboard.nextDouble() ;
      } else
         throw new IllegalArgumentException("Illegal prompt value encountered") ;
		
      return answer ;
    }  
   
   public static float queryForFloat(String prompt) throws IllegalArgumentException {   
   float       answer     =   0    ;
	
      if ( (prompt != null) && (prompt.length()) > 0 ) {
         System.out.println(prompt) ;
         keyboard   =   new Scanner(System.in) ;
         answer     =   keyboard.nextFloat() ;
      } else
         throw new IllegalArgumentException("Illegal prompt value encountered") ;
		
      return answer ;
      
    } 
   
    public static int queryForInt(String prompt) throws IllegalArgumentException {   
    int       answer     =   0 ;
	
      if ( (prompt != null) && (prompt.length()) > 0 ) {
         System.out.println(prompt) ;
         keyboard   =   new Scanner(System.in) ;
         answer     =   keyboard.nextInt() ;
      } else
         throw new IllegalArgumentException("Illegal prompt value encountered") ;
		
      return answer ;
    }
	   
   public static long queryForLong(String prompt) throws IllegalArgumentException {
   long      answer     =   0 ;
	
      if ( (prompt != null) && (prompt.length()) > 0 ) {
         System.out.println(prompt) ;
         keyboard   =   new Scanner(System.in) ;
         answer     =   keyboard.nextLong() ;
      } else
	 throw new IllegalArgumentException("Illegal prompt value encountered") ;
		
      return answer ;
   }  
   
    public static String queryString(String prompt) throws IllegalArgumentException {
    String      answer     =   null ;
	
      if ( (prompt != null) && (prompt.length()) > 0 ) {
         System.out.println(prompt) ;
         keyboard   =   new Scanner(System.in) ;
         answer     =   keyboard.nextLine();
      } else
	 throw new IllegalArgumentException("Illegal prompt value encountered") ;
		
      return answer ;
   
   
    }
   
  
    }
