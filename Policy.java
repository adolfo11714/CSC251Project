//class name where data is stored
public class Policy {

   private int number; //policy number
   private String provider; //provider name
   private static int policyCount = 0; //accumulator for how many policy objects there are
   
   //arg constructor
   //@param number = policy number; @param provider = provider name;
   public Policy(int number, String provider) {
      this.number = number;
      this.provider = provider;
   }
   
   //copy constructor
   public Policy(Policy obj) {
      number = obj.number;
      provider = obj.provider;
   }
   
   //counting each time the policy is called
   public Policy() {
      policyCount++;
   }
      
   //getters
   //@returns policy number
   public int getNumber() {
      return this.number;
   }
   
   //@returns insurance provider name
   public String getProvider() {
      return this.provider;
   }
   
   //@returns how many times the policy object was called
   public int getPolicyCount() {
      return policyCount;
   }
   
   public String toString() {
      return "Policy Number: " + number + "\nProvider Name: "
             + provider;
   }
  
}