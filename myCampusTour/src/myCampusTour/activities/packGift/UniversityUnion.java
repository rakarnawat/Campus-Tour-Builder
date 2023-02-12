package myCampusTour.activities.packGift;

import myCampusTour.builderWorkshop.Builder;
import myCampusTour.myTour.CarbonFootprintI;
import myCampusTour.myTour.CostI;
import myCampusTour.myTour.DurationI;
import myCampusTour.myTour.EffortI;
import myCampusTour.util.MyLogger;

public class UniversityUnion implements PackGiftI, CarbonFootprintI, CostI, EffortI, DurationI{

    private int calories = 3;
    private int CO2 = 37;
    private int minutes = 17;
    private double USD = 7.99;

    /**
     * Constructor of UniversityUnion class
     */
    public UniversityUnion() {
        MyLogger.writeMessage("Gift: University Union - UniversityUnion class Constructor", MyLogger.DebugLevel.CONSTRUCTOR);
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
    public String selectGiftResults() {
        String output = "NULL";
        try {
            //estimateCalculator(int caloriesIn, int CO2In, int minutesIn, double USDIn)
            Builder.results.estimateCalculator(calories,CO2,minutes,USD);
            output = "Gift pickup from University Union\n----------------------------------------\n" + 
            "Duration : " + getDuration() + " minutes." + "\nCost : $" + getCost() +
            "\nEffort : " + getEffort() + " cal." + "\nCarbon-Footprint : " + getCarbonFootprint() +" CO2" +"\n";
            
        } catch (Exception e) {
            System.err.println("\nError from UniversityUnion.java\n------------------------\n");
            e.printStackTrace();
        }

        return output;
    }
    
    public String toString(){
        return "Gift pickup from University Union";
    }

}
