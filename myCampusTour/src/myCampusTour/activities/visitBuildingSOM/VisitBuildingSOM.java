package myCampusTour.activities.visitBuildingSOM;

public class VisitBuildingSOM {
    /**
     * @param visitBuildingSOMIn : check parameter with the enum
     * @return
     */
    public static VisitBuildingSOMI createVisit(VisitBuildingSOMEnum visitBuildingSOMIn){
        
        VisitBuildingSOMI visitBuildingI = null;
        VisitBuildingSOMEnum busRide = VisitBuildingSOMEnum.BUS_RIDE;
        VisitBuildingSOMEnum onFoot = VisitBuildingSOMEnum.ON_FOOT;

        if(visitBuildingSOMIn == busRide){
            visitBuildingI = new BusRide();
        }
        else if(visitBuildingSOMIn == onFoot){
            visitBuildingI = new onFoot();
        }
        
        return visitBuildingI;

    }

    public String toString(){
        return "Return object of building tour.";
    }
}
