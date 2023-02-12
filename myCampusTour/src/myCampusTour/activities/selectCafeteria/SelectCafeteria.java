package myCampusTour.activities.selectCafeteria;

public class SelectCafeteria {
    /**
     * @param selectCafeteriaEnumIn : check parameter with the enum
     * @return
     */
    public static SelectCafeteriaI createCafeVisit(SelectCafeteriaEnum selectCafeteriaEnumIn){
        SelectCafeteriaI SelectCafeteriaI = null;
        SelectCafeteriaEnum ciw = SelectCafeteriaEnum.CIW;
        SelectCafeteriaEnum mView = SelectCafeteriaEnum.MOUNTAIN_VIEW;

        if(selectCafeteriaEnumIn == ciw){
            SelectCafeteriaI = new CIW();
        }
        else if(selectCafeteriaEnumIn == mView){
            SelectCafeteriaI = new MountainView();
        }
        return SelectCafeteriaI;
    }
    public String toString(){
        return "select Cafeteria.";
    }
}
