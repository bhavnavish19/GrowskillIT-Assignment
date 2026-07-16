package weeklyAsssignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class Assignment10_FileReading {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		
		FileReader fr = new FileReader("C:\\GitPractise\\file.txt");
		BufferedReader br  = new BufferedReader(fr);
		
		String line;
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		String longestWord = " ";
				
		
		while((line = br.readLine())!= null) {
			
			lineCount ++;
			
			//Read line 
			
		charCount += line.length();
			
		String words[] = line.split("\\s+");
		
		wordCount += words.length;
		
		
		for(String word:words) {
			if(word.length() >= longestWord.length()) {
				longestWord = word;
				
			}
			
				
		}
		}
		
		
		br.close();
		fr.close();
		
		
		System.out.println("Total line:"+ lineCount);
		System.out.println("Total words:"+ wordCount);
		System.out.println("Total characters::"+ charCount);
		System.out.println("longestwords:"+ longestWord);
		
		}
	
	catch(Exception e) {
		
		System.out.println(e);
	}

	}

}
