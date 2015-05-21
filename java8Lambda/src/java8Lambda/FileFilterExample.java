package java8Lambda;

import java.io.File;
import java.io.FileFilter;

public class FileFilterExample {

	public static void main(String[] args) {

		FileFilter textFileFilter = new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".txt");
			}

		};

		File directory = new File("C:\\Users\\Aditya\\Desktop");

		for (File file : directory.listFiles(textFileFilter)) {
			System.out.println(file.getAbsolutePath());
		}
	}

}
