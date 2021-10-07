package W2HW1;
import java.util.*;

public class CreateComputer {

    public static void main(String[] args) {
        // define variables
        String compName = null;
        int compYear = 0;
        double compCost = 0;
        String ans1;
        int ans2;

        Scanner input = new Scanner(System.in);
        // user input for adding a computer to computer array
        System.out.println("Would you like to add a computer? yes or no ");
        ans1 = input.nextLine();

        if ( ans1.equals("yes")) {
            // user input for number of computers to add
            System.out.println("How many would you like to add? ");
            ans2 = input.nextInt();

            // define number of computers to add to array
            Computer[] compArray = new Computer[ans2];

            // loop for each computer to add to array
            for (int i = 0 ; i < ans2 ; i++) {

                // define computer array with parameters
                compArray[i] = new Computer(compName, compYear, compCost);

                // user inputs computer name
                System.out.println("Enter Computer Name: ");
                input.nextLine();
                compName = input.nextLine();

                // set name to array
                compArray[i].setCompName(compName);

                // user inputs computer year
                System.out.println("Enter Computer Year: ");
                compYear = input.nextInt();

                // set year to array
                compArray[i].setCompYear(compYear);

                // user inputs computer cost
                System.out.println("Enter Computer Cost: ");
                compCost = input.nextDouble();
                // set cost to array
                compArray[i].setCompCost(compCost);
            }
            // loop to print each computer user enters
            for (int i = 0; i < ans2; i++) {
                System.out.println("++++++++++++++++++++++++++++++");
                System.out.println("-  Computer Name: " + compArray[i].getCompName());
                System.out.println("-  Computer Year: " + compArray[i].getCompYear());
                System.out.printf("-  Computer Cost: $ " + "%.2f", compArray[i].getCompCost());
                System.out.println();
                System.out.println("++++++++++++++++++++++++++++++");
            }
        } else System.out.println("Have a good day");
    }
}
