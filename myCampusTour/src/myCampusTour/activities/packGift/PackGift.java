package myCampusTour.activities.packGift;


public class PackGift {
    /**
     * @param packGiftEnumIn : check parameter with the enum
     * @return
     */
    public static PackGiftI createGiftPAddVisit(PackGiftEnum packGiftEnumIn){
        PackGiftI packGiftI = null;
        PackGiftEnum eventCenter = PackGiftEnum.EVENT_CENTER;
        PackGiftEnum universityUnion = PackGiftEnum.UNIVERSITY_UNION;

        if(packGiftEnumIn == eventCenter){
            packGiftI = new EventCenter();
        }
        else if(packGiftEnumIn == universityUnion){
            packGiftI = new UniversityUnion();
        }
        return packGiftI;
    }
    public String toString(){
        return "Select gift pickup address.";
    }
}
