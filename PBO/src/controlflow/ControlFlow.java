package controlflow;

public class ControlFlow {

        public static void main(String[] args){

                byte jhonGrade = 70;

                if (jhonGrade < 40) {
                        System.out.println("John is failed");
                }

                byte annaGrade = 10;

                if (annaGrade > 40) {
                        System.out.println("Anna is passed");
                }else {
                        System.out.println("Anna is failed");
                }

                byte janeGrade = 10;

                if (janeGrade > 80) {
                        System.out.println("Jane got A");
                }else if (janeGrade > 60) {
                        System.out.println("Jane got B");
                }else if (janeGrade > 40) {
                        System.out.println("Jane got C");
                }else {
                        System.out.println("Jane failed the exam");
                }

                byte time = 7;
                String alaramClock = (time < 12) ? "Its still morning" : "Its aleady noon!";

                System.out.println(alaramClock);


        }
}