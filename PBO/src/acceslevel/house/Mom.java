package acceslevel.house;

public class Mom {
    int money = 1000;
    private String problem = "Dad";
    protected boolean isOut = false;

    int getMoney() {
        return money - 100;
    }
}
