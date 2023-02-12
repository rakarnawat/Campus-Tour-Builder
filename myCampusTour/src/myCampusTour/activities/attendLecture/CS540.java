package myCampusTour.activities.attendLecture;

import java.text.DecimalFormat;

import myCampusTour.builderWorkshop.Builder;
import myCampusTour.myTour.CarbonFootprintI;
import myCampusTour.myTour.CostI;
import myCampusTour.myTour.DurationI;
import myCampusTour.myTour.EffortI;
import myCampusTour.util.MyLogger;

public class CS540 implements AttendLectureI, CarbonFootprintI, CostI, EffortI, DurationI{

    private int calories = 15;
    private int CO2 = 27;
    private int minutes = 90;
    CS542 cs542 = new CS542();
    private double USD = cs542.getCost() + cs542.getCost()*0.10;


    /**
     * Constructor of CS540 class
     */
    public CS540() {
        MyLogger.writeMessage("Lecture: CS540 - CS540 class Constructor", MyLogger.DebugLevel.CONSTRUCTOR);
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
            DecimalFormat df2 = new DecimalFormat("0.##");
            output = "Video-Streaming Lecture CS540\n----------------------------------------\n" + 
            "Duration : " + getDuration() + " minutes." + "\nCost : $" + df2.format(getCost()) +
            "\nEffort : " + getEffort() + " cal." + "\nCarbon-Footprint : " + getCarbonFootprint() +" CO2" +"\n";
            
        } catch (Exception e) {
            System.err.println("\nError from CS540.java\n------------------------\n");
            e.printStackTrace();
        }

        return output;
    }
    
    public String toString(){
        return "Video-Streaming Lecture CS540";
    }

}