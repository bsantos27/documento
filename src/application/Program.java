package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	
		public static void main(String[] args) {
			
		File file = new File("C:\\in.txt");
		Scanner c = null;
		
		try {
			c = new Scanner(file);
			while(c.hasNextLine()) {
				System.out.println(c.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error" + e.getMessage());
		}
		finally {
			if(c != null) {
				c.close();
			}
		}
		
		
		}
}
		
