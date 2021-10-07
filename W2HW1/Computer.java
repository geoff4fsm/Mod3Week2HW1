package W2HW1;

public class Computer {

    // private variables defined
    private String compName;
    private int compYear;
    private double compCost;
    // Computer parameterized constructor
    public Computer( String compName, int compYear, double compCost) {
        this.compName = compName;
        this.compYear = compYear;
        this.compCost = compCost;
    }
    // get computer name
    public String getCompName() {
        return compName;
    }
    // set computer name
    public void setCompName( String compName ) {
        this.compName = compName;
    }
    // get computer year
    public int getCompYear() {
        return compYear;
    }
    // set computer year
    public void setCompYear( int compYear ) {
        this.compYear = compYear;
    }
    // get computer cost
    public double getCompCost() {
        return compCost;
    }
    // set computer cost
    public void setCompCost( double compCost ) {
        this.compCost = compCost;
    }
}
