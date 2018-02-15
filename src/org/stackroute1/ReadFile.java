package org.stackroute1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader("/home/yaash/Documents/fileReader.txt");
			BufferedReader br = new BufferedReader(fileReader);
			String Str = br.readLine();
			while (Str != null) {
				System.out.println(Str);
				Str = br.readLine();
			}
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
