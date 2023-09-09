//class name where data is stored
public class Policy {

   private int number, age; //policy number, policyholders age
   private String provider, fname, lname, smokingStatus; //provider name, first name, last name, smoking status
   private double height, weight; //height(in inches), weight(in pounds)
   
   //arg constructor
   //@param number = policy number; @param age = policyholder age; @param provider = provider name; @param fname = first name; @param lname = last name
   //@param smokingStatus = policyholder smoking status; @param height = height in inches of policyholder; @param weight = weight in pounds of policyholder
   public Policy(int number, int age, String provider, String fname, String lname, String smokingStatus, double height, double weight) {
      this.number = number;
      this.age = age;
      this.provider = provider;
      this.fname = fname;
      this.lname = lname;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   //getters
   //@returns policy number
   public int getNumber() {
      return this.number;
   }
   
   //@returns policyholders age
   public int getAge() {
      return this.age;
   }
   
   //@returns insurance provider name
   public String getProvider() {
      return this.provider;
   }
   
   //@returns policyholder first name
   public String getFname() {
      return this.fname;
   }
   
   //@returns policyholder last name
   public String getLname() {
      return this.lname;
   }
   
   //@returns policyholder smoking status
   public String getSmokingStatus() {
      return this.smokingStatus;
   }
   
   //@returns policyholder height
   public double getHeight() {
      return this.height;
   }
   
   //@returns policyholder weight
   public double getWeight() {
      return this.weight;
   }
   
   //methods
   
   //calculation for BMI
   //@returns BMI
   public double getBmi() {
      double bmi = 0;
      bmi = (getWeight() * 703) / (getHeight() * getHeight());
      
      return bmi;
   }
   
  
    //calculates cost of insurance for user
    //@returns total user policy price regarding their age, smoking status, and bmi
    public double insuranceCost() {
          double total = 0.0;
          
          final double INSURANCE_BASE = 600.00; //@final insurance base cost
          final double AGE_FEE = 75.00; //@final insurance age upcharge for being over 50
          final double SMOKING_FEE = 100.00; //@final insurance smoking upcharge for being a smoker
          final double BMI_FEE = (getBmi() - 35) * 20; //@final insurance upcharge for having bmi over 35
          
          //if all three requirements are met age > 50; a smoker; bmi > 35
          if (getAge() > 50) {
             total = INSURANCE_BASE + AGE_FEE;
             if (getSmokingStatus().equalsIgnoreCase("smoker")) {
                total = INSURANCE_BASE + AGE_FEE + SMOKING_FEE;
                if (getBmi() > 35) {
                   total = INSURANCE_BASE + AGE_FEE + SMOKING_FEE + BMI_FEE;
                }
             }
             //if bmi and smoking status requirement are met
             if (getBmi() > 35) {
               total = INSURANCE_BASE + AGE_FEE + BMI_FEE;
               if (getSmokingStatus().equalsIgnoreCase("smoker")) {
                  total = INSURANCE_BASE + AGE_FEE + SMOKING_FEE + BMI_FEE;
               }
             }
          }
          //if smoking status and bmi requirement are met
          else if (getSmokingStatus().equalsIgnoreCase("smoker")) {
             total = INSURANCE_BASE + SMOKING_FEE;
             if (getBmi() > 35) {
                total = INSURANCE_BASE + SMOKING_FEE + BMI_FEE;
             }
          }
          //if only bmi requirement is met
          else if(getBmi() > 35) {
             total = INSURANCE_BASE + BMI_FEE;
          }
          //if age and bmi requirement is met
          else if(getAge() > 50) {
             total = INSURANCE_BASE + AGE_FEE;
             if (getBmi() > 35) {
                total = INSURANCE_BASE + AGE_FEE + BMI_FEE;
             }
          }
          //if no requirement is met only insurance base is the final price
          else {
            total = INSURANCE_BASE;
          }
                                              
           return total;
        }

   
     
   //method for displaying user input from program
   public void displayUser() {
      System.out.println("Policy Number: " + getNumber());
      System.out.println("Provider Name: " + getProvider());
      System.out.println("Policyholder's First Name: " + getFname());
      System.out.println("Policyholder's Last Name: " + getLname());
      System.out.println("Policyholder's Age: " + getAge());
      System.out.println("Policyholder's Smoking Status: " + getSmokingStatus());
      System.out.println("Policyholder's Height: " + getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + getWeight() + " pounds");
      System.out.println("Policyholder's BMI: " + String.format("%.2f", getBmi()) );
      System.out.println("Policy Price: " + String.format("$%,.2f", insuranceCost()) );
   }
}