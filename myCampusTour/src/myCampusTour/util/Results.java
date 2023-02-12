package myCampusTour.util;

import java.text.DecimalFormat;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	 
    public int calories = 0;
    public int CO2 = 0;
    public int minutes = 0;
    public double USD = 0.00;

    public Results() {
        MyLogger.writeMessage("Results class Constructor", MyLogger.DebugLevel.CONSTRUCTOR);
    }

    public void estimateCalculator(int caloriesIn, int CO2In, int minutesIn, double USDIn){
        calories+=caloriesIn;
        CO2+=CO2In;
        minutes+=minutesIn;
        USD+=USDIn;
    }

    public String printTotal(){
        DecimalFormat df2 = new DecimalFormat("0.##");
        String output = "----------------------------------------\nTotal\n----------------------------------------\n"
        + "Total Duration : " + minutes + " minutes." + 
        "\nTotal Cost : $" + df2.format(USD) + "\nTotal Effort : " + calories + 
        " cal." + "\nTotal Carbon-Footprint : " + CO2 +" CO2";

        // System.out.println("\n Results: \n");
        // System.out.println(output);
        return output;
    }

    public String toString(){
        return "Results";
    }
}
