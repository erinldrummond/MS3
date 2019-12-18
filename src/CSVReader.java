package edrummondMS3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

	//Read & parse data from CSV file
public class CSVReader {

	public static void main(String[] args) {
		String fileName = "ProvidedCSV.csv";
		File file = new File(fileName);
		try {
			Scanner inputStream = new Scanner(file);
			while (inputStream.hasNext()) {
				String data = inputStream.next();				
				System.out.println(data);
			}
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
		
	}
}	

