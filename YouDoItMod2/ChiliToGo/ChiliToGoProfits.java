//Filename ChiliToGoProfits.java
//Written by Sandi CookProfits
//Written on August 26, 2023

public class ChiliToGoProfits {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the number of adult meals ordered:");
        int adultMeals = scanner.nextInt();
        System.out.println("Enter the number of child meals ordered:");
        int childMeals = scanner.nextInt();
        int adultTotal = adultMeals * 7;
        int childTotal = childMeals * 4;
        int total = adultTotal + childTotal;
        
        System.out.println("Total money collected for adults’ meals: $" + adultTotal);
        System.out.println("Total money collected for children’s meals: $" + childTotal);
        System.out.println("Total money collected for all meals: $" + total);
        
        double adultProfit = adultTotal - (adultMeals * 4.35);
        double childProfit = childTotal - (childMeals * 3.10);
        double totalProfit = adultProfit + childProfit;
        System.out.printf("Total profit for adults’ meals: $%.2f\n", adultProfit);
        System.out.printf("Total profit for children’s meals: $%.2f\n", childProfit);
        System.out.printf("Grand total profit: $%.2f\n", totalProfit);
        
        scanner.close();
    }
}
