//new policy holder class

class PolicyHolder{
   private String policyNumber;
   private String providerName;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int policyHolderAge;
   private String policyHolderSmokingStatus; // "smoker" or "non-smoker"
   private double policyHolderHeight; // in inches
   private double policyHolderWeight; // in pounds
   
   
   // No-arg constructor (default values)
   public PolicyHolder() {
      this.policyNumber = "";
      this.providerName = "";
      this.policyHolderFirstName = "";
      this.policyHolderLastName = "";
      this.policyHolderAge = 0;
      this.policyHolderSmokingStatus = "non-smoker";
      this.policyHolderHeight = 0.0;
      this.policyHolderWeight = 0.0;
      }
/**
    * Constructor to initialize the Policy object.
    *
    * @param policyNumber   The policy number.
    * @param providerName   The provider name.
    * @param firstName      The policyholder's first name.
    * @param lastName       The policyholder's last name.
    * @param age            The policyholder's age.
    * @param smokingStatus  The policyholder's smoking status (smoker/non-smoker).
    * @param height         The policyholder's height (in inches).
    * @param weight         The policyholder's weight (in pounds).
    */
   public PolicyHolder(String policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolderFirstName = firstName;
      this.policyHolderLastName = lastName;
      this.policyHolderAge = age;
      this.policyHolderSmokingStatus = smokingStatus;
      this.policyHolderHeight = height;
      this.policyHolderWeight = weight;
      }
    // Setters and Getters
   public String getPolicyNumber() {
      return policyNumber;
      }

   public void setPolicyNumber(String policyNumber) {
      this.policyNumber = policyNumber;
      }

   public String getProviderName() {
      return providerName;
      }

   public void setProviderName(String providerName) {
      this.providerName = providerName;
      }

   public String getPolicyHolderFirstName() {
      return policyHolderFirstName;
      }
   public void setPolicyHolderFirstName(String policyHolderFirstName) {
      this.policyHolderFirstName = policyHolderFirstName;
      }

   public String getPolicyHolderLastName() {
      return policyHolderLastName;
      }

   public void setPolicyHolderLastName(String policyHolderLastName) {
      this.policyHolderLastName = policyHolderLastName;
      }

   public int getPolicyHolderAge() {
      return policyHolderAge;
      }

   public void setPolicyHolderAge(int policyHolderAge) {
      this.policyHolderAge = policyHolderAge;
      }

   public String getPolicyHolderSmokingStatus() {
      return policyHolderSmokingStatus;
      }

   public void setPolicyHolderSmokingStatus(String smokingStatus) {
      this.policyHolderSmokingStatus = smokingStatus;
      }

   public double getPolicyHolderHeight() {
      return policyHolderHeight;
      }

   public void setPolicyHolderHeight(double policyHolderHeight) {
      this.policyHolderHeight = policyHolderHeight;
      }

   public double getPolicyHolderWeight() {
      return policyHolderWeight;
      }

   public void setPolicyHolderWeight(double policyHolderWeight) {
      this.policyHolderWeight = policyHolderWeight;
      }

   

   /**
    * Calculates the BMI (Body Mass Index) of the policyholder.
    *
    * @return the BMI value.
    */
   public double calculateBMI() {
      return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
      }
   /**
    * Calculates the price of the policy.
    *
    * @return the calculated price.
    */
   public double calculatePolicyPrice() {
      double basePrice = 600.00;
      if (policyHolderAge > 50) {
         basePrice += 75.00;
         }
      if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")) {
         basePrice += 100.00;
         }
      if (calculateBMI() > 35) {
         basePrice += (calculateBMI() - 35) * 20;
         }
      return basePrice;
      }

   /**
    * Returns the policy information as a formatted string.
    *
    * @return the policy details string.
    */
   @Override
   public String toString() {
      return "Policy Number: " + policyNumber + "\n" +
            "Provider Name: " + providerName + "\n" +
            "Policyholder's First Name: " + policyHolderFirstName + "\n" +
            "Policyholder's Last Name: " + policyHolderLastName + "\n" +
            "Policyholder's Age: " + policyHolderAge + "\n" +
            "Policyholder's Smoking Status (smoker/non-smoker): " + policyHolderSmokingStatus + "\n" +
            "Policyholder's Height: " + policyHolderHeight + " inches\n" +
            "Policyholder's Weight: " + policyHolderWeight + " pounds\n" +
            String.format("Policyholder's BMI: %.2f\n", calculateBMI()) +
            String.format("Policy Price: $%.2f\n", calculatePolicyPrice());
      }

   /**
    * Checks if the policyholder is a smoker.
    *
    * @return true if the policyholder is a smoker, false otherwise.
    */
   public boolean isSmoker() {
      return policyHolderSmokingStatus.equalsIgnoreCase("smoker");
      }
   }





