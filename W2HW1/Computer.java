package W2HW1;

public class Computer {
    private String compName;
    private int compYear;
    private double compCost;

    public Computer( String comp, int compYear, double compCost) {
        this.compName = compName;
        this.compYear = compYear;
        this.compCost = compCost;
    }

    public String getCompName() {
        return compName;
    }
    public void setCompName( String compName ) {
        this.compName = compName;
    }
    public int getCompYear() {
        return compYear;
    }
    public void setCompYear( int compYear ) {
        this.compYear = compYear;
    }
    public double getCompCost() {
        return compCost;
    }
    public void setCompCost( double compCost ) {
        this.compCost = compCost;
    }
}
