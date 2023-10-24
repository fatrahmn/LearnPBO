package encapsulation.user;

public class Teller {
    private boolean isWorking;

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
}
