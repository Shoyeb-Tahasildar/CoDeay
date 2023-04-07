package com.nice.avishkar;

import java.nio.file.Path;
import java.io.*;
import java.util.*;

public class Solution {

	public ElectionResult execute(Path candidateFile, Path votingFile) throws Exception {
		ElectionResult resultData = new ElectionResult();
		Scanner candidate = new Scanner(new File("resources/candidateFile.csv"));
		Scanner vote = new Scanner(new File("resources/votingFile.csv"));
		candidate.useDelimiter(",");
		while (vote.hasNext()){
			System.out.println(vote.next());
		}
		candidate.close();
		vote.close();
		return resultData;
	}


}