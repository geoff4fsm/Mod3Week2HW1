package W2HW1;
import java.util.Scanner;

public class CreateComputer {

    public static void main(String[] args) {
        String compName = null;
        int compYear = 0;
        double compCost = 0;

        Computer c1 = new Computer(compName, compYear, compCost);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Computer Name: ");
        compName = input.nextLine();
        c1.setCompName(compName);

        System.out.println("Enter Computer Year: ");
        compYear = input.nextInt();
        c1.setCompYear(compYear);

        System.out.println("Enter Computer Cost: ");
        compCost = input.nextDouble();
        c1.setCompCost(compCost);

        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("-  Computer Name: " + c1.getCompName());
        System.out.println("-  Computer Year: " + c1.getCompYear());
        System.out.println("-  Computer Cost: " + c1.getCompCost());
        System.out.println("+++++++++++++++++++++++++++++");

    }
}
