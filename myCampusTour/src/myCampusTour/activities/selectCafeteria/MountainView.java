package myCampusTour.activities.selectCafeteria;

import java.text.DecimalFormat;

import myCampusTour.builderWorkshop.Builder;
import myCampusTour.myTour.CarbonFootprintI;
import myCampusTour.myTour.CostI;
import myCampusTour.myTour.DurationI;
import myCampusTour.myTour.EffortI;
import myCampusTour.util.MyLogger;

public class MountainView implements SelectCafeteriaI, EffortI, CarbonFootprintI, DurationI, CostI  {
    private int calories = 12;
    private int CO2 = 4;
    private int minutes = 25;
    
    CIW ciw = new CIW();
    private double USD = ciw.getCost() + ciw.getCost()*0.05;
    
    /**
     * Constructor of MountainView class
     */
    public MountainView() {
        MyLogger.writeMessage("Cafeteria: Mountain View - MountainView class Constructor", MyLogger.DebugLevel.CONSTRUCTOR);
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
        //USD = ciw.getCost();
        //System.out.println(USD);
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
            Builder.results.estimateCalculator(calories,CO2,minutes,USD );
            DecimalFormat df2 = new DecimalFormat("0.##");
            output = "Mountain View Cafeteria\n----------------------------------------\n" + 
            "Duration : " + getDuration() + " minutes." + "\nCost : $" + df2.format(getCost()) +
            "\nEffort : " + getEffort() + " cal." + "\nCarbon-Footprint : " + getCarbonFootprint() +" CO2" +"\n";
            
        } catch (Exception e) {
            System.err.println("\nError from MountainView.java\n------------------------\n");
            e.printStackTrace();
        }

        // System.out.println("\n Mountain View Results: \n");
        // System.out.println(output);

        return output;
    }
    
    public String toString(){
        return "Mountain View Cafeteria";
    }

}
