package rosalind;

import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class point {
		
		public static void main(String[] args) throws IOException
		{
			
			Scanner scan = new Scanner(new File("/Users/christina/Desktop/rosalind_hamm.txt"));
			ArrayList<String> IDs = new ArrayList<String>();

			while(scan.hasNextLine())
			{
				IDs.add(scan.nextLine());
			}
			
			String seq1=IDs.get(0);
			String seq2=IDs.get(1);
			//sets the value of the first index and the second index to string variables
			
			//System.out.println(seq1+ "\n" + seq2);
			
			//source code: https://stackoverflow.com/questions/25949977/how-to-get-the-count-of-unmatched-character-in-two-strings
			//date retrieved: 6-9-17
			String tempseq1 = "";
			String tempseq2 = "";

			int maxSize = ((seq1.length() > seq2.length()) ? (seq1.length()) : (seq2.length()));
			//if the length of seq1 is greater than seq2 than set the maxSize to the length of seq1 if false set
			// the maxSize to the length of seq2

			for (int i = 0; i < maxSize; i++) 
			{
			    if (i >= seq2.length()) 
				    {
				        tempseq1 += seq1.charAt(i);
				    } 
			    else if (i >= seq1.length()) 
				    {
				        tempseq2 += seq2.charAt(i);
				    } 
			    else if (seq1.charAt(i) != seq2.charAt(i)) 
			    //compares the value of each character and sets the mismatches to the correct sequence
				    {
				        tempseq1 += seq1.charAt(i);
				        tempseq2 += seq2.charAt(i);
				    }
			}

			seq1 = tempseq1;
			//sets the first sequence to the mismatched sequence
			seq2 = tempseq2;
			//sets the second sequence to the mismatched sequence
			
			//System.out.println(seq1+ "\n" + seq2);
			System.out.println(seq1.length());
		}
}


