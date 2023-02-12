package myCampusTour.activities.visitBuildingWatson;

public class VisitBuildingWatson {
    /**
     * @param visitBuildingWatsonIn : check parameter with the enum
     * @return
     */
    public static VisitBuildingWatsonI createVisit(VisitBuildingWatsonEnum visitBuildingWatsonIn){
        
        VisitBuildingWatsonI visitBuildingI = null;
        VisitBuildingWatsonEnum busRide = VisitBuildingWatsonEnum.BUS_RIDE;
        VisitBuildingWatsonEnum onFoot = VisitBuildingWatsonEnum.ON_FOOT;

        if(visitBuildingWatsonIn == busRide){
            visitBuildingI = new BusRide();
        }
        else if(visitBuildingWatsonIn == onFoot){
            visitBuildingI = new onFoot();
        }
        
        return visitBuildingI;

    }

    public String toString(){
        return "Return object of Watson building tour.";
    }
}
