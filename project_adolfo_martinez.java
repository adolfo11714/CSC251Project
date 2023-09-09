import java.util.Scanner; //importing Scanner for user input

public class project_adolfo_martinez {
   public static void main(String[] args) {
   
      int number, age; //policy number, policyholders age
      String provider, fname, lname, smokingStatus; //provider name, first name, last name, smoking status
      double height, weight; //height(in inches), weight(in pounds)

      //user input
      Scanner keyboard = new Scanner(System.in); //initializing scanner
      System.out.print("Please enter the Policy Number: ");
      number = keyboard.nextInt();
      keyboard.nextLine(); //input buffer
      
      System.out.print("Please enter the Provider Name: ");
      provider = keyboard.nextLine(); //setting provider name
      
      System.out.print("Please enter the Policyholder's First Name: ");
      fname = keyboard.nextLine(); //setting first name
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lname = keyboard.nextLine(); //setting last name
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt(); //setting age
      keyboard.nextLine(); //input buffer
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine(); //setting smoking status
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble(); //setting height
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble(); //setting weight

      
      Policy p = new Policy(number, age, provider, fname, lname, smokingStatus, height, weight); //initializing policy class to access its data (getters)
      
      System.out.println("-------------------------------------------------------"); //separator for the program to look more spaced out and neater
      
      p.displayUser(); //displays the info the user input into the program (output)
   }
}