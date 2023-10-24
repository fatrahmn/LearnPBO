package acceslevel.office;

import acceslevel.house.Mom;

public class App {
    public static void main(String[] args) {
        Mom anna = new Mom();
/*        System.out.println(anna.money);
        System.out.println(anna.isOut);*/

        DadFriend tom = new DadFriend();
        tom.leaveWork();
        tom.leaveWork("Night");
        tom.leaveWork(21);
    }
}
