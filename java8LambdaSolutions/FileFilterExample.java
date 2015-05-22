package java8LambdaSolutions;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FileFilterExample {

	public static void main(String[] args) {

		FileFilter textFileFilterLambda = (file) -> file.getName().endsWith(
				".txt");

		File directory = new File("C:\\Users\\paditya\\Desktop");

		Consumer<File> fileNamePrintConsumer = (file) -> System.out
				.println(file.getAbsolutePath());

		List<File> textFiles = Arrays.asList(directory
				.listFiles(textFileFilterLambda));

		textFiles.forEach(fileNamePrintConsumer);
	}
}
