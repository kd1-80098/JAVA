package Q3;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Q3Main {

	public static void main(String[] args) {
	
		try(FileWriter fout=new FileWriter("Book2.txt"))
		{
			try(BufferedWriter bout=new BufferedWriter(fout))
			{
				for(int i=0;i<4;i++)
				{
					System.out.println("Enter a line");
					String line=new Scanner(System.in).next();
					bout.write(line);
					bout.newLine();
				}
			}
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
