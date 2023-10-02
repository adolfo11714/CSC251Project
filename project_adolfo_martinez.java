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
         
         
         Policy p = new Policy(number, provider, fname, lname, age, smokingStatus, height, weight); //policy class constructor to put into arraylist
         
         policies.add(p); //adds policyholders information in an arraylist
      } //closed loop
      
      inputFile.close(); //closes file

      //loop to display info of arraylist to the user of all the policies in the text file
      for (int i = 0; i < policies.size(); i++) { //open loop
         System.out.println("Policy Number: " + policies.get(i).getNumber());
         System.out.println("Provider Name: " + policies.get(i).getProvider());
         System.out.println("Policyholder's First Name: " + policies.get(i).getFname());
         System.out.println("Policyholder's Last Name: " + policies.get(i).getLname());
         System.out.println("Policyholder's Age: " + policies.get(i).getAge());
         System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
         System.out.println("Policyholder's Height: " + policies.get(i).getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policies.get(i).getWeight() + " pounds");
         System.out.println("Policyholder's BMI: " + String.format("%.2f", policies.get(i).getBmi()) );
         System.out.println("Policy Price: " + String.format("$%,.2f", policies.get(i).insuranceCost()) );
         System.out.println();
         
     } //close loop
      
      
   }
}