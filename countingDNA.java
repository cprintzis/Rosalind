package rosalind;

import java.io.*;

public class countingDNA {
	public static void main(String[] args){
	{
	try{
    @SuppressWarnings("resource")
	BufferedReader buff = new BufferedReader(new FileReader("/Users/christina/Desktop/rosalind_dna.txt"));
    //reads the file from the location provided
    
    String dna = buff.readLine();
    char cha[] = dna.toCharArray();
    
    int a=0;
    int c=0;
    int g=0;
    int t=0;
    
    	for(int i=0;i<cha.length;i++)
    	//counts the occurrence of each nucleotide 
    	{
    	  if(cha[i]=='A')
    	  {
    		a++;
    	  }
        else if(cha[i]=='C')
        	{
               c++;
            }
        	else if(cha[i]=='G')
        	{
               g++;
            }
        	else
        	{
               t++;
            }
    	}
    	
    System.out.println("A="+ a + " C="+ c + " G="+ g + " T="+ t);
    //prints the number of each nucleotide
	    }
	catch (IOException e)
	{
		System.out.println("Cannot find file.");
		//prints this if the file isn't found
	}
  }
 }
}
