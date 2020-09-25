import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        double taxRate;
        int numBoards;
        int numWindows;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales tax rate: ");
        taxRate = scanner.nextDouble();
        System.out.println("How many boards do you need? ");
        numBoards = scanner.nextInt();
        System.out.println("How many windows do you need? ");
        numWindows = scanner.nextInt();
        
        Constuction myConstruction = new Construction(8.0, 11.0, taxRate);
        
    }
}
