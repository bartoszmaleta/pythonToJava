package runestoneAcademyTutorial;
import java.util.ArrayList;

// PYTHON
// for i in range(10):
//    print(i)
// ----------------------------------------
// range(stop)
// range(start,stop)
// range(start,stop,step)

public class loopsAndIterationInJavaVsPython {
    public static void main(String[] args) {
        
        // ---------------------------------------- FOR LOOPS

        // for (start clause; stop clause; step clause) { }
        for (Integer i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (Integer i = 100; i >= 0; i -= 5) {
            System.out.println(i);
        }
        
        System.out.println();

        // PYTHON
        // l = [1, 1, 2, 3, 5, 8, 13, 21]
        // for fib in l:
        //    print(fib)

        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        listNumbers.add(1); 
        listNumbers.add(1); 
        listNumbers.add(2); 
        listNumbers.add(3);

        for (Integer num : listNumbers) {
            System.out.println(num);
        }

        System.out.println();

        // This example stretches the imagination a bit, and in fact points 
        // out one area where Java’ s primitive arrays are easier to use 
        // than an array list. In fact all primitive arrays can be used in a for each loop.

        int listNums[] = {1,1,2,3,5,8,13,21};
        for(int i : listNums) {
            System.out.println(i);
        }

        System.out.println();


        String text = "Hello World";
        for (char c : text.toCharArray()) {
            System.out.println(c);
        }

        // ---------------------------------------- WHILE LOOPS
        // Java adds an additional, if seldom used variation of the while loop called the do loop. 
        // The do loop is very similar to while except that the condition is evaluated at the end of the loop 
        // rather than the beginning. This ensures that a loop will be executed at least one time. 
        // Some programmers prefer this loop in some situations because it avoids an additional 
        // assignment prior to the loop. For example:

        // do {
            // statement1
            // statement2
            // ...
        // } while (condition);
        
    }
}