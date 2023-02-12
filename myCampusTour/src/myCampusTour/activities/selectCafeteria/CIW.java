package myCampusTour.activities.selectCafeteria;

import myCampusTour.builderWorkshop.Builder;
import myCampusTour.myTour.CarbonFootprintI;
import myCampusTour.myTour.CostI;
import myCampusTour.myTour.DurationI;
import myCampusTour.myTour.EffortI;
import myCampusTour.util.MyLogger;

public class CIW implements SelectCafeteriaI, CarbonFootprintI, CostI, EffortI, DurationI{

    private int calories = 25;
    private int CO2 = 3;
    private int minutes = 15;
    private double USD = 9.98;

    /**
     * Constructor of CIW class
     */
    public CIW() {
        MyLogger.writeMessage("Cafeteria: College in Woods (CIW) - CIW class Constructor", MyLogger.DebugLevel.CONSTRUCTOR);
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
    public String selectCafeteriaResults() {
        String output = "NULL";
        try {
            //estimateCalculator(int caloriesIn, int CO2In, int minutesIn, double USDIn)
            Builder.results.estimateCalculator(calories,CO2,minutes,USD);
            output = "College in the Woods (CIW)\n----------------------------------------\n" + 
            "Duration : " + getDuration() + " minutes." + "\nCost : $" + getCost() +
            "\nEffort : " + getEffort() + " cal." + "\nCarbon-Footprint : " + getCarbonFootprint() +" CO2" +"\n";
            
        } catch (Exception e) {
            System.err.println("\nError from CIW.java\n------------------------\n");
            e.printStackTrace();
        }

        // System.out.println("\n Bus-Ride Results: \n");
        // System.out.println(output);

        return output;
    }
    
    public String toString(){
        return "CIW Cafeteria";
    }

}
