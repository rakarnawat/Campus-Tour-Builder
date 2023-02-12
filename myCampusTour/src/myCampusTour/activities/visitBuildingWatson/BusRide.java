package myCampusTour.activities.visitBuildingWatson;

import myCampusTour.builderWorkshop.Builder;
import myCampusTour.myTour.CarbonFootprintI;
import myCampusTour.myTour.CostI;
import myCampusTour.myTour.DurationI;
import myCampusTour.myTour.EffortI;
import myCampusTour.util.MyLogger;

public class BusRide implements VisitBuildingWatsonI, CarbonFootprintI, CostI, EffortI, DurationI{

    private int calories = 24;
    private int CO2 = 26;
    private int minutes = 8;
    private double USD = 3.00;

    /**
     * Constructor of BusRide class
     */
    public BusRide() {
        MyLogger.writeMessage("Building: Watson - BusRide class Constructor", MyLogger.DebugLevel.CONSTRUCTOR);
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
    public String VisitBuildingWatsonResults() {
        String output = "NULL";
        try {
            //estimateCalculator(int caloriesIn, int CO2In, int minutesIn, double USDIn)
            Builder.results.estimateCalculator(calories,CO2,minutes,USD);
            output = "by bus-ride\n----------------------------------------\n" + 
                "Duration : " + getDuration() + " minutes." + "\nCost : $" + getCost() +
                "\nEffort : " + getEffort() + " cal." + "\nCarbon-Footprint : " + getCarbonFootprint() +" CO2" +"\n";
                
            } catch (Exception e) {
                //System.err.println("\nError from BusRide.java\n------------------------\n");
                //logWriter.write("Error from BusRide.java");
                MyLogger.writeMessage("Error from BusRide.java", MyLogger.DebugLevel.ERROR);
                //e.printStackTrace();
            }finally{}

        return output;
    }
    
    public String toString(){
        return "watson Building Bus Tour";
    }
    
}
