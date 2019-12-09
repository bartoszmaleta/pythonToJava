package runestoneAcademyTutorial;

import java.util.Scanner;

// Python version

// def main():
    // fahr = int(input("Enter the temperature in F: "))
    // cel = (fahr - 32) * 5.0/9.0
    // print("the temperature in C is: ", cel)

// main()


public class temperatureConverter {
    public static void main(String[] args) {
        Double fahr;
        Double cel;
        // java.util.Scanner in;        // it will work, if there is no import!
        Scanner in;

        in = new Scanner(System.in);
        // in = new java.util.Scanner(System.in);         // it will work, if there is no import!
        System.out.println("Enter the temperature in Fahrenheit: ");

        fahr = in.nextDouble();

        cel = (fahr - 32) * 5.0 / 9.0;
        System.out.println("The temperature in C is: " + cel);
        
    }
}