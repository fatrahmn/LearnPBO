package anstraction.statickeyword;

public class Car {
    static class Engine {
        static byte numberOfTires = 4;
        static String carModel = "SUV";
            byte getNumberOfTires() {
                return numberOfTires; // error
            }
            String getCarModel() {
                return carModel;
            }
        }

    }
