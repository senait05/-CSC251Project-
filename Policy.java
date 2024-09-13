//Policy class
class Policy {
    // Attributes
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String smokingStatus; // "smoker" or "non-smoker"
    private double policyHolderHeight; // in inches
    private double policyHolderWeight; // in pounds

    // No-arg constructor (default values)
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "";
        this.policyHolderFirstName = "";
        this.policyHolderLastName = "";
        this.policyHolderAge = 0;
        this.smokingStatus = "non-smoker";
        this.policyHolderHeight = 0.0;
        this.policyHolderWeight = 0.0;
    }

    // Constructor with arguments
    public Policy(int policyNumber, String providerName, String policyHolderFirstName, String policyHolderLastName,
                  int policyHolderAge, String smokingStatus, double policyHolderHeight, double policyHolderWeight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolderFirstName = policyHolderFirstName;
        this.policyHolderLastName = policyHolderLastName;
        this.policyHolderAge = policyHolderAge;
        this.smokingStatus = smokingStatus;
        this.policyHolderHeight = policyHolderHeight;
        this.policyHolderWeight = policyHolderWeight;
    }

    // Setters and Getters
    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
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

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
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

    // Method to calculate BMI
    public double calculateBMI() {
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
    }

    // Method to calculate policy price
    public double calculatePolicyPrice() {
        double baseFee = 600.0;
        double additionalFee = 0.0;

        // Additional fee if the policyholder is over 50
        if (policyHolderAge > 50) {
            additionalFee += 75.0;
        }

        // Additional fee if the policyholder is a smoker
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            additionalFee += 100.0;
        }

        // Additional fee if BMI is over 35
        double bmi = calculateBMI();
        if (bmi > 35) {
            additionalFee += (bmi - 35) * 20;
        }

        return baseFee + additionalFee;
    }
}