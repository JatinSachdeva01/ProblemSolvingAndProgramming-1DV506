package js225cy_assign4;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckingWords {

	public static void main(String[] args) throws IOException {
		String str;
		String word="";
		String Secondword="";
		int countCthulhu=0;
		int countAzathoth=0;
		int countNecronomicon=0;
		int count = 0;
		int maxcount = 0;
		int Secondmaxcount=0;
		int count1=1;
		int countSecond=0;
		long startTime=System.nanoTime();
		ArrayList<String> words = new ArrayList<String>();
		FileReader file = new FileReader("/Users/jatinsachdeva/Desktop/Untitled.txt");
		BufferedReader br=new BufferedReader(file);
		while ((str = br.readLine()) != null) {
			String str1[] = str.toLowerCase().split("([,.\\s]+)");
			for (String s : str1) {
				words.add(s);
			}
		}
		System.out.println("Reading Lovecraft works...");
		System.out.println("Done!");
		System.out.println("Analysing text...");
		
		for (int i = 0; i < words.size(); i++) {//To get the Most occurring word
			count = 1;
			if(words.get(i).equals("cthulhu"))
				countCthulhu++;
			if(words.get(i).equals("azathoth"))
				countAzathoth++;
			if(words.get(i).equals("necronomicon"))
				countNecronomicon++;
			if(count1%50000==0)
				System.out.println("Now at: "+count1);
			count1++;
			for (int j = i + 1; j < words.size(); j++) {
				
				if (words.get(i).equals(words.get(j)))
					count++;
			}
			if (count > maxcount) {
				maxcount = count;
				word = words.get(i);
			}
		}
		for (int i = 0; i < words.size(); i++)//To get the second Most occurring word
		{if(words.get(i).equals(word))
			words.remove(i);
		}
		for (int i = 0; i < words.size(); i++) {
			countSecond = 1;
			
			for (int j = i + 1; j < words.size(); j++) {
				
				if (words.get(i).equals(words.get(j)))
					countSecond++;
			}
			if (countSecond > Secondmaxcount) {
				Secondmaxcount = countSecond;
				Secondword = words.get(i);
			}
		}
		br.close();
		long endTime=System.nanoTime();
		long time=(endTime-startTime)/(int)(6*Math.pow(10, 10));//to get the time in minutes
		System.out.println("Done in "+time+" minutes");
		System.out.println("Most common word: "+word+" "+maxcount+ " occurences");
		System.out.println("Second Most common word: "+Secondword+" "+Secondmaxcount+ " occurences");
		System.out.println("Occurrences of ”Cthulhu”: "+countCthulhu);
		System.out.println("Occurrences of ”Azathoth”: "+countAzathoth);
		System.out.println("Occurrences of ”Necronomicon”: "+countNecronomicon);
	}
}