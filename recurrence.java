package rosalind;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class recurrence {
	public static void main(String[] args) throws IOException 
	{
	 try (BufferedReader reader = new BufferedReader(new FileReader("/Users/christina/Desktop/rosalind_fib.txt")))
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
	    	      // System.out.print(str + "\r");
	    	   }
	    	   System.out.println(rabbitPairs(numbers.get(0), numbers.get(1)));
	    	   //passes the value of the number of months and number of offspring through the method + prints the answer
	    	  
	    } catch (IOException ioe)
		  {
			System.out.println("Not an integer.");
		  }
	}
	//source code: https://medium.com/algorithms-for-life/rosalind-walkthrough-rabbits-and-recurrence-relations-4812c0c2ddb3
	//date retrieved: 6-4-17
	public static long rabbitPairs(int numMonths, int numOffspring)
	// recursive function
		{
				if (numMonths == 1)
				//base case
				{ 
					return 1;
			    }
				else if (numMonths == 2)
				// will return number of offspring + number of adults after going through the function
				{ 
					return numOffspring;
			    }
			long oneGen = rabbitPairs(numMonths - 1, numOffspring); //F(n-1)
			long twoGen = rabbitPairs(numMonths - 2, numOffspring); //F(n-2)
				if (numMonths <= 4) {
					return (oneGen + twoGen);
					//F(n) = F(n-1) + F(n-2)
			}
			return (oneGen + (twoGen * numOffspring));
			/* (multiply the number of offspring born with the number of rabbits two months ago
			 * = offspring in current generation) + (number of rabbits a generation ago) */
		}
}
