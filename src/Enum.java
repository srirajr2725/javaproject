import java.util.EnumSet;

enum days{

    MONDAY,TEUSDAY,WEDNSDAY,THURDSDAY,FRIDAY,SATURDAY,SUNDAY


}


public class Enum {
    public static void main(String[] args) {

        days day=days.FRIDAY;
//        System.out.println(day);
//        for(days d:days.values())
//        {
//            System.out.println(d);
//        }

        EnumSet<days> weekends= EnumSet.of(days.SATURDAY,days.SUNDAY);
        System.out.println(weekends);
        EnumSet<days>weekdays=EnumSet.complementOf(weekends);
        System.out.println(weekdays);
        EnumSet<days>alldays=EnumSet.allOf(days.class);
        System.out.println(alldays);
        EnumSet<days>mdweek=EnumSet.range(days.TEUSDAY,days.THURDSDAY);
        System.out.println(mdweek);
    }
}
