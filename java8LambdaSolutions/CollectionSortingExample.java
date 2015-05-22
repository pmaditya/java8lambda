package java8LambdaSolutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortingExample {

	public static void main(String[] args) {

		Comparator<String> comparatorLambda = (first, second) -> first.length()
				- second.length();

		List<String> symbolList = Arrays.asList("*", "***", "**");

		Collections.sort(symbolList, comparatorLambda);

		symbolList.forEach(System.out::println);
	}

}
