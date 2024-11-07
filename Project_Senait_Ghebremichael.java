

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Senait_Ghebremichael {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        // Reading the policies from PolicyInformation.txt
        try {
            File file = new File("PolicyInformation.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String policyNumber = scanner.nextLine();
                String providerName = scanner.nextLine();
                String firstName = scanner.nextLine();
                String lastName = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                String smokingStatus = scanner.nextLine();
                double height = Double.parseDouble(scanner.nextLine());
                double weight = Double.parseDouble(scanner.nextLine());

                // Create PolicyHolder and  Policy object and add to the list
                PolicyHolder policyHolder = new PolicyHolder(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                Policy policy = new Policy(policyNumber, providerName, policyHolder, calculatePolicyPrice(policyHolder));
                policies.add(policy);

                // Count smokers and non-smokers
                if (policyHolder.isSmoker()) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        }

        // Displaying all policy details
        for (Policy policy : policies) {
            System.out.println(policy);
            System.out.println();
        }

        // Display the number of smokers and non-smokers and Policy Objects
        System.out.println("There are: " + Policy.getPolicyCount()+" Policy Objects Created");
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
        }
        
            /**
     * Calculate the policy price based on policyholder details.
     * @param policyHolder The policyholder associated with the policy
     * @return The calculated policy price
     */
    public static double calculatePolicyPrice(PolicyHolder policyHolder) {
        double basePrice = 600;
        if (policyHolder.isSmoker()) {
            basePrice += 100;
        }
        if (policyHolder.calculateBMI() > 25) {
            basePrice += 75;
        }
        return basePrice;
    }
}