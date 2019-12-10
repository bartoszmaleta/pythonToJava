package runestoneAcademyTutorial;

import javax.swing.*;

public class tempConvDialog {
    public static void main(String[] args) {
        String fahrString;
        Double fahr, cel;

        fahrString = JOptionPane.showInputDialog("Enter the temperature in F ");
        // fahr = new Double(fahrString);      // old version
        fahr = Double.valueOf(fahrString);

        cel = (fahr - 32) * 5.0 / 9.0;

        JOptionPane.showMessageDialog(null, "The temperaure in Celsius is: " + cel);
    }
}