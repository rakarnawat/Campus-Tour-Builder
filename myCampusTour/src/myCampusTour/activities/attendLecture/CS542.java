package myCampusTour.activities.attendLecture;

import myCampusTour.builderWorkshop.Builder;
import myCampusTour.myTour.CarbonFootprintI;
import myCampusTour.myTour.CostI;
import myCampusTour.myTour.DurationI;
import myCampusTour.myTour.EffortI;
import myCampusTour.util.MyLogger;

public class CS542 implements AttendLectureI, CarbonFootprintI, CostI, EffortI, DurationI{

    private int calories = 2;
    private int CO2 = 23;
    private int minutes = 60;
    private double USD = 30.00;


    /**
     * Constructor of CS542 class
     */
    public CS542() {
        MyLogger.writeMessage("Lecture: CS542 - CS542 class Constructor", MyLogger.DebugLevel.CONSTRUCTOR);
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
    public String selectLectureResults() {
        String output = "NULL";
        try {
            //estimateCalculator(int caloriesIn, int CO2In, int minutesIn, double USDIn)
            Builder.results.estimateCalculator(calories,CO2,minutes,USD);
            output = "Attend Lecture CS542\n----------------------------------------\n" + 
            "Duration : " + getDuration() + " minutes." + "\nCost : $" + getCost() +
            "\nEffort : " + getEffort() + " cal." + "\nCarbon-Footprint : " + getCarbonFootprint() +" CO2" +"\n";
            
        } catch (Exception e) {
            System.err.println("\nError from CS542.java\n------------------------\n");
            e.printStackTrace();
        }

        return output;
    }
    
    public String toString(){
        return "Attend Lecture CS542";
    }

}