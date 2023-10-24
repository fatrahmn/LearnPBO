package acceslevel.house;

public class Sis extends Mom {
    int money = super.money;
    //String problem = super.problem;
    //String car = super.car;

    @Override
    public int getMoney() {
        return super.getMoney() + 100;
    }


}
