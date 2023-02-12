package myCampusTour.builderWorkshop;

import myCampusTour.activities.attendLecture.AttendLecture;
import myCampusTour.activities.attendLecture.AttendLectureEnum;
import myCampusTour.activities.attendLecture.AttendLectureI;
import myCampusTour.activities.packGift.PackGift;
import myCampusTour.activities.packGift.PackGiftEnum;
import myCampusTour.activities.packGift.PackGiftI;
import myCampusTour.activities.selectCafeteria.SelectCafeteria;
import myCampusTour.activities.selectCafeteria.SelectCafeteriaEnum;
import myCampusTour.activities.selectCafeteria.SelectCafeteriaI;
import myCampusTour.activities.visitBuildingSOM.VisitBuildingSOM;
import myCampusTour.activities.visitBuildingSOM.VisitBuildingSOMEnum;
import myCampusTour.activities.visitBuildingSOM.VisitBuildingSOMI;
import myCampusTour.activities.visitBuildingWatson.VisitBuildingWatson;
import myCampusTour.activities.visitBuildingWatson.VisitBuildingWatsonEnum;
import myCampusTour.activities.visitBuildingWatson.VisitBuildingWatsonI;
import myCampusTour.util.MyLogger;
import myCampusTour.util.Results;

public class Builder implements BuilderI {

    VisitBuildingSOMEnum visitBuildingSOMEnum;
    VisitBuildingWatsonEnum visitBuildingWatsonEnum;
    VisitBuildingSOMI visitBuildingSOMI;
    VisitBuildingWatsonI visitBuildingWatsonI;
    SelectCafeteriaEnum selectCafeteriaEnum;
    SelectCafeteriaI selectCafeteriaI;
    PackGiftEnum packGiftEnum;
    PackGiftI packGiftI;
    AttendLectureEnum attendLectureEnum;
    AttendLectureI attendLectureI;

    

    public static Results results = new Results();

    String output="";

    public Builder(VisitBuildingSOMEnum visitBuildingSOMEnumIn,VisitBuildingWatsonEnum visitBuildingWatsonEnumIn, PackGiftEnum packGiftEnumIn, SelectCafeteriaEnum selectCafeteriaEnumIn, AttendLectureEnum attendLectureEnumIn){
        visitBuildingSOMEnum = visitBuildingSOMEnumIn;
        visitBuildingWatsonEnum = visitBuildingWatsonEnumIn;
        packGiftEnum = packGiftEnumIn;
        selectCafeteriaEnum = selectCafeteriaEnumIn;
        attendLectureEnum = attendLectureEnumIn;

        MyLogger.writeMessage("Builder Constructor", MyLogger.DebugLevel.CONSTRUCTOR);
    }
    
    @Override
    public void buildBuildingSOM() {
        visitBuildingSOMI = VisitBuildingSOM.createVisit(visitBuildingSOMEnum);
        output += "----------------------------------------\nVisiting SOM buildings " +  visitBuildingSOMI.VisitBuildingSOMResults() + "\n";
    }
    
    @Override
    public void buildBuildingWatson() {
        visitBuildingWatsonI = VisitBuildingWatson.createVisit(visitBuildingWatsonEnum);
        output += "----------------------------------------\nVisiting Watson buildings " + visitBuildingWatsonI.VisitBuildingWatsonResults() + "\n";
    }

    @Override
    public void buildGiftLocation() {
        packGiftI = PackGift.createGiftPAddVisit(packGiftEnum);
        output += "----------------------------------------\n"+ packGiftI.selectGiftResults() + "\n";
    }

    @Override
    public void buildCafetaria() {
        selectCafeteriaI = SelectCafeteria.createCafeVisit(selectCafeteriaEnum);
        output += "----------------------------------------\n" + selectCafeteriaI.selectCafeteriaResults() + "\n";
    }

    @Override
    public void buildLecture() {
        attendLectureI = AttendLecture.createGiftPAddVisit(attendLectureEnum);
        output += "----------------------------------------\n" + attendLectureI.selectLectureResults() + "\n";
        
    }
    
    public String toString() {
		output+=results.printTotal();
		return output;
	}
}
