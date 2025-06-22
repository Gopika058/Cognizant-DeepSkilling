public class FinancialForecasting {

    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue; 
        }
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static double calculateFutureValueMemo(double currentValue, double growthRate, int years, Double[] memo) {
        if (years == 0) return currentValue;
        if (memo[years] != null) return memo[years];
        memo[years] = calculateFutureValueMemo(currentValue * (1 + growthRate), growthRate, years - 1, memo);
        return memo[years];
    }

    public static void main(String[] args) {

        double startingAmount = 10000.0;      
        double annualGrowthRate = 0.08;        
        int numberOfYears = 5;                  

       
        double futureValue = calculateFutureValue(startingAmount, annualGrowthRate, numberOfYears);
        System.out.printf("Predicted Future Value (Recursive): ₹%.2f\n", futureValue);

    
        Double[] memo = new Double[numberOfYears + 1];
        double futureValueMemo = calculateFutureValueMemo(startingAmount, annualGrowthRate, numberOfYears, memo);
        System.out.printf("Predicted Future Value (Memoized): ₹%.2f\n", futureValueMemo);

        System.out.println("\n--- Time Complexity Analysis ---");
        System.out.println("Recursive Approach: O(n) - one call per year.");
        System.out.println("Memoized Approach: O(n) - avoids duplicate calculations by storing results.");

        System.out.println("\n--- Recommendation ---");
        System.out.println("Recursion is simple and works well for small datasets.");
        System.out.println("Use memoization or iteration for large inputs to improve efficiency.");
    }
}