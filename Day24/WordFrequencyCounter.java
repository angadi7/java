package com.Day25;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

public static void main(String[] args) {

String inputFilePath = "Rufthan.txt";

String outputFilePath = " word_frequencies.txt";

Map<String, Integer> wordCountMap = new HashMap<>();

try (BufferedReader br = new BufferedReader(new FileReader (inputFilePath))) {

String line;

while ((line = br.readLine()) != null) {

String[] words=line.split("\\W+");

for (String word :words) { if (!word.isEmpty()) {

word= word.toLowerCase(); // Convert to lower case for uniformity

wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);

}

}

}

} catch (IOException e) {

e.printStackTrace();

}

try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) { for (Map. Entry<String, Integer> entry: wordCountMap.entrySet()) { bw.write(entry.getKey() + ":" + entry.getValue()); bw.newLine();

} } catch (IOException e) {
	
	e.printStackTrace();

	}

	try (BufferedWriter bw = new BufferedWriter(new FileWriter (outputFilePath))) { 
		for (Map. Entry<String, Integer> entry :wordCountMap.entrySet()) {
			bw.write(entry.getKey() + ":" + entry.getValue());

	bw.newLine();

	}

	} catch (IOException e) {

	e.printStackTrace();

	}



{

	System.out.println("Word frequencies have been written to " + outputFilePath);
}}}
