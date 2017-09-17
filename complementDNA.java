package rosalind;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class complementDNA {
	
	public static void main(String[] args)
	{
		{
		String input = "";
		
		System.out.println(reverseComplement(input)); 
		// prints the reverse complement of the line
		}
	}
		
		public static String reverseComplement(String input)
		{
			String out ="";
		try{
		    @SuppressWarnings("resource")
			BufferedReader buff = new BufferedReader(new FileReader("/Users/christina/Desktop/rosalind_revc.txt"));
		    //reads the file from the location provided
		    
		    input = buff.readLine();
		    
     //source code: https://github.com/niemasd/Algorithm-Problem-Solutions/blob/master/ROSALIND%20Solutions/Bioinformatics%20Textbook%20Track/1B%20-%20Reverse%20Complement%20Problem/ReverseComplementProblem.java	
     //date retrieved: 6-4-17
			for (int i = input.length()-1;i>-1; i--)
			{
				 char curr = input.charAt(i); //adds the complement character to the out string
		    	{
		    	  if(curr=='A')
		    	  {
		    		out += 'T';
		    	  }
		    	  else if(curr=='C')
		          {
		    		  out += 'G';
		          }
		          else if(curr=='G')
		          {
		        	  out += 'C';
		          }
		          else if (curr=='T')
		          {
		        	  out += 'A';
		          }
		          else{
		        	  System.out.println("ERROR: Input is not a DNA Sequence.");
		                System.exit(-1);
		          }
				}
		     }
		}
		    			
		catch (IOException e)
    	{
    		System.out.print("Cannot find file.");
    		//prints this if the file isn't found
    	}
		return out;
	   }
  }
    	