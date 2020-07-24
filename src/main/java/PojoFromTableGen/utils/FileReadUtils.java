package PojoFromTableGen.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadUtils {
	BufferedReader buffer;

	public List<String> readAllLines() {
		List<String> lines = new ArrayList<String>();
		String line = "";
		while (line != null) {
			try {
				line = buffer.readLine();
				if (line == null) {
					break;
				}
				lines.add(line);

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		return lines;
	}

	public void openFile(String filePath) {
		try {
			this.buffer = new BufferedReader(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			System.out.println("Could not Read file " + filePath);
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			this.buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
