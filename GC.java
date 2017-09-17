package rosalind;

import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;


public class GC {
		
		public static void main(String[] args) throws IOException
		{
			
			//source code: https://github.com/breezedu/rosalind/blob/master/ComputingGCContent.java
			//date retrieved: 6-6-17
			Scanner scan = new Scanner(new File("/Users/christina/Desktop/rosalind_gc.txt"));
			ArrayList<String> IDs = new ArrayList<String>(); //ArrayList for the IDs
			ArrayList<String> seqs = new ArrayList<String>(); //ArrayList for the sequences
			
			String seq = ""; 

			while(scan.hasNextLine())
			//while the text has a next line
			 {
				String temp = scan.nextLine();
				//set the next line to temp
				if(temp.charAt(0) == '>')
				//if the temp string contains a '>'
				{
					IDs.add(temp);
					//add the temp string with '>' to the IDs ArrayList
					seqs.add(seq);
					//add the temp string of sequences to the seqs ArrayList
					seq = "";
				}
				else
				{
					seq += temp;
					//created the last sequence
				}
			 } 
			seqs.add(seq);
			//adds the last sequence to the ArrayList
			seqs.remove(0);
			//removes the first element of the list since it is ""
			scan.close();
			 
			/*
			for(int i=0; i<IDs.size(); i++)
			//for each element in the IDs ArrayList it will print the id and the sequence
				{
				System.out.println("IDs: " + IDs.get(i) + " " + " Sequences: " +seqs.get(i));
				
				} */
					{	   	
						int size = IDs.size();
						String max = "";
						double maxValue = 0;
						for (int i=0; i<size; i++)
						{
							String temp = seqs.get(i);
							//gets the index of each sequence and sets it to temp
							double GCValue = calc(temp);
							//sets the calculated GC content value of each id to a GC value
							
							if(GCValue>maxValue)
							//compares the value of each GC content to the 0
							{
								maxValue=GCValue;
								/*if the the GC content is greater than than the maxValue, sets
								 * the maxValue to the GC content and then sets the value of the index to the max
								 */
								max=IDs.get(i);
							}
						}
						
						System.out.println("ID of highest GC content string: " + max.substring(1));
						//prints the id without the '>'
						System.out.printf("GC content: " + "%.6f", maxValue);
						//prints the GC content
					}
			}
			private static double calc(String dna)
				{
					int a=0;
				    int c=0;
				    int g=0;
				    int t=0;
						    
				  for(int i=0; i< dna.length(); i++)
				    {
				    	if(dna.charAt(i)=='A')
				    	  {
				    		a++;
				    	  }
				    	else if(dna.charAt(i)=='C')
			        	{
			               c++;
			            }
			        	else if(dna.charAt(i)=='G')
			        	{
			               g++;
			            }
			        	else if(dna.charAt(i)=='T')
			        	{
			               t++;
			            }
				      }	   
						    
				    int total = a + c + g + t;
				    int GC = g + c;
				    double percent = (((double) GC / total) * 100);   
					
				    //System.out.println("Count: " + GC +" Total: " +total);
					return percent;
				}
		}


			
		
