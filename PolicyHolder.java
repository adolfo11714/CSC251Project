public class PolicyHolder {
   private int age; //policy number, policyholders age
   private String fname, lname, smokingStatus; //provider name, first name, last name, smoking status
   private double height, weight; //height(in inches), weight(in pounds)
   private static int policyCount = 0; //accumulator for how many policy objects there are
   
   //@param age = age; @param fname = first name; @param lname = last name
   //@param smokingStatus = policyholder smoking status; @param height = height in inches of policyholder; @param weight = weight in pounds of policyholder
   public PolicyHolder(int age, String fname, String lname, String smokingStatus, double height, double weight) {
      this.age = age;
      this.fname = fname;
      this.lname = lname;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   public PolicyHolder() {
      policyCount++;
   }
   
   //setters
   public void setAge(int age) {
      this.age = age;
   }
   
   public void setFname(String fname) {
      this.fname = fname;
   }
   
   public void setLname(String lname) {
      this.lname = lname;
   }
   
   public void setSmokingStatus(String smokingStatus) {
      this.smokingStatus = smokingStatus;
   }
   
   public void setHeight(double height) {
      this.height = height;
   }
   
   public void setWeight(double weight) {
      this.weight = weight;
   }
   
   //getters
   //@returns policyholders age
   public int getAge() {
      return this.age;
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
   
   //@returns how many times the policy object was called
   public int getPolicyCount() {
      return policyCount;
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
        
   public String toString() {
      return "Policyholder's first name: " + fname + "\nPolicyholder's last name: " + 
             lname + "\nPolicyholder's Age: " + age + "\nPolicyholder's Smoking Status: " +
             smokingStatus + "\nPolicyholder's Height: " + height + "\nPolicyholder's weight: "
             + weight + "\nPolicyholder's BMI: " + getBmi() + "\nPolicy Price: " + insuranceCost();
   }
}