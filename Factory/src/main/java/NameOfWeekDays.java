
public class NameOfWeekDays{
    public WeekDays getDays(int numberOfDay) {
        if(numberOfDay == 1) {
            return new Monday();
        }
        if(numberOfDay == 2) {
            return new Tuesday();
        }
        if(numberOfDay == 3) {
            return new Wednesday();
        }
        if(numberOfDay == 4) {
            return new Thursday();
        }
        if(numberOfDay == 5) {
            return new Friday();
        }
        return null;
    }
}
