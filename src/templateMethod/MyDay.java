package templateMethod;

public class MyDay extends WeekDay {
    @Override
    protected void work() {
        System.out.println("Writing some code, debugging, drinking some tea and talking.");
    }

    @Override
    protected int goToWork(TypeOfTransport typeOfTransport) {
        switch (typeOfTransport){
            case CAR:
                return 30;
            case BIKE:
                return 60;
            case TRAM:
                return 40;
            default:
                    throw new UnsupportedOperationException("Unknown type of transport");
        }
    }
}
