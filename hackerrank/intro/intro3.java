/**
  * @brief Solution to https://www.hackerrank.com/challenges/java-if-else?h_r=next-challenge&h_v=zen
  */

    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;


/**
  * @brief Data Container 
  */
class db_t
{
    public Scanner scanner; ///< Will build it in the Constructor 
    int n; 
    
    public db_t()
    {
        scanner = new Scanner(System.in); 
    }
}


/**
  * @brief Pure Function Container 
  */
class func_t
{
    public static boolean isWeird(int n)
    {
        if(n%2==1) return true; ///< Case Odd 
        if((n>=6) && (n <= 20)) return true; ///< Case Range 
        return false; 
    }
}

    public class Solution {

        public static void main(String[] args) 
        {
            db_t db = new db_t(); 
            
            db.n = db.scanner.nextInt(); 
            if(func_t.isWeird(db.n)) 
                System.out.println("Weird"); 
            else 
                System.out.println("Not Weird"); 
        }
    }


