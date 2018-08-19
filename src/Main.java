import templateMethod.ElizasDay;
import templateMethod.MyDay;
import templateMethod.TypeOfTransport;
import templateMethod.WeekDay;

public class Main {

    public static void main(String[] argv){
        WeekDay myDay = new MyDay();
        myDay.startTheDay(TypeOfTransport.CAR);
        WeekDay elizasDay = new ElizasDay();
        elizasDay.startTheDay(TypeOfTransport.TRAM);
    }
}
