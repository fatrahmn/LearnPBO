package method;

public class Method {
    public static void main(String[] args) {

        //calling method
        greeting();

        //calling method with parameter
        greetingWithName("Pedi Irawan");

        //calling method with multiple parameter
        greetingMeAge("Nur Fazilla", 17);

        //call method with retrun value
        System.out.println(timesTen(10));
        int one = 1;
        int two = 2;
        int timeTenResult = timesTen(one) + timesTen(two);
        System.out.println(timeTenResult);

        //call squareArea
        System.out.println("Luas Perseginya "+ squareArea(4));

        //call rentangleArea
        System.out.println(rectangleArea(18, 12));

        //call circleArea
        System.out.println("Luas Lingkarannya " + circleArea(7));

        //call
        System.out.println("Luas Lingkarannya " + squareArea(4.25f));

        byte three = 3;
        System.out.println(three);

        //call segitiga
        System.out.println("Luas Segitiga " + segitiga(5,5));

        System.out.println("Volume Tabung "+ tabung(7,7));

    }

    //Declaring method
    static void greeting(){
        System.out.println("Hi!");
        System.out.println("How do you do?");
        System.out.println("It is nice to meet you");
    }

    //Method with parameter
    static void greetingWithName(String name) {
        System.out.println("hi" + name);

    }

    //method with multiple parameter
    static void greetingMeAge (String name, int age){
        System.out.println("Hey, i'm " + name + " and i'm "+ age + " years old");
    }

    //method with retrun value
    static int timesTen(int number){
        int result = number * 10;
        return result;
    }

    static int squareArea(int side){
        return side * side;
    }

    static float squareArea(float side){
        return side * side;
    }

    static int rectangleArea(int width, int height){
        return width * height;
    }

    static double circleArea(int radius){
        return 3.14 * radius * radius;
    }

    static double segitiga(int alas, int tinggi){
        return 0.5 * alas* tinggi;
    }

    static double tabung(int r, int t){
        return 3.14 * r * r * t;
    }



}
