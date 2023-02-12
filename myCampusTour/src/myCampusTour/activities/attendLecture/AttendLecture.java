package myCampusTour.activities.attendLecture;

public class AttendLecture {
    /**
     * @param packGiftEnumIn : check parameter with the enum
     * @return
     */
    public static AttendLectureI createGiftPAddVisit(AttendLectureEnum packGiftEnumIn){
        AttendLectureI attendLectureI = null;
        AttendLectureEnum cs540 = AttendLectureEnum.CS540;
        AttendLectureEnum cs542 = AttendLectureEnum.CS542;

        if(packGiftEnumIn == cs540){
            attendLectureI = new CS540();
        }
        else if(packGiftEnumIn == cs542){
            attendLectureI = new CS542();
        }
        return attendLectureI;
    }
    public String toString(){
        return "Select gift pickup address.";
    }
}
