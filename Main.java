import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;






public class Main {

    // Creating the genUniqueID method
    private static String genUniqueID(String theSpecies, int numOfSpecies) {
        String prefix = "";
        int suffix = numOfSpecies + 1;


        if (theSpecies.contains("hyena")) {
            prefix = "Hy";
        }

        return prefix + Integer.valueOf(suffix);

    }


    public static void main(String[] args) {

        System.out.println("\n\n Welcome to my Zoo Program\n\n");

        // Load all species classes with name.
        // Call the static methods to create a lists of names.
        Lion.inputLionNames();
        Tiger.inputTigerNames();
        Bear.inputBearNames();
        Hyena.inputHyenaNames();



        // Open a csv file using the split() method on a string object
        String path = "C:\\Users\\Heng\\OneDrive\\Documents\\Fresno City College\\Fall '23\\CIT-63-16266 - Mohle, Dennis\\IdeaProjects\\arrivingAnimals.txt";
        String myFileLine = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            int myCounter = 1;
            while ((myFileLine = reader.readLine()) != null) {
                // The input data from arrivingAnimals looks like this:
                // 4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia

                // Create a String array named myArrayOfAnimalData
                String[] myArrayOfAnimalData = myFileLine.split(",");

                // Create another String array named
                String[] myArrayOfAgeGenderSpecies = myArrayOfAnimalData[0].split(" ");

                // Output the age, gender and species

                System.out.println("\n age in years: " + myArrayOfAgeGenderSpecies[0]);
                System.out.println("\n text for age (should be 'year') " + myArrayOfAgeGenderSpecies[1]);
                System.out.println("\n text for age (should be 'old') " + myArrayOfAgeGenderSpecies[2]);
                System.out.println("\n gender is " + myArrayOfAgeGenderSpecies[3]);
                System.out.println("\n species is " + myArrayOfAgeGenderSpecies[4]);


                // Code up the birthDate() method

                // Get today's date:
                Calendar calendar = Calendar.getInstance();
                Date today = calendar.getTime();

                // Get today's date
                LocalDate currentDate = LocalDate.now();
                int year = currentDate.getYear();

                // Print the year
                System.out.println("Current Year: " + year);

                int animalsYearOfBirthDate = year - Integer.parseInt(myArrayOfAgeGenderSpecies[0]);

                // Split the next group of words by a space.
                String[] myArrayOfBirthSeason = myArrayOfAnimalData[1].split(" ");

                String birthSeason = myArrayOfBirthSeason[3];
                System.out.println(" \n birthSeason = " + birthSeason + "\n\n");

                String myAnimalBD = " ";

                // Calculate the animal's birthday based on the birth season
                if (birthSeason.contains("spring")) {
                    myAnimalBD = "Mar 21, " + animalsYearOfBirthDate;
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
                    LocalDate localDateAnimalBirthday = LocalDate.parse("Mar 21, 2017", formatter);
                    System.out.println("Animal birthday: " +localDateAnimalBirthday);
                    long animalAgeInYears = ChronoUnit.YEARS.between(localDateAnimalBirthday, currentDate);
                    System.out.println("Animal birth date is: "+ myAnimalBD +"\n\n");
                    System.out.println("\nAninal age in years is: "+ animalAgeInYears + "\n\n");



                }
                else if (birthSeason.contains("summer")) {
                    myAnimalBD = "Jun 21, " + animalsYearOfBirthDate;
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
                    LocalDate localDateAnimalBirthday = LocalDate.parse("Mar 21, 2017", formatter);
                    System.out.println("Animal birthday: " +localDateAnimalBirthday);
                    long animalAgeInYears = ChronoUnit.YEARS.between(localDateAnimalBirthday, currentDate);
                    System.out.println("Animal birth date is: "+ myAnimalBD +"\n\n");
                    System.out.println("\nAninal age in years is: "+ animalAgeInYears + "\n\n");
                }
                else if (birthSeason.contains("fall")) {
                    myAnimalBD = "Sept 21, " + animalsYearOfBirthDate;
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
                    LocalDate localDateAnimalBirthday = LocalDate.parse("Mar 21, 2017", formatter);
                    System.out.println("Animal birthday: " +localDateAnimalBirthday);
                    long animalAgeInYears = ChronoUnit.YEARS.between(localDateAnimalBirthday, currentDate);
                    System.out.println("Animal birth date is: "+ myAnimalBD +"\n\n");
                    System.out.println("\nAninal age in years is: "+ animalAgeInYears + "\n\n");
                }
                else if (birthSeason.contains("winter")) {
                    myAnimalBD = "Dec 21, " + animalsYearOfBirthDate;
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
                    LocalDate localDateAnimalBirthday = LocalDate.parse("Mar 21, 2017", formatter);
                    System.out.println("Animal birthday: " +localDateAnimalBirthday);
                    long animalAgeInYears = ChronoUnit.YEARS.between(localDateAnimalBirthday, currentDate);
                    System.out.println("Animal birth date is: "+ myAnimalBD +"\n\n");
                    System.out.println("\nAninal age in years is: "+ animalAgeInYears + "\n\n");
                }
                else if (birthSeason.contains("season")) {
                    myAnimalBD = "Jan 1, " + animalsYearOfBirthDate;
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
                    LocalDate localDateAnimalBirthday = LocalDate.parse("Mar 21, 2017", formatter);
                    System.out.println("Animal birthday: " +localDateAnimalBirthday);
                    long animalAgeInYears = ChronoUnit.YEARS.between(localDateAnimalBirthday, currentDate);
                    System.out.println("Animal birth date is: "+ myAnimalBD +"\n\n");
                    System.out.println("\nAninal age in years is: "+ animalAgeInYears + "\n\n");
                }
                else {
                    myAnimalBD = "unable to process" + animalsYearOfBirthDate;
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
                    LocalDate localDateAnimalBirthday = LocalDate.parse("Mar 21, 2017", formatter);
                    System.out.println("Animal birthday: " +localDateAnimalBirthday);
                    long animalAgeInYears = ChronoUnit.YEARS.between(localDateAnimalBirthday, currentDate);
                    System.out.println("Animal birth date is: "+ myAnimalBD +"\n\n");
                    System.out.println("\nAninal age in years is: "+ animalAgeInYears + "\n\n");
                }

                System.out.println("\n\n Animal birth date is: " + myAnimalBD + "\n\n");

                // Code calculating the animal's age
                // Animal age = now - animal birthdate
                // We must create dateTime objects so we can do math on them

                // 1) Create a dateTime for "Jan 1, 2017"
                // this will be the birthdate
                // LocalDate myDate = LocalDate.of(2017, month, day);

                /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");

                LocalDate myBirthdayTest = LocalDate.parse(myAnimalBD, formatter);

                System.out.println("\n myDate is: " + myBirthdayTest);

                // Calculate animal age using Local date objects.
                LocalDate myNow = LocalDate.now();
                LocalDate myAnimalAge = myBirthdayTest - myNow ;

                System.out.println("\n The animals is: " + myAnimalAge);*/


                // Subtract 4 years
                calendar.add(Calendar.YEAR, - Integer.parseInt(myArrayOfAgeGenderSpecies[0]) );

                // Get the new date after subtraction
                Date yearsAgo = calendar.getTime();



                // Print the original and new dates
                System.out.println("Today's Date: " + today);
                System.out.println("Date " + myArrayOfAgeGenderSpecies[1] + " years ago: " + yearsAgo);




                System.out.println("\n Species is " + myArrayOfAgeGenderSpecies[4]);
                System.out.println("\n Animal Number " + myCounter + " ************");
                System.out.println("\n myArrayOfAnimalData[0] is.. " + myArrayOfAnimalData[0]);
                System.out.println("\n myArrayOfAnimalData[1] is.. " + myArrayOfAnimalData[1]);
                System.out.println("\n myArrayOfAnimalData[2] is.. " + myArrayOfAnimalData[2]);
                System.out.println("\n myArrayOfAnimalData[3] is.. " + myArrayOfAnimalData[3]);
                System.out.println("\n myArrayOfAnimalData[4] is.. " + myArrayOfAnimalData[4]);
                System.out.println("\n myArrayOfAnimalData[5] is.. " + myArrayOfAnimalData[5]);
                System.out.println("\n\n");

                // increment the animal counter
                myCounter++;



                /*
                String myStr = myArray[0];
                System.out.println("\n myStr = " + myStr);
                myArray = myStr.split(" ");
                String mySpecies = myArray[4];
                System.out.println(" Species is: " + mySpecies);
                System.out.println("\n myStr = " + myStr);
*/

/*
                System.out.println(" First element: " + myArray[0]);
                System.out.println(" Second element: " + myArray[1]);
                System.out.println(" Third item: " + myArray[2]);
                System.out.println(" Fourth element: " + myArray[3]);
                System.out.println(" Fifth item: " + myArray[4]);
                System.out.println(" Sixth item: " + myArray[5]);
*/

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }




}