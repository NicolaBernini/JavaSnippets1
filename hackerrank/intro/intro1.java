/**
  * @brief Solution to https://www.hackerrank.com/challenges/java-stdin-and-stdout-1?h_r=next-challenge&h_v=zen
  */

import java.util.*;

class params_t
{
    public int num_input = 3; 
}

class input_t
{
    public int num[]; ///< Declare an Array that will be dynamically instanced with the expected number of input elements 
    
    public input_t(int num_elements) 
    {
        num = new int[num_elements]; ///< Dynamical Instantation of Int Array 
        //System.out.println("Initialized with " + num_elements + " Elements"); 
    }
}

class db_t
{
    public Scanner scan; ///< Declares the Scanner but will build it later 
    public params_t params = new params_t(); ///< Declares and build the Params 
    public input_t input = new input_t(params.num_input); ///< Declares and build the Input Container with the Params 
    
    public db_t()
    {
        scan = new Scanner(System.in); ///< Builds the scanner 
    }
}

class Solution {

    public static void main(String[] args) {
        db_t db = new db_t(); ///< Builds all the Data         
        
        for(int i=0; i<db.params.num_input;++i) ///< Reading Values 
            db.input.num[i] = db.scan.nextInt(); 

        for(int i=0; i<db.params.num_input;++i) ///< Printing Values 
            System.out.println(db.input.num[i]); 
    }
}

