import java.util.Scanner; //importing Scanner for user input
import java.io.*; //importing file classes
import java.util.ArrayList; //importing arraylist

public class project_adolfo_martinez {
   public static void main(String[] args) throws IOException {
      
      int smokerCount = 0; //accumalator for smokers
      int nonsmokerCount = 0; //accumalator for nonsmoker
      int number, age; //policy number, policyholders age
      String provider, fname, lname, smokingStatus; //provider name, first name, last name, smoking status
      double height, weight; //height(in inches), weight(in pounds)
      
      //Calling the arraylist and naming it
      ArrayList<Policy> policies = new ArrayList<Policy>(); 
      
      //Calls file that we are reading off of
      File file = new File("PolicyInformation.txt");
      
      /* Checks to see if file does exist, and if file doesn't exist 
         "Unable to open file." is displayed instead and program closes*/
      if (!file.exists()) {
         System.out.println("Unable to open file.");
         System.exit(0);
      }
      
      //Calling scanner to read off of text file
      Scanner inputFile = new Scanner(file);
      
      //loop to read off of the whole text file
      while (inputFile.hasNext()) { //open loop
         
         number = inputFile.nextInt();
         inputFile.nextLine();
         provider = inputFile.nextLine();
         fname = inputFile.nextLine();
         lname = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         //keeps count of every smoker
         if (smokingStatus.equalsIgnoreCase("smoker")) {
            smokerCount ++;
         }
         
         //keeps count of every nonsmoker
         if (smokingStatus.equalsIgnoreCase("non-smoker")) {
            nonsmokerCount++;
         }
         
         if (inputFile.hasNext())
            inputFile.nextLine(); //skips line
         if (inputFile.hasNext())
            inputFile.nextLine(); //skips line for empty spaces below the text file
         
         
          Policy p = new Policy(number, provider);
          PolicyHolder ph = new PolicyHolder(age, fname, lname, smokingStatus, height, weight);
          System.out.println(p);
          System.out.println(ph + "\n");
          
          policies.add(p);
          
      } //closed loop
      
      inputFile.close(); //closes file
      
     System.out.println("There were " + policies.size() + " Policy objects created."); //displays total policy objects
     System.out.println();
     System.out.println("The number of policies with a smoker is: " + smokerCount); //displays total smokers from text file
     System.out.println("The number of policies with a non-smoker is: " + nonsmokerCount); //displays total nonsmokers from text file
      
   }
}