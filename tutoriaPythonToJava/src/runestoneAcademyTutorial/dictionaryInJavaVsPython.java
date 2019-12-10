package runestoneAcademyTutorial;

// PYTHON VERSION
// --------------------------------------------------------------
// def main():
    // data = open('alice30.txt')
    // wordList = data.read().split()
    // count = {}
    // for w in wordList:
        // w = w.lower()
        // count[w] = count.get(w,0) + 1

    // keyList = sorted(count.keys())
    // for k in keyList:
        // print("%-20s occurred %4d times" % (k, count[k]))

// main()
// --------------------------------------------------------------

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.TreeMap;


public class dictionaryInJavaVsPython {
    public static void main(String[] args) {
        Scanner data = null;
        TreeMap<String, Integer> count;
        Integer idx;
        String word;
        Integer wordCount;

        try {
            data = new Scanner(new File("src/runestoneAcademyTutorial/alice30.txt"));
        }
        catch (IOException e) {
            System.out.println("Sorry but i was unable to open your data file");
            e.printStackTrace();
            System.exit(0);
        }
        count = new TreeMap<String, Integer>();

        while (data.hasNext()) {
            word = data.next().toLowerCase();
            word = word.replace(",", "");
            word = word.replace(".", "");
            word = word.replace(":", "");
            word = word.replace("(", "");
            word = word.replace(")", "");
            word = word.replace("'", "");
            word = word.replace("--but", "");
            word = word.replace("--", "");
            word = word.replace("?", "");
            
            // word = word.replaceAll("[?,')(--but:--.]", "");              // dont work
            
            wordCount = count.get(word);
            if (wordCount == null) {
                wordCount = 0;
            }
            
            count.put(word, ++wordCount);
        }
        
        for (String i : count.keySet()) {
            System.out.printf("%-20s occured %d times\n", i, count.get(i));
        }
    }
}

