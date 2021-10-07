package W2HW1;
import java.util.*;

public class CreateComputer {

    public static void main(String[] args) {
        String compName = null;
        int compYear = 0;
        double compCost = 0;
        String ans1;
        int ans2;

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add a computer? yes or no ");
        ans1 = input.nextLine();
        if ( ans1.equals("yes")) {
            System.out.println("How many would you like to add? ");
            ans2 = input.nextInt();
            Computer[] compArray = new Computer[ans2];
            for (int i = 0 ; i < ans2 ; i++) {

                compArray[i] = new Computer(compName, compYear, compCost);

                System.out.println("Enter Computer Name: ");
                input.nextLine();
                compName = input.nextLine();
                compArray[i].setCompName(compName);

                System.out.println("Enter Computer Year: ");
                compYear = input.nextInt();
                compArray[i].setCompYear(compYear);

                System.out.println("Enter Computer Cost: ");
                compCost = input.nextDouble();
                compArray[i].setCompCost(compCost);
            }
            for (int i = 0; i < ans2; i++) {
                System.out.println("+++++++++++++++++++++++++++++");
                System.out.println("-  Computer Name: " + compArray[i].getCompName());
                System.out.println("-  Computer Year: " + compArray[i].getCompYear());
                System.out.printf("-  Computer Cost: $ " + "%.2f", compArray[i].getCompCost());
                System.out.println();
                System.out.println("+++++++++++++++++++++++++++++");
            }
        } else System.out.println("Have a good day");
    }
}
