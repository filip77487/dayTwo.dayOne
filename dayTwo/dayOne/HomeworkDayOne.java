package dayTwo.dayOne;

import java.io.File;
import java.io.IOException;

public class HomeworkDayOne {

	public static void main(String[] args) {
		File currentDir = new File(".");
		displayDirectoryContents(currentDir);
	}

	private static void displayDirectoryContents(File dir) {
		try {
			File[] fiels = dir.listFiles();
			for (File file : fiels) {
				if(file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath());
					displayDirectoryContents(file);
				}else {
					System.out.println("  file:" + file.getCanonicalPath());
				}
				
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
