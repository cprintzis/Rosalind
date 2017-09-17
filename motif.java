package rosalind;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class motif 
{
	public static void main(String[] args)
	{
		try{
		    @SuppressWarnings("resource")
			BufferedReader buff = new BufferedReader(new FileReader("/Users/christina/Desktop/rosalind_subs.txt"));
		    //reads the file from the location provided
		    
		    String input;

		    List<String> dna = new ArrayList<String>(); //creates an arrayList
		    
		    while((input= buff.readLine()) !=null)
		    //reads the file
		    	{
		    		dna.add(input); //splits the text file into separate strings by index
		    	}
		   	
		    
			 String s = dna.get(0); //assigns string s to the first index(the string you want to search in)
			 String t = dna.get(1);  //assigns string s to the second index(the string you want to search for)
			    
			    //System.out.println(org);
			    //System.out.println(check);
		     
			 for (int i = -1; (i = s.indexOf(t, i+1)) != -1; ) 
				 //finds all of the occurrences of the string t in string s
			    {
			    	System.out.println(i+1);
			    	//prints the index of each occurrence
			    }
		   }
		   catch (IOException e)
				{
				  System.out.print("Cannot fnd file.");
				  //prints this if the file isn't found
				}
	}    
}
		    
		
		

