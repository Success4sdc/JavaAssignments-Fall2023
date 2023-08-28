//Filename ChiliToGo.java
//Written by Sandi Cook
//Written on August 26, 2023

public class ChiliToGo {
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

        scanner.close();
    }
}
