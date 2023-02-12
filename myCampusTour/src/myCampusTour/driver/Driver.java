package myCampusTour.driver;

import java.io.FileWriter;
import java.io.IOException;

import myCampusTour.activities.attendLecture.AttendLectureEnum;
import myCampusTour.activities.packGift.PackGiftEnum;
import myCampusTour.activities.selectCafeteria.SelectCafeteriaEnum;
import myCampusTour.activities.visitBuildingSOM.VisitBuildingSOMEnum;
import myCampusTour.activities.visitBuildingWatson.VisitBuildingWatsonEnum;
import myCampusTour.builderWorkshop.Builder;
import myCampusTour.builderWorkshop.BuilderI;
import myCampusTour.builderWorkshop.BuilderWorkshopI;
import myCampusTour.builderWorkshop.TourBuilder;
import myCampusTour.util.MyLogger;

/**
 * @author placeholder
 *
 */
public class Driver {
	public static void main(String[] args) {
		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

		String errorLogFilePath = args[0];
		try (FileWriter fw = new FileWriter(errorLogFilePath)) {
			try{
				
				if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) {

					System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
					System.exit(0);
				}

				int debugLevel = Integer.parseInt(args[1]);
				MyLogger.setDebugValue(debugLevel);

				BuilderI builderI = new Builder(VisitBuildingSOMEnum.BUS_RIDE, VisitBuildingWatsonEnum.ON_FOOT, PackGiftEnum.EVENT_CENTER, SelectCafeteriaEnum.CIW, AttendLectureEnum.CS542);
				BuilderWorkshopI builderWorkshopI = new TourBuilder();
				builderWorkshopI.createBuilder(builderI);
				
				System.out.println("\n----------------------------------------");
				System.out.println("CAMPUS TOUR AT BU\n");
				System.out.println(builderI);
				System.out.println("----------------------------------------");
			
			}catch(Exception e) {
				fw.write("Error From Driver code file.");
				MyLogger.writeMessage("Error From Driver code file.", MyLogger.DebugLevel.ERROR);
			}
		} catch (IOException e) {
			System.err.println("IO error from driver code.");
			e.printStackTrace();
		}
	}
	public String toString() {
		return "Driver code";
	}
}
