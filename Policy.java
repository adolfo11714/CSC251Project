public class Policy {
   private int id;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   private double bmi;

//no arg constructor
public Policy() {
   id = 0000;
   firstName = "first name";
   lastName = "last name";
   age = 0;
   smokingStatus = "A";
   height = 0.0;
   weight = 0.0;
}

//constructor with parameter
public Policy(int id) {
   this.id = id;
}

//id getter and setter
public void setId(int id) {
   this.id = id;
}

public int getId() {
   return this.id;
} 
//first name getter and setter
public void setFirstName(String firstName) {
   this.firstName = firstName;
}

public String getFirstName() {
   return this.firstName;
}
//last name getter and setter
public void setLastName(String lastName) {
   this.lastName = lastName;
}

public String getLastName() {
   return this.lastName;
}
//age getter and setter
public void setAge(int age) {
   this.age = age;
}

public int getAge() {
   return this.age;
}
//weight getter and setter
public void setWeight(double weight) {
   this.weight = weight;
}

public double getWeight() {
   return this.weight;
}
//height getter and setter
public void setHeight(double height) {
   this.height = height;
}

public double getHeight() {
   return this.height;
}
//smoking status getter and setter
public void setSmokingStatus(String smokingStatus) {
   this.smokingStatus = smokingStatus;
}

public String getSmokingStatus() {
   return this.smokingStatus;
}
//provider name getter and setter
public void setProviderName(String providerName) {
   this.providerName = providerName;
}

public String getProviderName() {
   return this.providerName;
}

//bmi scale getter and setter
public void setBmi(double weight, double height) {
   this.bmi = bmi;
}

public double getBmi() {
   return this.bmi = (weight * 703) / (height * height);
}


//method for insurance fee
public static double policyFee(int age, String smokingStatus, double bmi) {
   double insuranceBase;

   insuranceBase = 600;
   
   if (age > 50) {
      insuranceBase += 75;
   }  
   if (smokingStatus.equals("smoker")) {
      insuranceBase += 100;
   }
   if (bmi > 35) {
      insuranceBase += (bmi - 35) * 20;
   }
   return insuranceBase;
}
}

