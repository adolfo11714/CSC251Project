//demo class
import java.util.Scanner;
import java.text.DecimalFormat;

public class Project_Adolfo_Martinez{
   public static void main(String[] args) {
      Policy p = new Policy();
      DecimalFormat x = new DecimalFormat(".00");
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      p.setId(keyboard.nextInt());
      
      p.setProviderName(keyboard.nextLine());
      System.out.print("Please enter the Provider Name: ");
      p.setProviderName(keyboard.nextLine()); 
      
      System.out.print("Please enter the Policyholder's First Name: ");
      p.setFirstName(keyboard.nextLine());
      System.out.print("Please enter the Policyholder's Last Name: ");
      p.setLastName(keyboard.nextLine());
      System.out.print("Please enter the Policyholder's Age: ");
      p.setAge(keyboard.nextInt());
      p.setSmokingStatus(keyboard.nextLine());
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      p.setSmokingStatus(keyboard.nextLine());
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      p.setHeight(keyboard.nextDouble());
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      p.setWeight(keyboard.nextDouble());
      
      System.out.println("Policy Number: " + p.getId());
      System.out.println("Please enter the Provider Name: " + p.getProviderName());
      System.out.println("Policyholder's First Name: " + p.getFirstName());
      System.out.println("Policyholder's Last Name: " + p.getLastName());
      System.out.println("Policyholder's Age: " + p.getAge());
      System.out.println("Policyholder's Smoking Status: " + p.getSmokingStatus());
      System.out.println("Policyholder's Height: " + p.getHeight());
      System.out.println("Policyholder's Weight: " + p.getWeight());
      System.out.println("Policyholder's BMI: " + p.bmi(p.getWeight(), p.getHeight()));
      System.out.println("Policy Price: $" + p.policyFee(p.getAge(), p.getSmokingStatus(), p.bmi(p.getWeight(), p.getHeight())));
      

      
      
      
   }
}