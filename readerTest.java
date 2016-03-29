import java.io.*;
import java.util.*;

public class readerTest{
	
	public static void main (String args[]){
		
		String file = "sampleDataFile.txt";
	
		try {
			System.out.println("reading file " + file);
			BufferedReader infile = new BufferedReader( new FileReader( file ) );
			while ( infile.ready() ) {	//while the file is open
				String temp = infile.readLine();	//read the line in the file
				String[] a = temp.split("," , 4);	//splits the string at the commas into 4 pieces
				System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " );
			}
		}
		catch(Exception e)		{
				System.out.println();
		}
	}
}