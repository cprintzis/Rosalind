package rosalind;
import java.io.*;

public class transcribe {
	
	public static void main(String[] args){
	{
	try{
    @SuppressWarnings("resource")
	BufferedReader buff = new BufferedReader(new FileReader("/Users/christina/Desktop/rosalind_rna.txt"));
    
    String dna = buff.readLine(); //reads text from input file
    char cha[] = dna.toCharArray(); //converts string to character array
    
    int a=0;
    int c=0;
    int g=0;
    int t=0;
    
    	for(int i=0;i<cha.length;i++)
    	{
    	  if(cha[i]=='A')
    	  {
    		System.out.print("A");
    	  }
        else if(cha[i]=='C')
        	{
        	System.out.print("C");
            }
        	else if(cha[i]=='G')
        	{
        		System.out.print("G");
            }
        	else
        	{
        		System.out.print("U");
            }
    	}
	}
    	catch (IOException e)  //exception in case try doesn't work
    	{
    		System.out.print("Cannot find file.");
    	}

	}
	}
}
		


