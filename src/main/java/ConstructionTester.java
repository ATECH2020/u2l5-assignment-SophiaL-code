import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        double taxRate;
        int numBoards;
        int numWindows;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sales tax rate: ");
        taxRate = scanner.nextDouble();
        System.out.println("How many boards do you need? ");
        numBoards = scanner.nextInt();
        System.out.println("How many windows do you need? ");
        numWindows = scanner.nextInt();

        Construction myConstruction = new Construction(8.0, 11.0, taxRate);
        double total = myConstruction.lumberCost(numBoards) + myConstruction.windowCost(numWindows);
        double gTotal = myConstruction.grandTotal(total);
        System.out.println("Total: " + total);
        System.out.println("Grand total: " + gTotal);
        
    }
}
