/**
 * This class represents an insurance policy.
 */
public class Policy {
   private static int policyCount=0;
   private String policyNumber;
   private String providerName;
   private double policyPrice;
   private PolicyHolder policyHolder;
  
   // constructor
  
   public Policy(String policyNumber, String providerName, PolicyHolder policyHolder, double policyPrice) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        this.policyPrice = policyPrice;
        policyCount++;
    }

    /**
     * Returns the number of policies created.
     * @return Policy count
     */
    public static int getPolicyCount() {
        return policyCount;
    }

    /**
     * Returns a string representation of the policy details.
     */
    @Override
    public String toString() {
        return String.format("Policy Number: %s\n" +
                "Provider Name: %s\n" +
                "%s\n" +
                "Policy Price: $%.2f", 
                policyNumber, providerName, policyHolder, policyPrice);
  
  
  }
  
  }