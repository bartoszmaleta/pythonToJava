package runestoneAcademyTutorial;

// grade = int(input('enter a grade'))
// if grade < 60:
    // print('F')
// elif grade < 70:
    // print('D')
// elif grade < 80:
    // print('C')
// elif grade < 90:
    // print('B')
// else:
    // print('A')


public class conditionalsInJavaVsPython {
    public static void main(String[] args) {
        int grade = 85;

        System.out.println();
        // FIRST OPTION
        if (grade < 60) {
            System.out.println("F");
        } else {
            if (grade < 70) {
                System.out.println("F");
            } else {
                if (grade < 80) {
                    System.out.println("F");
                } else {
                    if (grade < 90) {
                        System.out.println("F");
                    } else {
                        System.out.println("F");
                    }
                }
            }
        }

        System.out.println();
        // SECOND OPTION
        if (grade < 60) {
            System.out.println("F");
        }   else if (grade < 70) {
            System.out.println("D");
        }   else if (grade < 80) {
            System.out.println("C");
        }   else if (grade < 90) {
            System.out.println('B');
        }   else {
            System.out.println("A");
        }

        System.out.println();
        // THIRD OPTION

        int tempgrade = grade / 10;
        switch(tempgrade) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }

        System.out.println();
    }
}