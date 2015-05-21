package java8Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortingExample {

	public static void main(String[] args) {
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String first, String second) {
				return first.length() - second.length();
			}
		};

		List<String> symbolList = Arrays.asList("*", "***", "**");

		Collections.sort(symbolList, comparator);

		for (String symbol : symbolList) {
			System.out.println(symbol);
		}
	}

}
