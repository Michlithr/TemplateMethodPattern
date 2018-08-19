package templateMethod;

public class ElizasDay extends WeekDay {
    @Override
    protected void work() {
        System.out.println("Fry some fishes, boil some soup and some standing.");
    }

    @Override
    protected int goToWork(TypeOfTransport typeOfTransport) {
        switch (typeOfTransport){
            case CAR:
                return 15;
            case BIKE:
                return 45;
            case TRAM:
                return 30;
            default:
                throw new UnsupportedOperationException("Unknown type of transport");
        }
    }
}
