package myCampusTour.builderWorkshop;

import myCampusTour.util.MyLogger;

public class TourBuilder implements BuilderWorkshopI{
    @Override
    public void createBuilder(BuilderI builderI) {
        try {
            builderI.buildBuildingSOM();
            builderI.buildBuildingWatson();
            builderI.buildGiftLocation();
            builderI.buildCafetaria();
            builderI.buildLecture();
        } catch (Exception e) {
            System.err.println("\nError in TourBuilder.java\n----------------------\n");
            MyLogger.writeMessage("Error in TourBuilder.java", MyLogger.DebugLevel.ERROR);
            e.printStackTrace();
        }finally{}
    }

    public String toString(){
        return "Integrate builder activities.";
    }
    
}
