package templateMethod;

public abstract class WeekDay {

    public final void startTheDay(TypeOfTransport typeOfTransport){
        wakeUp();
        getReady();
        summary(goToWork(typeOfTransport));
        work();
        goHome();
    }

    protected abstract void work();
    protected abstract int goToWork(TypeOfTransport typeOfTransport);

    private void goHome() {
        System.out.println("Going home.");
    }

    private void summary(int time) {
        System.out.println("Time spend for going to work: " + time);
    }

    private void getReady() {
        System.out.println("Preparing to work.");
    }

    private void wakeUp(){
        System.out.println("Waking up.");
    }
}