package myCampusTour.activities.visitBuildingSOM;

import myCampusTour.builderWorkshop.Builder;
import myCampusTour.myTour.CarbonFootprintI;
import myCampusTour.myTour.CostI;
import myCampusTour.myTour.DurationI;
import myCampusTour.myTour.EffortI;
import myCampusTour.util.MyLogger;
import myCampusTour.util.MyLogger.DebugLevel;

public class onFoot implements VisitBuildingSOMI, DurationI, CostI, CarbonFootprintI, EffortI{

    private int calories = 100;
    private int CO2 = 500;
    private int minutes = 50;
    private double USD = 1.00;

    /**
     * Constructor of onFoot class
     */
    public onFoot() {
        MyLogger.writeMessage("Building: SOM - OnFoot class Constructor", MyLogger.DebugLevel.CONSTRUCTOR);
    }

    /**
     * Set methods to set new values
     */
    public void setEffort(int calories) {
        this.calories = calories;
    }

    public void setCarbonFootprint(int CO2) {
        this.CO2 = CO2;
    }

    public void setDuration(int minutes) {
        this.minutes = minutes;
    }

    public void setCost(double USD) {
        this.USD = USD;
    }

    /**
     * Get methods to get the values
     */
    @Override
    public int getEffort() {
        return calories;
    }

    @Override
    public int getCarbonFootprint() {
        return CO2;
    }

    @Override
    public int getDuration() {
        return minutes;
    }

    @Override
    public double getCost() {
        return USD;
    }

    /* 
     * Calculate and return the result in the output string
     */
    @Override
    public String VisitBuildingSOMResults() {
        String output = "NULL";
            try {
                //estimateCalculator(int caloriesIn, int CO2In, int minutesIn, double USDIn)
                Builder.results.estimateCalculator(calories,CO2,minutes, USD);
                output = "on-Foot\n----------------------------------------\n" + 
                "Duration : " + getDuration() + " minutes." + "\nCost : $" + getCost() +
                "\nEffort : " + getEffort() + " cal." + "\nCarbon-Footprint : " + getCarbonFootprint() +" CO2" +"\n";
                
            } catch (Exception e) {
                //System.err.println("\nError from onFoot.java\n------------------------\n");
                MyLogger.writeMessage("Error from onFoot.java", DebugLevel.ERROR);
                //e.printStackTrace();
            }
        // System.out.println("\n on-Foot Results: \n");
        // System.out.println(output);

        return output;
    }
    
    public String toString(){
        return "SOM Building onFoot Tour";
    }

}
