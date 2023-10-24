//class name where data is stored
public class Policy {

   private int number; //policy number
   private String provider; //provider name
   
   //arg constructor
   //@param number = policy number; @param provider = provider name;
   public Policy(int number, String provider) {
      this.number = number;
      this.provider = provider;
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
  
}