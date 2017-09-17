package rosalind;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class protein {
	public static void main(String[] args)
	{
		try{
		    @SuppressWarnings("resource")
			BufferedReader buff = new BufferedReader(new FileReader("/Users/christina/Desktop/protein.txt"));
		    //reads the file from the location provided
		    
		    String input = buff.readLine(); //sets the text from the file to input
		    
		    List<String> strings = new ArrayList<String>(); //creates first array
		    List<String> rna = new ArrayList<String>(); //2nd array for amino acids
		    int index=0;
		   
		    while (index<input.length())
		    //splits the first array into codons(sets of 3 nucleotides)
		    {
		    	strings.add(input.substring(index, Math.min(index + 3,input.length())));
		        index += 3;
		    }
		    //System.out.println(strings);
		    
		    //System.out.println(strings.size());
	
		   for (int i = 0; i < strings.size(); i++)
		   //translates the codons to their proteins
		    {
		    	if(strings.get(i).equals("UUU") || strings.get(i).equals("UUC"))
		    	{
		    		rna.add("F");
		    	}
		    	else if(strings.get(i).equals("UCU") || strings.get(i).equals("UCC") || strings.get(i).equals("UCA") || strings.get(i).equals("UCG") || strings.get(i).equals("AGU") || strings.get(i).equals("AGC"))
		    	{
		    		rna.add("S");
		    	}
		    	else if(strings.get(i).equals("UAU") || strings.get(i).equals("UAC"))
		    	{
		    		rna.add("Y");
		    	}
		    	else if(strings.get(i).equals("UGU") || strings.get(i).equals("UGC"))
		    	{
		    		rna.add("C");
		    	}
		    	else if(strings.get(i).equals("UGG"))
		    	{
		    		rna.add("W");
		    	}
		    	else if(strings.get(i).equals("CUU") || strings.get(i).equals("CUC") || strings.get(i).equals("CUA") || strings.get(i).equals("CUG") || strings.get(i).equals("UUA") || strings.get(i).equals("UUG"))
		    	{
		    		rna.add("L");
		    	}
		    	else if(strings.get(i).equals("CCU") || strings.get(i).equals("CCC") || strings.get(i).equals("CCA") || strings.get(i).equals("CCG"))
		    	{
		    		rna.add("P");
		    	}
		    	 if(strings.get(i).equals("CAU") || strings.get(i).equals("CAC"))
		    	{
		    		rna.add("H");
		    	}
		    	else if(strings.get(i).equals("CAA") || strings.get(i).equals("CAG"))
		    	{
		    		rna.add("Q");
		    	}
		    	else if(strings.get(i).equals("CGU") || strings.get(i).equals("CGC") || strings.get(i).equals("CGA") || strings.get(i).equals("CGG") || strings.get(i).equals("AGA") || strings.get(i).equals("AGG"))
		    	{
		    		rna.add("R");
		    	}
		    	else if(strings.get(i).equals("AUU") || strings.get(i).equals("AUC") || strings.get(i).equals("AUA"))
		    	{
		    		rna.add("I");
		    	}
		    	else if(strings.get(i).equals("AUG"))
		    	{
		    		rna.add("M");
		    	}
		    	else if(strings.get(i).equals("ACU") || strings.get(i).equals("ACC") || strings.get(i).equals("ACA") || strings.get(i).equals("ACG"))
		    	{
		    		rna.add("T");
		    	}
		    	else if(strings.get(i).equals("AAU") || strings.get(i).equals("AAC"))
		    	{
		    		rna.add("N");
		    	}
		    	else if(strings.get(i).equals("AAA") || strings.get(i).equals("AAG"))
		    	{
		    		rna.add("K");
		    	}
		    	else if(strings.get(i).equals("GUU") || strings.get(i).equals("GUC") || strings.get(i).equals("GUA") || strings.get(i).equals("GUG"))
		    	{
		    		rna.add("V");
		    	}
		    	else if(strings.get(i).equals("GCU") || strings.get(i).equals("GCC") || strings.get(i).equals("GCA") || strings.get(i).equals("GCG"))
		    	{
		    		rna.add("A");
		    	}
		    	else if(strings.get(i).equals("GAU") || strings.get(i).equals("GAC"))
		    	{
		    		rna.add("D");
		    	}
		    	else if(strings.get(i).equals("GAA") || strings.get(i).equals("GAG"))
		    	{
		    		rna.add("E");
		    	}
		    	else if(strings.get(i).equals("GGU") || strings.get(i).equals("GGC") || strings.get(i).equals("GGA") || strings.get(i).equals("GGG"))
		    	{
		    		rna.add("G");
		    	}
		    	/* 
		    	else if (strings.get(i).equals("UAA") || strings.get(i).equals("UAG") || strings.get(i).equals("UGA"))
			    	{
			    		rna.add("Stop");
			    	}*/
		    }  
		    //System.out.println(rna.size());
		    //System.out.println(rna);
		    
		    String formatted = rna.toString().replaceAll("[\\[\\]]", "").replaceAll(",", "");
		    //removes brackets and commas from the 2nd array
		    
		   System.out.println(formatted);
		}  
		 catch (IOException e)
	 	{
	 		System.out.print("Cannot fnd fle.");
	 		//prints this if the file isn't found
	 	}    
	}
}
