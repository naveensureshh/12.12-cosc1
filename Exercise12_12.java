
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercise12_12 {
	public static void main(String args[]) throws IOException {
		//declaring integers and sums
		int i = 0;
		double sum = 0;
		//Enter file name contents
		System.out.print("Enter a file name: ");
		Scanner Console = new Scanner(System.in);
		String fileName = Console.nextLine();
		
		
		//java textfile name
		java.net.URL url= new java.net.URL ("http://cs.armstrong.edu/liang/data/Exercise12_121.txt");
		
		
		try (
				
				
			Scanner input = new Scanner(url.openStream())) {
				while(input.hasNext()) {
					sum += input.nextDouble();
					i++;
				}
				//Display score
				System.out.println("\n Total is:" + sum);
				//Calculate and display Average
				
				System.out.println("\n Average is:" + sum/i);
			}
		
	
		// Check if source file exists
	if(args.length != 1) {
		System.out.println("Usage: java Exercise12_12 filename");
	      System.exit(1);
		
	}
	//Check if file exists
	File sourceFile = new File(args[0]);
	if(!sourceFile.exists()) {
		System.out.println("Source file" + args[0] + "not exist");
		System.exit(2);
	}
	StringBuilder buffer = new StringBuilder();
	//reading to a file
	Scanner input = new Scanner(sourceFile);
	
	//editing and loop through file
	while (input.hasNext()) {
		String s = input.nextLine();
		String s1 =  s.trim();
		if(s1.charAt(0) == '{') {
			buffer.append(" {");
			if (s1.length() > 1) buffer.append("\r\n" + s.replace('{', ' '));
		}
		else {
			buffer.append("\r\n" + s);
		}
		input.close();
		// Write buffer into the file
		PrintWriter output = new PrintWriter(sourceFile);
	    output.print(buffer.toString());
	    output.close();
		}
	}
}



