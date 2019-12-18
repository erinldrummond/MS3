package edrummondMS3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class TallyRecords {

		private static int total;

		//Tallies the total number of records received
    public static void main(String[] args)
    {	
    	
    	try{
    		
    		File file =new File("C:\\Users\\jmmof\\Documents\\MS3\\ProvidedCSV.csv");
    		
    		if(file.exists()){
    			
    		    FileReader fr = new FileReader(file);
    		    LineNumberReader lnr = new LineNumberReader(fr);
    		    
    		    int total = 0;
    		    
    	            while (lnr.readLine() != null){
    	        	total++;
    	            }
    	 
    	            System.out.println("Total number of records = " + total);
    	 
    	            lnr.close();
    	        
    		     
    		}else{
    			 System.out.println("File does not exists!");
    		}
    		
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    	
    		//Total number of records failed
    	try{
    		
    		File file =new File("C:\\Users\\jmmof\\Documents\\MS3\\CSV-bad.csv");
    		
    		if(file.exists()){
    			
    		    FileReader fr = new FileReader(file);
    		    LineNumberReader lnr = new LineNumberReader(fr);
    		    
    		    int bad = 0;
    		    total = 6003;
    		    
    	            while (lnr.readLine() != null){
    	        	bad++;
    	            }
    	 
    	            System.out.println("Total number of failed records = " + bad);
    	            System.out.println("Total number of successful records = " + (total-bad));
    	            
    	            lnr.close();
    	        
    		     
    		}else{
    			 System.out.println("File does not exists!");
    		}
    		
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
}