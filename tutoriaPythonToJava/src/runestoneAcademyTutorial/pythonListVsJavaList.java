// def main():
    // count = [0]*10
    
    // data = [9, 8, 4, 5, 3, 5, 2, 1, 5]

    // for elem in data:
        // count[int(elem)] = count[int(elem)] + 1
    
    // idx = 0
    // for num in count:
        // print(idx, " occured ", num, " times.")
        // idx += 1
      
        
// main()

package runestoneAcademyTutorial;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;


public class pythonListVsJavaList {
    public static void main(String[] args) {
        // ------------------------------- ArrayList version
        System.out.println();
        System.out.println("ArrayList version");
        Scanner data = null;
        ArrayList<Integer> count;
        Integer idx;

        try {
            data = new Scanner(new File("src/runestoneAcademyTutorial/test.dat"));
        }

        catch (IOException e) {
            System.out.println("Sorry but I was unable to open your data file");
            e.printStackTrace();
            System.exit(0);
        }

        count = new ArrayList<Integer>(10);
        for (Integer i = 0; i < 10; i++) {
            count.add(i, 0);
        }
        // for (Integer i = 2; i < 101; i = i + 2)
        // for (Integer i = 1; i < 100; i++)
        // for (Integer i = 100; i > 0; i--)
        // for x,y in zip(range(10),range(0,20,2))     // dont know how
        
        while (data.hasNextInt()) {
            idx = data.nextInt();
            count.set(idx, count.get(idx) + 1);
        }

        idx = 0;
        for (Integer i : count) {
            System.out.println(idx + " occured " + i + " times.");
            idx++;
        }

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("Array version");
    // ------------------------------- Array version
        Scanner data2 = null;
        Integer[] count2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Integer idx2;

        try {
            data2 = new Scanner(new File("src/runestoneAcademyTutorial/test.dat"));
        }
        catch (IOException e) {
            System.out.println("Sorry but I was unable to pen your data file");
            e.printStackTrace();
            System.exit(0);
        }

        while(data.hasNextInt()) {
            idx2 = data2.nextInt();
            count2[idx2] = count2[idx2] + 1;
        }

        idx2 = 0;
        for (Integer i : count2) {
            System.out.println(idx2 + " occured " + i + " times.");
            idx2++;
        }
    }
}

