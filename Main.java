import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    // Creating the genUniqueID method

    public static String genUniqueID(String theSpecies, int numOfSpecies) {
        String prefix = "";
        int suffix = numOfSpecies + 1;

        if (theSpecies.contains("hyena")) {
            prefix = "Hy";

        }
        return prefix + Integer.valueOf(suffix);
    }

    public static void main(String[] args) {

        // Load all species classes with name.
        // Call the static method to create a list of names.
        Hyena.inputHyenaNames();
        Lion.inputLionNames();
        Bear.inputBearNames();
        Tiger.inputTigerNames();


        // Open a csv file using the split() method on a string object
        String path = "C:\\Users\\Heng\\OneDrive\\Documents\\Fresno City College\\Fall '23\\CIT-63-16266 - Mohle, Dennis\\IdeaProjects\\arrivingAnimals.txt";
        String myFileLine = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((myFileLine = reader.readLine()) != null) {
                String[] myArray = myFileLine.split(",");

                String myStr = myArray[0];
                System.out.println("\n myStr = " + myStr);
                myArray = myStr.split(" ");
                String mySpecies = myArray[4];
                System.out.println(" Species is: " + mySpecies);
                System.out.println("\n myStr = " + myStr);


                /*
                System.out.println(" First element: " + myArray[0]);
                System.out.println(" Second element: " + myArray[1]);
                System.out.println(" Third item: " + myArray[2]);
                System.out.println(" Fourth element: " + myArray[3]);
                System.out.println(" Fifth item: " + myArray[4]);
                System.out.println(" Sixth item: " + myArray[5]);

                 */
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}