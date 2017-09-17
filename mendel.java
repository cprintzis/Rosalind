package rosalind;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class mendel {
	public static void main(String[] args)
	{
		
		 try (BufferedReader reader = new BufferedReader(new FileReader("/Users/christina/Desktop/rosalind_iprb.txt")))
		 //reads the file from the location provided
		    {
		    	   List<Integer> numbers = new ArrayList<Integer>();
		    	   //creates an array list that implements the list interface(access methods of a List)
		    	   String str;
		    	   
		    	   while((str = reader.readLine()) != null)
		    	   //while the string contains a line
		    	   {	
		    		   String []strNumbers = str.split(" ");
		    		   // parse the integers by spaces
		    		   for(String strNumber : strNumbers)
		    		   {
		                   numbers.add(Integer.parseInt(strNumber)); 
		                    //adds the parsed integers into a list
		               }
		    	      //System.out.print(str + "\r");
		    	   }
		    	   
		    	   System.out.println(mendel(numbers.get(0), numbers.get(1), numbers.get(2)));
		    } 
		 	catch (IOException ioe)
		  	{
		 		System.out.println("Not an integer.");
		  	}
		}

	public static double mendel(int k, int m, int n)
	{
		double pop = k + m + n;
		//total population
		
		double a = k/pop;
		double b = m/pop;
		double c = n/pop;
		//calculates the amount of each type of organism
		//a=homozygous dominant
		//b=heterozygous
		//c=homozygous recessive
			
		double kk= a*((k-1)/(pop-1));	
		double km= a*((m)/(pop-1)) + b*((k)/(pop-1));
		double kn= a*((n)/(pop-1)) + c*((k)/(pop-1));
		double mm= b*(m-1)/(pop-1);
		double mn= b*((n)/(pop-1)) + c*((m)/(pop-1));
		//probability of choosing a second organism based on the first 
		//kk = 2homozygous dominant
		//km = 1homozygous dominant + 1hetrozygous or vice versa
		//kn = 1homozygous dominant + 1homozygous recessive
		//mm = 2heterozygous
		//mn = 2homozygous recessive 
		
		double kPun = 1.0;
		double mPun = 0.75;
		double nPun = 0.5;
		//values for the dominant phenotype are found by punnet squares
		//kPun = 2homozygous dominant, one homozygous dominant+1heterozygous,
		// and 1homozygous dominant + 1homozygous recessive
		//mPun = both heterozygous
		//nPun = 1heterozygous+1homozygous recessive
		
		double prob = (double) ((kPun*kk) + (kPun* km) + (kPun *kn) + (mPun * mm) + (nPun * mn));
		//the probability of getting each value mulitpled by its value from the punnet square 
		
		return prob;
		
	}
	}